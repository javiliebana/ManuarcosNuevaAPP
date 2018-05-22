package Main;

import Controlador.Controlador;
import Modelo.ConexionOracle;
import Modelo.Modelo;
import Vistas.DirInicio;
import Vistas.Empresa;
import Vistas.GestionTabla;
import Vistas.Inicio;
import Vistas.ProfVista;

public class Test {

	public static void main(String[] args) {
		Inicio vInicio = new Inicio();
		Empresa vEmpresa = new Empresa();
		DirInicio vDirector = new DirInicio();
		GestionTabla Modificar = new GestionTabla();
		ProfVista vProfesor = new ProfVista();
		Controlador controlador = new Controlador();
		Modelo miModelo = new Modelo();
		ConexionOracle Login = new ConexionOracle();
		Login.datosLogin("Pedro", "tutorwe");
		Login.datosLogin("Ana", "directora");
		Login.datosLogin("admin", "admin");
		miModelo.setDirInicio(vDirector);
		miModelo.setInicio(vInicio);
		miModelo.setEmpresa(vEmpresa);
		miModelo.setGestion(Modificar);
		miModelo.setProfVista(vProfesor);
		miModelo.setConexionOracle(Login);

		controlador.setDirInicio(vDirector);
		controlador.setEmpresa(vEmpresa);
		controlador.setGestionTabla(Modificar);
		controlador.setProfVista(vProfesor);
		controlador.setInicio(vInicio);
		controlador.setConexionOracle(Login);

		vDirector.setModelo(miModelo);
		vEmpresa.setModelo(miModelo);
		Modificar.setModelo(miModelo);
		vProfesor.setModelo(miModelo);
		vInicio.setModelo(miModelo);
		Login.setModelo(miModelo);

		vDirector.setControlador(controlador);
		vEmpresa.setControlador(controlador);
		Modificar.setControlador(controlador);
		vProfesor.setControlador(controlador);
		vInicio.setControlador(controlador);
		Login.setControlador(controlador);

		vInicio.setVisible(true);

	}

}
