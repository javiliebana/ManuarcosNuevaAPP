package Controlador;
import javax.swing.JOptionPane;

import Modelo.Modelo;
import Vistas.DirInicio;
import Vistas.Empresa;
import Vistas.GestionTabla;
import Vistas.Inicio;
import Vistas.ProfVista;
import Vistas.registro;

//cambio de repositorio
public class Controlador {
	private Modelo miModelo;
	private DirInicio vDirector;
	private Empresa vEmpresa;
	private GestionTabla Modificar;
	private ProfVista vProfesor;
	private Inicio vInicio;
	private registro vRegistro2;
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
	

	public void setModelo(Modelo miModelo) {
		this.miModelo = miModelo;
	}
	public void setregistro(registro vRegistro2) {
		this.vRegistro2 = vRegistro2;
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
	
	public void abrirRegistro() {
		vInicio.setVisible(false);
		vRegistro2.setVisible(true);
	}

	public void cerrarRegistro() {
		vRegistro2.setVisible(false);
		vInicio.setVisible(true);
	}
	public void validarLogin() {
		// conexion.datosLogin(Inicio.txtuser.getText()
		// String.valueOf(Inicio.pwdf.getPassword()))

		if (miModelo.datosLogin(Inicio.txtuser.getText(), String.valueOf(Inicio.pwdf.getPassword()))==1) {
			abrirDirector();
		}
			else if (miModelo.datosLogin(Inicio.txtuser.getText(), String.valueOf(Inicio.pwdf.getPassword()))==2) {
			abrirProfesor();
		}
			else if (miModelo.datosLogin(Inicio.txtuser.getText(), String.valueOf(Inicio.pwdf.getPassword()))==3) {
				abrirProfesor();
			}else {
			cerrado();
		}

	}



	public void setConexionOracle(Modelo miModelo) {
		this.miModelo = miModelo;

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

