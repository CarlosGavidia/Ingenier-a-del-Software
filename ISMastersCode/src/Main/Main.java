package Main;

import Presentación.Acceso.AccesoVista;
import common.*;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		//-----> Integración <-----------
		TransferUsuarioDAO transferIntegracion = new TransferUsuarioDAO();
		TransferEmpleadoDAO transferIntegracionEm = new TransferEmpleadoDAO();
		
		//-----> Negocio <-----------
		UsuarioControlador controladorNegocio = new UsuarioControlador(transferIntegracion, transferIntegracionEm);
		TransferUsuarioDAOVista transferVista = new TransferUsuarioDAOVista(controladorNegocio);
		
		//-----> Presentación <-----------
		AccesoVista vistaPresentacion = new AccesoVista(transferVista);
	}

}
