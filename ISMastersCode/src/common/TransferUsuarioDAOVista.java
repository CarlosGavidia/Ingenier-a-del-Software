/**
 * 
 */
package common;

/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @author usuario_local
 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
 */
public class TransferUsuarioDAOVista {
	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private UsuarioControlador ctrl;

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @param ctrl
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public TransferUsuarioDAOVista(UsuarioControlador ctrl) {
		// begin-user-code
		// TODO Apéndice de constructor generado automáticamente
		this.ctrl = ctrl;
		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @param identificador
	 * @param contraseña
	 * @return
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public boolean acceder(String identificador, int contraseña) {
		// begin-user-code
		// TODO Apéndice de método generado automáticamente
		return ctrl.acceder(identificador, contraseña);
		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void update() {
		// begin-user-code
		// TODO Apéndice de método generado automáticamente
		ctrl.update();
		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @param usuarioID
	 * @param pin
	 * @return
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public boolean comprobarUsuarioID(String usuarioID, int pin) {
		// begin-user-code
		// TODO Auto-generated method stub
		return ctrl.comprobarUsuarioID(usuarioID, pin);
		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @param empleadoID
	 * @param pasword
	 * @return
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public boolean comprobarEmpleadoID(String empleadoID, int pasword) {
		// begin-user-code
		// TODO Auto-generated method stub
		return ctrl.comprobarEmpleadoID(empleadoID, pasword);
		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @param empleadoID
	 * @param password
	 * @return
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public boolean comprobarContraseña(String empleadoID, int password) {
		// begin-user-code
		// TODO Auto-generated method stub
		return ctrl.comprobarContraseña(empleadoID, password);
		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @param usuarioID
	 * @param pin
	 * @return
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public boolean comprobarPin(String usuarioID, int pin) {
		// begin-user-code
		// TODO Auto-generated method stub
		return ctrl.comprobarPin(usuarioID, pin);
		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @param empleadoID
	 * @param password
	 * @param rango
	 * @return
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public boolean darAltaEmpleado(String empleadoID, int password, String rango) {
		// begin-user-code
		// TODO Apéndice de método generado automáticamente
		return ctrl.darAltaEmpleado(empleadoID, password, rango);
		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @param empleadoID
	 * @param password
	 * @return
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public boolean darBajaEmpleado(String empleadoID, int password) {
		// begin-user-code
		// TODO Apéndice de método generado automáticamente
		return ctrl.darBajaEmpleado(empleadoID, password);
		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @param usuarioID
	 * @param pin
	 * @return
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public boolean darAltaUsuario(String usuarioID, int pin) {
		// begin-user-code
		// TODO Apéndice de método generado automáticamente
		return ctrl.darAltaUsuario(usuarioID, pin);
		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @param usuarioID
	 * @param pin
	 * @return
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public boolean darBajaUsuario(String usuarioID, int pin) {
		// begin-user-code
		// TODO Apéndice de método generado automáticamente
		return ctrl.darBajaUsuario(usuarioID, pin);
		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @param usuarioID
	 * @param pin
	 * @return
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public String asesoramiento(String usuarioID, int pin) {
		// begin-user-code
		// TODO Auto-generated method stub
		return null;
		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @param usuarioID
	 * @param pin
	 * @param fecha
	 * @return
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public String actualizarCartilla(String usuarioID, int pin, String fecha) {
		// begin-user-code
		// TODO Auto-generated method stub
		return null;
		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @param usuarioID
	 * @param pin
	 * @param numAcciones
	 * @return
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public int comprarAcciones(String usuarioID, int pin, int numAcciones) {
		// begin-user-code
		// TODO Auto-generated method stub
		return 0;
		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @param usuarioID
	 * @param pin
	 * @param numAcciones
	 * @param resultado
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void venderAcciones(String usuarioID, int pin, int numAcciones,
			int resultado) {
		// begin-user-code
		// TODO Auto-generated method stub

		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @param usuarioID
	 * @param pin
	 * @return
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public String asesorarAcciones(String usuarioID, int pin) {
		// begin-user-code
		// TODO Auto-generated method stub
		return null;
		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @param usuarioID
	 * @param pin
	 * @param money
	 * @return
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public boolean ingresarDinero(String usuarioID, int pin, float money) {
		// begin-user-code
		// TODO Auto-generated method stub
		return false;
		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @param usuarioID
	 * @param pin
	 * @param money
	 * @return
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public boolean retirarDinero(String usuarioID, int pin, float money) {
		// begin-user-code
		// TODO Auto-generated method stub
		return false;
		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @param usuarioID
	 * @param pin
	 * @return
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public float comprobarSaldo(String usuarioID, int pin) {
		// begin-user-code
		// TODO Auto-generated method stub
		return 0;
		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @param usuarioID
	 * @param pin
	 * @param moneyQuantity
	 * @param destiny
	 * @param correct
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void realizarTransferencia(String usuarioID, int pin,
			float moneyQuantity, UsuarioSA destiny, boolean correct) {
		// begin-user-code
		// TODO Auto-generated method stub

		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @param usuarioID
	 * @param pin
	 * @param prestamo
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void solicitudHipoteca(String usuarioID, int pin, float prestamo) {
		// begin-user-code
		// TODO Auto-generated method stub

		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @param usuarioID
	 * @param pin
	 * @return
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public boolean comprobacionViabilidadHipoteca(String usuarioID, int pin) {
		// begin-user-code
		// TODO Auto-generated method stub
		return false;
		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @param usuarioID
	 * @param pin
	 * @return
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public boolean comprobacionViabilidadPrestamo(String usuarioID, int pin) {
		// begin-user-code
		// TODO Auto-generated method stub
		return false;
		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @param usuarioID
	 * @param pin
	 * @param prestamo
	 * @param meses
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void solicitaPrestamo(String usuarioID, int pin, float prestamo,
			int meses) {
		// begin-user-code
		// TODO Auto-generated method stub

		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @param empleadoID
	 * @return
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public EmpleadoSA infoEmpleado(String empleadoID) {
		// begin-user-code
		// TODO Auto-generated method stub
		return ctrl.infoEmpleado(empleadoID);
		// end-user-code
	}
}