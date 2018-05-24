package Main;

import Controlador.Controlador;
import Modelo.Modelo;
import Vistas.DirInicio;
import Vistas.Empresa;
import Vistas.GestionTabla;
import Vistas.Inicio;
import Vistas.ProfVista;
import Vistas.registro;

public class Test {

	public static void main(String[] args) {
		//Objetos 
		Inicio vInicio = new Inicio();
		Empresa vEmpresa = new Empresa();
		DirInicio vDirector = new DirInicio();
		GestionTabla Modificar = new GestionTabla();
		ProfVista vProfesor = new ProfVista();
		Controlador controlador = new Controlador();
		Modelo miModelo = new Modelo();
		registro vRegistro = new registro();
	
		//Modelo
		miModelo.setDirInicio(vDirector);
		miModelo.setInicio(vInicio);
		miModelo.setEmpresa(vEmpresa);
		miModelo.setGestion(Modificar);
		miModelo.setProfVista(vProfesor);
		miModelo.setControlador(controlador);
		miModelo.setRegistro(vRegistro);

		//Controlador
		controlador.setDirInicio(vDirector);
		controlador.setEmpresa(vEmpresa);
		controlador.setGestionTabla(Modificar);
		controlador.setProfVista(vProfesor);
		controlador.setInicio(vInicio);
		controlador.setModelo(miModelo);
		controlador.setregistro(vRegistro);
		
		//vistas modelo
		vDirector.setModelo(miModelo);
		vEmpresa.setModelo(miModelo);
		Modificar.setModelo(miModelo);
		vProfesor.setModelo(miModelo);
		vInicio.setModelo(miModelo);
		vRegistro.setModelo(miModelo);
		
		//vistas controlador
		vDirector.setControlador(controlador);
		vEmpresa.setControlador(controlador);
		Modificar.setControlador(controlador);
		vProfesor.setControlador(controlador);
		vInicio.setControlador(controlador);
		vRegistro.setControlador(controlador);

		vInicio.setVisible(true);

	}

}
