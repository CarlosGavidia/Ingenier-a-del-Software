/**
 * 
 */
package Presentación.AltaBajaCuenta;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JFrame;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JOptionPane;
import common.TransferUsuarioDAOVista;

/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @author usuario_local
 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
 */
public class AltaBajaVista extends JFrame {
	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private JButton botonCrearEmpleado;
	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private JButton botonCrearUsuario;
	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private JButton botonEliminarEmpleado;
	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private JButton botonEliminarUsuario;
	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private JTextField cuadroContraseña;
	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private JTextField cuadroID;
	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private JTextField cuadroRango;
	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private JOptionPane mostrarMensaje;

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private TransferUsuarioDAOVista infoTransfer;

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @param infoTransfer
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public AltaBajaVista(TransferUsuarioDAOVista infoTransfer) {
		// begin-user-code
		this.infoTransfer = infoTransfer;
		initGUI();
		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void initGUI() {
		// begin-user-code
		this.setTitle("Soft Bank");

		mostrarMensaje = new JOptionPane();

		JPanel mainPanel = new JPanel(new FlowLayout());

		this.setContentPane(mainPanel);

		JPanel centerPanel = new JPanel(new FlowLayout());
		centerPanel.setPreferredSize(new Dimension(225, 125));
		centerPanel.setBorder(BorderFactory.createTitledBorder("Credenciales"));

		//WEST
		JLabel westPanel = new JLabel("cuadro ID");
		centerPanel.add(westPanel);
		cuadroID = new JTextField("");
		cuadroID.setPreferredSize(new Dimension(100, 20));
		centerPanel.add(cuadroID);

		//EAST
		JLabel eastPanel = new JLabel("Contraseña");
		centerPanel.add(eastPanel);
		cuadroContraseña = new JTextField("");
		cuadroContraseña.setPreferredSize(new Dimension(100, 20));
		centerPanel.add(cuadroContraseña);

		//EAST2
		JLabel eastPanel2 = new JLabel("Rango Laboral");
		centerPanel.add(eastPanel2);
		cuadroRango = new JTextField("");
		cuadroRango.setPreferredSize(new Dimension(100, 20));
		centerPanel.add(cuadroRango);

		//SOUTH
		botonCrearUsuario = new JButton("Crear Usuario");
		botonCrearUsuario.addActionListener(new ActionListener() {

			@SuppressWarnings("static-access")
			@Override
			public void actionPerformed(ActionEvent arg0) {

				try {
					darAltaUsuario(cuadroID.getText(),
							Integer.parseInt(cuadroContraseña.getText()));

				}

				catch (NumberFormatException e) {

					mostrarMensaje
							.showMessageDialog(
									new JFrame(),
									"The password must contain only numerical caracters",
									"Wrong Password",
									JOptionPane.WARNING_MESSAGE);
				}
			}

		});
		mainPanel.add(botonCrearUsuario);

		botonEliminarUsuario = new JButton("Eliminar Usuario");
		botonEliminarUsuario.addActionListener(new ActionListener() {

			@SuppressWarnings("static-access")
			@Override
			public void actionPerformed(ActionEvent arg0) {

				try {

					darBajaUsuario(cuadroID.getText(),
							Integer.parseInt(cuadroContraseña.getText()));

				} catch (NumberFormatException e) {

					mostrarMensaje
							.showMessageDialog(
									new JFrame(),
									"The password must contain only numerical caracters",
									"Wrong Password",
									JOptionPane.WARNING_MESSAGE);
				}

			}

		});
		mainPanel.add(botonEliminarUsuario);

		botonCrearEmpleado = new JButton("Crear Empleado");
		botonCrearEmpleado.addActionListener(new ActionListener() {

			@SuppressWarnings("static-access")
			@Override
			public void actionPerformed(ActionEvent arg0) {

				try {
					if (!cuadroRango.getText().equalsIgnoreCase("asesor")
							&& !cuadroRango.getText().equalsIgnoreCase(
									"becario")
							&& !cuadroRango.getText()
									.equalsIgnoreCase("broker")
							&& !cuadroRango.getText().equalsIgnoreCase(
									"director")
							&& !cuadroRango.getText().equalsIgnoreCase(
									"gerente")
							&& !cuadroRango.getText().equalsIgnoreCase(
									"prestamista")) {
						mostrarMensaje.showMessageDialog(new JFrame(),
								"You must include a valid work position",
								"Wrong Work Position",
								JOptionPane.ERROR_MESSAGE);
					} else
						darAltaEmpleado(cuadroID.getText(),
								Integer.parseInt(cuadroContraseña.getText()),
								cuadroRango.getText());

				} catch (NumberFormatException e) {

					mostrarMensaje
							.showMessageDialog(
									new JFrame(),
									"The password must contain only numerical caracters",
									"Wrong Password",
									JOptionPane.WARNING_MESSAGE);
				}

			}

		});
		mainPanel.add(botonCrearEmpleado);

		botonEliminarEmpleado = new JButton("Eliminar Empleado");
		botonEliminarEmpleado.addActionListener(new ActionListener() {

			@SuppressWarnings("static-access")
			@Override
			public void actionPerformed(ActionEvent arg0) {

				try {
					darBajaEmpleado(cuadroID.getText(),
							Integer.parseInt(cuadroContraseña.getText()));
				} catch (NumberFormatException e) {

					mostrarMensaje
							.showMessageDialog(
									new JFrame(),
									"The password must contain only numerical caracters",
									"Wrong Password",
									JOptionPane.WARNING_MESSAGE);
				}
			}

		});
		mainPanel.add(botonEliminarEmpleado);

		mainPanel.add(centerPanel);

		this.addWindowListener(new WindowListener() {

			@Override
			public void windowClosing(WindowEvent e) {
				quit();
			}

			@Override
			public void windowOpened(WindowEvent e) {
			}

			@Override
			public void windowIconified(WindowEvent e) {
			}

			@Override
			public void windowDeiconified(WindowEvent e) {
			}

			@Override
			public void windowDeactivated(WindowEvent e) {
			}

			@Override
			public void windowClosed(WindowEvent e) {
			}

			@Override
			public void windowActivated(WindowEvent e) {
			}

		});

		this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		this.pack();
		this.setVisible(true);
		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @param empleadoID
	 * @param contrasenia
	 * @param rango
	 * @!generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	@SuppressWarnings("static-access")
	public void darAltaEmpleado(String empleadoID, int contrasenia, String rango) {
		// begin-user-code
		if (infoTransfer.acceder(empleadoID, contrasenia)) {
			mostrarMensaje.showMessageDialog(new JFrame(), "Attention",
					"This user already exists", JOptionPane.WARNING_MESSAGE);
		} else {

			infoTransfer.darAltaEmpleado(empleadoID, contrasenia, rango);
			mostrarMensaje.showMessageDialog(new JFrame(), "Employed created",
					"Welcome to Soft Bank", JOptionPane.WARNING_MESSAGE);

		}
		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @param usuarioID
	 * @param contrasenia
	 * @!generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	@SuppressWarnings("static-access")
	public void darAltaUsuario(String usuarioID, int contrasenia) {
		// begin-user-code
		if (infoTransfer.acceder(usuarioID, contrasenia)) {
			mostrarMensaje.showMessageDialog(new JFrame(),
					"This user already exists", "Attention",
					JOptionPane.WARNING_MESSAGE);
		} else {

			infoTransfer.darAltaUsuario(usuarioID, contrasenia);

			mostrarMensaje.showMessageDialog(new JFrame(), "User created",
					"Welcome to Soft Bank", JOptionPane.WARNING_MESSAGE);
		}

		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @param userID
	 * @param contrasenia
	 * @!generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	@SuppressWarnings("static-access")
	public void darBajaEmpleado(String userID, int contrasenia) {
		// begin-user-code
		if (!infoTransfer.acceder(userID, contrasenia)) {
			mostrarMensaje.showMessageDialog(new JFrame(),
					"This user does not exists", "Attention",
					JOptionPane.WARNING_MESSAGE);
		} else {
			infoTransfer.darBajaEmpleado(userID, contrasenia);
			mostrarMensaje.showMessageDialog(new JFrame(), "Employee deleted",
					"ByeBye to Soft Bank", JOptionPane.WARNING_MESSAGE);
		}

		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @param idUsuario
	 * @param contrasenia
	 * @!generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	@SuppressWarnings("static-access")
	public void darBajaUsuario(String idUsuario, int contrasenia) {
		// begin-user-code
		if (!infoTransfer.comprobarUsuarioID(idUsuario, contrasenia)) {
			mostrarMensaje.showMessageDialog(new JFrame(),
					"This user does not exists", "Attention",
					JOptionPane.WARNING_MESSAGE);
		} else {
			infoTransfer.darBajaUsuario(idUsuario, contrasenia);
			mostrarMensaje.showMessageDialog(new JFrame(), "User deleted",
					"ByeBye to Soft Bank", JOptionPane.WARNING_MESSAGE);
		}

		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void quit() {
		// begin-user-code
		int n = JOptionPane.showOptionDialog(new JFrame(),
				"Are sure you want to quit?", "Quit",
				JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null,
				null, null);
		if (n == 0) {
			infoTransfer.update();
			setVisible(true);
			dispose();

		}
		// end-user-code
	}
}