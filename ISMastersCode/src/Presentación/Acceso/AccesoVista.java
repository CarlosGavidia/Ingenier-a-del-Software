/**
 * 
 */
package Presentación.Acceso;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JOptionPane;
import javax.swing.JButton;

import Presentación.AltaBajaCuenta.AltaBajaVista;

import common.TransferUsuarioDAOVista;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @author usuario_local
 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
 */
public class AccesoVista extends JFrame {
	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private TransferUsuarioDAOVista infoTransfer;
	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private JButton botonAcceder;
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
	private JTextField cuadroContraseña;
	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private JOptionPane mostrarMensaje;

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @param infoTransfer
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public AccesoVista(TransferUsuarioDAOVista infoTransfer) {
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
	private void initGUI() {
		// begin-user-code
		this.setTitle("Soft Bank");

		mostrarMensaje = new JOptionPane();

		JPanel mainPanel = new JPanel(new BorderLayout());

		this.setContentPane(mainPanel);

		JPanel centerPanel = new JPanel(new FlowLayout());
		centerPanel.setPreferredSize(new Dimension(150, 125));
		centerPanel.setBorder(BorderFactory.createTitledBorder("Register"));

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

		//SOUTH
		botonAcceder = new JButton("Access");
		botonAcceder.addActionListener(new ActionListener() {

			@SuppressWarnings("static-access")
			@Override
			public void actionPerformed(ActionEvent arg0) {

				try {
					if (!acceder(cuadroID.getText(),
							Integer.parseInt(cuadroContraseña.getText()))) {
						throw new Exception();
					}

				} catch (NumberFormatException e) {

					mostrarMensaje
							.showMessageDialog(
									new JFrame(),
									"The password must contain only numerical caracters",
									"Wrong Password",
									JOptionPane.WARNING_MESSAGE);
				} catch (Exception n) {
					mostrarMensaje.showMessageDialog(new JFrame(),
							"Wrong user/password", "Wrong Access",
							JOptionPane.ERROR_MESSAGE);
				}
			}

		});
		mainPanel.add(botonAcceder, BorderLayout.PAGE_END);

		mainPanel.add(centerPanel, BorderLayout.CENTER);

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
	 * @param nombre
	 * @param contraseña
	 * @return
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	@SuppressWarnings("static-access")
	public boolean acceder(String nombre, int contraseña) {
		// begin-user-code
		if (infoTransfer.acceder(nombre, contraseña)) {
			JOptionPane accesoCorrecto = new JOptionPane();
			accesoCorrecto.showMessageDialog(new JFrame(), "Acceso correcto",
					"Welcome", JOptionPane.INFORMATION_MESSAGE);
			dispose();

			if (infoTransfer.infoEmpleado(nombre).getWorkPosition()
					.equalsIgnoreCase("Director")
					|| infoTransfer.infoEmpleado(nombre).getWorkPosition()
							.equalsIgnoreCase("Gerente")
					|| infoTransfer.infoEmpleado(nombre).getWorkPosition()
							.equalsIgnoreCase("Becario")) {
				AltaBajaVista acceso = new AltaBajaVista(infoTransfer);
			}
			return true;
		} else
			return false;
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