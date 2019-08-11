package Main;

import Presentaci�n.Acceso.AccesoVista;
import common.*;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		//-----> Integraci�n <-----------
		TransferUsuarioDAO transferIntegracion = new TransferUsuarioDAO();
		TransferEmpleadoDAO transferIntegracionEm = new TransferEmpleadoDAO();
		
		//-----> Negocio <-----------
		UsuarioControlador controladorNegocio = new UsuarioControlador(transferIntegracion, transferIntegracionEm);
		TransferUsuarioDAOVista transferVista = new TransferUsuarioDAOVista(controladorNegocio);
		
		//-----> Presentaci�n <-----------
		AccesoVista vistaPresentacion = new AccesoVista(transferVista);
	}

}
