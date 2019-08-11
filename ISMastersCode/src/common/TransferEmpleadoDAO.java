/**
 * 
 */
package common;

import java.util.HashMap;

/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @author usuario_local
 * @!generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
 */
public class TransferEmpleadoDAO {
	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private EmpleadoDAOImpl infoEmployers;

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public TransferEmpleadoDAO() {
		// begin-user-code
		infoEmployers = new EmpleadoDAOImpl();
		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @return
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public boolean updateEmployer() {
		// begin-user-code
		// TODO Apéndice de método generado automáticamente
		return infoEmployers.updateEmployer();
		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @param employerID
	 * @return
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public EmpleadoSA readEmployer(String employerID) {
		// begin-user-code
		if (infoEmployers.readEmployer(employerID)) {
			EmpleadoSA info = infoEmployers.infoEmployer(employerID);
			return info;
		}
		return null;
		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @param empleadoID
	 * @param contrasenia
	 * @param rango
	 * @return
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public boolean createEmployer(String empleadoID, int contrasenia,
			String rango) {
		// begin-user-code
		// TODO Apéndice de método generado automáticamente
		return infoEmployers.createEmployer(empleadoID, contrasenia, rango);
		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @param empleadoID
	 * @param contrasenia
	 * @return
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public boolean deleteEmployer(String empleadoID, int contrasenia) {
		// begin-user-code
		// TODO Apéndice de método generado automáticamente
		return infoEmployers.deleteEmployer(empleadoID, contrasenia);
		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @return
	 * @!generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public HashMap<String, EmpleadoSA> getAllEmployers() {
		// begin-user-code
		// TODO Apéndice de método generado automáticamente
		return infoEmployers.getAllEmployers();
		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @param empleadoID
	 * @param contraseña
	 * @param posicion
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void editEmployer(String empleadoID, int contraseña, String posicion) {
		// begin-user-code
		// TODO Apéndice de método generado automáticamente
		infoEmployers.editEmployer(empleadoID, contraseña, posicion);
		// end-user-code
	}
}