package Controlador;

import javax.swing.JOptionPane;

import Modelo.ConexionOracle;
import Vistas.DirInicio;
import Vistas.Empresa;
import Vistas.GestionTabla;
import Vistas.Inicio;
import Vistas.ProfVista;

//cambio de repositorio
public class Controlador {
	private DirInicio vDirector;
	private Empresa vEmpresa;
	private GestionTabla Modificar;
	private ProfVista vProfesor;
	private Inicio vInicio;
	public ConexionOracle conexion;
	public int contador = 0;

	public void setDirInicio(DirInicio vDirector) {
		this.vDirector = vDirector;

	}

	public void setEmpresa(Empresa vEmpresa) {
		this.vEmpresa = vEmpresa;
	}

	public void setGestionTabla(GestionTabla Modificar) {
		this.Modificar = Modificar;

	}

	public void setProfVista(ProfVista vProfesor) {
		this.vProfesor = vProfesor;
	}

	public void setInicio(Inicio vProfesor) {
		this.vInicio = vProfesor;
	}

	public void abrirDirector() {
		vInicio.setVisible(false);
		vDirector.setVisible(true);
	}

	public void abrirProfesor() {
		vInicio.setVisible(false);
		vProfesor.setVisible(true);
	}

	public void abrirAjustes() {
		vProfesor.setVisible(false);
		Modificar.setVisible(true);
	}

	public void cerrarAjustes() {
		Modificar.setVisible(false);
		vProfesor.setVisible(true);
	}

	public void abrirEmpresa() {
		vProfesor.setVisible(false);
		vEmpresa.setVisible(true);
	}

	public void cerrarEmpresa() {
		vEmpresa.setVisible(false);
		vProfesor.setVisible(true);
	}

	public void validarLogDirectora() {
		// conexion.datosLogin(Inicio.txtuser.getText()
		// String.valueOf(Inicio.pwdf.getPassword()))

		if (conexion.datosLogin(Inicio.txtuser.getText(), String.valueOf(Inicio.pwdf.getPassword()))) {
			abrirDirector();
		} else {
			cerrado();
		}

	}

	public void validarLogTutor() {

		if (conexion.datosLogin(Inicio.txtuser.getText(), String.valueOf(Inicio.pwdf.getPassword()))) {
			abrirProfesor();
		} else {
			cerrado();
		}

	}

	public void setConexionOracle(ConexionOracle prueba) {
		this.conexion = prueba;

	}

	public void cerrado() {
		contador++;
		JOptionPane.showMessageDialog(null, "Datos incorrectos.\nCuando falles tres veces se cerrará la aplicación. "
				+ "\n"+ contador +" intento.");
		if (contador == 3) {
			System.exit(0);
		}
	}
}
