/**
 * 
 */
package common;

import java.util.HashMap;

/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @author usuario_local
 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
 */
public class TransferUsuarioDAO {
	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private UsuarioDAOImpl infoUsers;

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public TransferUsuarioDAO() {
		// begin-user-code
		// TODO Apéndice de constructor generado automáticamente
		infoUsers = new UsuarioDAOImpl();
		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @return
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public boolean updateUser() {
		// begin-user-code
		// TODO Apéndice de método generado automáticamente
		return infoUsers.updateUser();
		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @param userID
	 * @return
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public UsuarioSA readUser(String userID) {
		// begin-user-code
		// TODO Apéndice de método generado automáticamente
		if (infoUsers.readUser(userID)) {
			UsuarioSA info = infoUsers.infoUser(userID);
			return info;
		}
		return null;
		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @param usuarioID
	 * @param contrasenia
	 * @return
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public boolean createUser(String usuarioID, int contrasenia) {
		// begin-user-code
		// TODO Apéndice de método generado automáticamente
		return infoUsers.createUser(usuarioID, contrasenia);
		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @param usuarioID
	 * @param contrasenia
	 * @return
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public boolean deleteUser(String usuarioID, int contrasenia) {
		// begin-user-code
		// TODO Apéndice de método generado automáticamente
		return infoUsers.deleteUser(usuarioID, contrasenia);
		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @return
	 * @!generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public HashMap<String, UsuarioSA> getAllUser() {
		// begin-user-code
		// TODO Apéndice de método generado automáticamente
		return infoUsers.getAllUsers();
		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @param userID
	 * @param capital
	 * @param pin
	 * @param acciones
	 * @param hipoteca
	 * @param prestamo
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void editUser(String userID, float capital, int pin, int acciones,
			float hipoteca, float prestamo) {
		// begin-user-code
		// TODO Apéndice de método generado automáticamente
		infoUsers.editUser(userID, pin, capital, acciones, hipoteca, prestamo);
		// end-user-code
	}
}