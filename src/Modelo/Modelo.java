package Modelo;

import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.table.DefaultTableModel;

import Vistas.DirInicio;
import Vistas.Empresa;
import Vistas.GestionTabla;
import Vistas.Inicio;
import Vistas.ProfVista;

public class Modelo {
	private DirInicio vDirector;
	private Empresa vEmpresa;
	private GestionTabla Modificar;
	private Inicio vInicio;
	private ProfVista vProfesor;
	private DefaultTableModel miTabla;
	private ConexionOracle conexion;

	public DefaultTableModel getTabla() {
		return miTabla;
	}

	public void setDirInicio(DirInicio vDirector) {
		this.vDirector = vDirector;
	}

	public void setEmpresa(Empresa vEmpresa) {
		this.vEmpresa = vEmpresa;
	}

	public void setGestion(GestionTabla Modificar) {
		this.Modificar = Modificar;
	}

	public void setInicio(Inicio vInicio) {
		this.vInicio = vInicio;
	}

	public void setProfVista(ProfVista vProfesor) {
		this.vProfesor = vProfesor;
	}

	public void setConexionOracle(ConexionOracle prueba) {
		this.conexion = prueba;

	}
//	public void icono() {
//		 Image icon = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/logoApp.png"));
//	        setIcon
//	 setVisible(true);
//	}

}
