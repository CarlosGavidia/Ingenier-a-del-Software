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
public class EmpleadoDAOImpl implements EmpleadoDAO {
	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @!generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private HashMap<String, EmpleadoSA> empleados;

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public EmpleadoDAOImpl() {
		// begin-user-code
		empleados = new HashMap<String, EmpleadoSA>();
		try {
			BufferedReader entrada = new BufferedReader(new FileReader(
					"Empleados.txt"));
			String s;
			try {
				s = entrada.readLine();

				while (!s.equals("-1")) {
					EmpleadoSA user = new EmpleadoSA(s);
					String information[] = s.split(" ");
					user.setName(information[0]);
					user.setPassword(Integer.parseInt(information[1]));
					user.setWorkPosition(information[2]);
					empleados.put(information[0], user);
					s = entrada.readLine();
				}
				entrada.close();
			} catch (IOException e) {

			}

		} catch (FileNotFoundException e) {
			try {
				FileWriter archivo = new FileWriter("Empleados.txt");
				archivo.write("-1");
				archivo.close();
			} catch (IOException e1) {

			}
		}
		// end-user-code
	}

	/** 
	 * (non-Javadoc)
	 * @see EmpleadoDAO#getAllEmployers()
	 * @!generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public HashMap<String, EmpleadoSA> getAllEmployers() {
		// begin-user-code
		return empleados;
		// end-user-code
	}

	/** 
	 * (non-Javadoc)
	 * @see EmpleadoDAO#deleteEmployer(String employerID, int contrasenia)
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public boolean deleteEmployer(String employerID, int contrasenia) {
		// begin-user-code
		if (empleados.containsKey(employerID)) {
			empleados.remove(employerID);
			updateEmployer();
			return true;
		}
		return false;
		// end-user-code
	}

	/** 
	 * (non-Javadoc)
	 * @see EmpleadoDAO#updateEmployer()
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public boolean updateEmployer() {
		// begin-user-code
		FileWriter archivo;
		try {
			archivo = new FileWriter("Empleados.txt");
			for (Map.Entry<String, EmpleadoSA> entry : empleados.entrySet()) {
				archivo.write(entry.getKey());
				EmpleadoSA info = entry.getValue();
				archivo.write(" " + info.getPassword());
				archivo.write(" " + info.getWorkPosition());
				archivo.write("\r\n");
			}
			archivo.write("-1");
			archivo.close();
			return true;
		} catch (IOException e) {
		}

		return false;
		// end-user-code
	}

	/** 
	 * (non-Javadoc)
	 * @see EmpleadoDAO#createEmployer(String employerID, int contrasenia, String rango)
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public boolean createEmployer(String employerID, int contrasenia,
			String rango) {
		// begin-user-code
		if (!empleados.containsKey(employerID)) {
			EmpleadoSA user = new EmpleadoSA(employerID, contrasenia, rango);
			empleados.put(employerID, user);
			updateEmployer();
			return true;
		}
		return false;
		// end-user-code
	}

	/** 
	 * (non-Javadoc)
	 * @see EmpleadoDAO#readEmployer(String employerID)
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public boolean readEmployer(String employerID) {
		// begin-user-code
		if (empleados.containsKey(employerID)) {
			return true;
		}
		return false;
		// end-user-code
	}

	/** 
	 * (non-Javadoc)
	 * @see EmpleadoDAO#infoEmployer(String employerID)
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public EmpleadoSA infoEmployer(String employerID) {
		// begin-user-code
		return empleados.get(employerID);
		// end-user-code
	}

	/** 
	 * (non-Javadoc)
	 * @see EmpleadoDAO#editEmployer(String employerID, int password, String workPosition)
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void editEmployer(String employerID, int password,
			String workPosition) {
		// begin-user-code
		if (empleados.containsKey(employerID)) {
			EmpleadoSA employer = empleados.get(employerID);
			if (password != -1) {
				employer.setPassword(password);
			}
			if (workPosition != null) {
				employer.setWorkPosition(workPosition);
				empleados.put(employerID, employer);
			}
		}
		// end-user-code
	}
}