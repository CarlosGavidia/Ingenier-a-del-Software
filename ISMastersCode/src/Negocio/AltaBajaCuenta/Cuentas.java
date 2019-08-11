/**
 * 
 */
package Negocio.AltaBajaCuenta;

import common.TransferUsuarioDAO;
import common.TransferEmpleadoDAO;
import java.util.Set;
import common.UsuarioControlador;
import common.UsuarioSA;

/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @author usuario_local
 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
 */
public class Cuentas {
	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private TransferUsuarioDAO transfer;
	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private TransferEmpleadoDAO transferEm;

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @param transfer
	 * @param transferEm
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public Cuentas(TransferUsuarioDAO transfer, TransferEmpleadoDAO transferEm) {
		// begin-user-code
		this.transfer = transfer;
		this.transferEm = transferEm;
		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @param nombre
	 * @param contrasenia
	 * @return
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public boolean crearCuentaUsuario(String nombre, int contrasenia) {
		// begin-user-code
		// TODO Auto-generated method stub
		return transfer.createUser(nombre, contrasenia);
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
	public boolean crearCuentaEmpleado(String empleadoID, int contrasenia,
			String rango) {
		// begin-user-code
		// TODO Auto-generated method stub
		return transferEm.createEmployer(empleadoID, contrasenia, rango);
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
	public boolean eliminarCuentaEmpleado(String empleadoID, int contrasenia) {
		// begin-user-code
		// TODO Auto-generated method stub
		return transferEm.deleteEmployer(empleadoID, contrasenia);
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
	public boolean eliminarCuentaUsuario(String usuarioID, int contrasenia) {
		// begin-user-code
		// TODO Auto-generated method stub
		return transfer.deleteUser(usuarioID, contrasenia);
		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @param userID
	 * @return
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public boolean cuentaExistente(String userID) {
		// begin-user-code
		// TODO Auto-generated method stub
		return transfer.readUser(userID) != null
				|| transferEm.readEmployer(userID) != null;
		// end-user-code
	}
}