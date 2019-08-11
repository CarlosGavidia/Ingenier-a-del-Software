/**
 * 
 */
package common;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @author usuario_local
 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
 */
public class UsuarioDAOImpl implements UsuarioDAO {
	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @!generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private HashMap<String, UsuarioSA> usuarios;

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public UsuarioDAOImpl() {
		// begin-user-code
		usuarios = new HashMap<String, UsuarioSA>();
		try {
			BufferedReader entrada = new BufferedReader(new FileReader(
					"Usuarios.txt"));
			String s;
			try {
				s = entrada.readLine();

				while (!s.equals("-1")) {
					String informationPrev[] = s.split(" "); //Para evitar
					UsuarioSA user = new UsuarioSA(s,
							Integer.parseInt(informationPrev[1]));
					String information[] = s.split(" ");
					user.setName(information[0]);
					user.setPin(Integer.parseInt(information[1]));
					user.setCapital(Float.parseFloat((information[2])));
					user.setActions(Integer.parseInt(information[3]));
					user.setMortgage(Float.parseFloat(information[4]));
					user.setLoan(Float.parseFloat(information[5]));
					usuarios.put(information[0], user);
					s = entrada.readLine();
				}
				entrada.close();
			} catch (IOException e) {
				// TODO Bloque catch generado automáticamente
			}

		} catch (FileNotFoundException e) {
			try {
				FileWriter archivo = new FileWriter("Usuarios.txt");
				archivo.write("-1");
				archivo.close();
			} catch (IOException e1) {

			}
		}

		// end-user-code
	}

	/** 
	 * (non-Javadoc)
	 * @see UsuarioDAO#getAllUsers()
	 * @!generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public HashMap<String, UsuarioSA> getAllUsers() {
		// begin-user-code
		// TODO Apéndice de método generado automáticamente
		return usuarios;
		// end-user-code
	}

	/** 
	 * (non-Javadoc)
	 * @see UsuarioDAO#deleteUser(String usuarioID, int pin)
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public boolean deleteUser(String usuarioID, int pin) {
		// begin-user-code
		if (usuarios.containsKey(usuarioID)) {
			usuarios.remove(usuarioID);
			updateUser();
			return true;
		}

		return false;
		// end-user-code
	}

	/** 
	 * (non-Javadoc)
	 * @see UsuarioDAO#updateUser()
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public boolean updateUser() {
		// begin-user-code
		FileWriter archivo;
		try {
			archivo = new FileWriter("Usuarios.txt");
			for (Map.Entry<String, UsuarioSA> entry : usuarios.entrySet()) {
				archivo.write(entry.getKey());
				UsuarioSA info = entry.getValue();
				archivo.write(" " + info.getPin());
				archivo.write(" " + info.getCapital());
				archivo.write(" " + info.getActions());
				archivo.write(" " + info.getMortgage());
				archivo.write(" " + info.getLoan());
				archivo.write("\r\n");
			}

			archivo.write("-1");
			archivo.close();
			return true;
		} catch (IOException e) {
			// TODO Bloque catch generado automáticamente

		}

		return false;
		// end-user-code
	}

	/** 
	 * (non-Javadoc)
	 * @see UsuarioDAO#createUser(String usuarioID, int pin)
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public boolean createUser(String usuarioID, int pin) {
		// begin-user-code
		if (!usuarios.containsKey(usuarioID)) {
			UsuarioSA user = new UsuarioSA(usuarioID, pin);
			usuarios.put(usuarioID, user);
			updateUser();
			return true;
		}
		return false;
		// end-user-code
	}

	/** 
	 * (non-Javadoc)
	 * @see UsuarioDAO#readUser(String userID)
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public boolean readUser(String userID) {
		// begin-user-code
		if (usuarios.containsKey(userID)) {
			return true;
		}

		return false;
		// end-user-code
	}

	/** 
	 * (non-Javadoc)
	 * @see UsuarioDAO#infoUser(String userID)
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public UsuarioSA infoUser(String userID) {
		// begin-user-code
		return usuarios.get(userID);
		// end-user-code
	}

	/** 
	 * (non-Javadoc)
	 * @see UsuarioDAO#editUser(String userID, int contraseña, float capital, int acciones, float hipoteca, float prestamo)
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void editUser(String userID, int contraseña, float capital,
			int acciones, float hipoteca, float prestamo) {
		// begin-user-code
		if (usuarios.containsKey(userID)) {
			UsuarioSA user = usuarios.get(userID);
			if (contraseña != -1) {
				user.setPin(contraseña);
			}
			if (capital != -1) {
				user.setCapital(capital);
			}
			if (acciones != -1) {
				user.setActions(acciones);
			}
			if (hipoteca != -1) {
				user.setMortgage(hipoteca);
			}
			if (prestamo != -1) {
				user.setLoan(prestamo);
			}
			usuarios.put(userID, user);
		}
		// end-user-code
	}
}