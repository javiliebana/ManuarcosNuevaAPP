package Modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

import javax.swing.table.DefaultTableModel;

import Vistas.DirInicio;
import Vistas.Empresa;
import Vistas.GestionTabla;
import Vistas.Inicio;
import Vistas.ProfVista;
import Vistas.registro;

import Controlador.Controlador;

@SuppressWarnings("unused")
public class Modelo {
	private registro vRegistro2;
	private Controlador controlador;
	private DirInicio vDirector;
	private Empresa vEmpresa;
	private GestionTabla Modificar;
	private Inicio vInicio;
	private ProfVista vProfesor;
	private DefaultTableModel miTablaEmpresas;
	private DefaultTableModel miTablaVistasGen;
	private String login;
	private String pwd;
	private String url;
	private String driver;
	private String sqlTabla;
	private String sqlTabla2;
	private Connection conexion;

	public Modelo() {
		try {
			sqlTabla = "SELECT E.NOM,E.APELL1,E.APELL2,E.NUM_MAT,NOM_CICLO,G.COD_GRUPO,ANO_ACADEM,NOM_TUTOR,"
					+ "NOM_EMPR FROM manuarcos.ESTUDIANTE E,manuarcos.ESTUDIA ES,manuarcos.CICLO C, manuarcos.GRUPO G,"
					+ "manuarcos.EMPRESA EMP,manuarcos.REALIZA_PRACTICAS R, manuarcos.TUTOR T,manuarcos.TUTELA TU  WHERE  "
					+ "E.NUM_MAT =ES.NUM_MAT AND ES.COD_GRUPO=G.COD_GRUPO AND G.CLAVE_CICLO=C.CLAVE_CICLO AND EMP.NUM_CONV=R.NUM_CONV "
					+ "AND R.NUM_MAT =E.NUM_MAT AND T.NIF=TU.NIF AND TU.NUM_MAT =E.NUM_MAT";
			sqlTabla2 = "SELECT * FROM manuarcos.Empresa";
			login = "system";
			pwd = "1342";
			url = "jdbc:oracle:thin:@localhost:1521:XE";
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conexion = DriverManager.getConnection(url, login, pwd);
			
		} catch (Exception e) {
			e.printStackTrace();
		}

		cargarTablaFiltro(sqlTabla);

		cargarTablaEmpresas(sqlTabla2);

	}

	private int getNumColumnas(String sql) {
		int num = 0;
		try {
			PreparedStatement pstmt = conexion.prepareStatement(sql);
			ResultSet rset = pstmt.executeQuery();
			ResultSetMetaData rsmd = rset.getMetaData();
			num = rsmd.getColumnCount();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return num;
	}

	public void cargarTablaFiltro(String sqlTabla3) {
		miTablaVistasGen = new DefaultTableModel();
		int numColumnas = getNumColumnas(sqlTabla3);
		Object[] contenido = new Object[numColumnas];
		PreparedStatement pstmt;
		try {
			pstmt = conexion.prepareStatement(sqlTabla3);
			ResultSet rset = pstmt.executeQuery();
			ResultSetMetaData rsmd = rset.getMetaData();
			for (int i = 0; i < numColumnas; i++) {
				miTablaVistasGen.addColumn(rsmd.getColumnName(i + 1));
			}
			while (rset.next()) {
				for (int col = 1; col <= numColumnas; col++) {
					contenido[col - 1] = rset.getString(col);
				}
				miTablaVistasGen.addRow(contenido);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	public void cargarTablaEmpresas(String sql) {
		miTablaEmpresas = new DefaultTableModel();
		int numColumnas = getNumColumnas(sql);
		Object[] contenido = new Object[numColumnas];
		PreparedStatement pstmt;
		try {
			pstmt = conexion.prepareStatement(sql);
			ResultSet rset = pstmt.executeQuery();
			ResultSetMetaData rsmd = rset.getMetaData();
			for (int i = 0; i < numColumnas; i++) {
				miTablaEmpresas.addColumn(rsmd.getColumnName(i + 1));
			}
			while (rset.next()) {
				for (int col = 1; col <= numColumnas; col++) {
					contenido[col - 1] = rset.getString(col);
				}
				miTablaEmpresas.addRow(contenido);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	public int datosLogin(String usuario, String pwsd) {
		boolean login1 = false;
		int tiporol = 0;
		try {

			String sql = "select rol from manuarcos.USERS WHERE usr=? AND pwd=?";
			PreparedStatement pstmt = conexion.prepareStatement(sql);
			pstmt.setString(1, usuario);
			pstmt.setString(2, pwsd);
			ResultSet rset = pstmt.executeQuery();
			if (rset.next()) {
				login1 = true;
				String resultado = rset.getString(1);
				if (resultado.equals("director")) {

					tiporol = 1;
				} else if (resultado.equals("tutor")) {

					tiporol = 2;
				} else if (resultado.equals("tutor")) {

					tiporol = 3;
				}

			} else {
				login1 = false;
			}

		} catch (Exception e) {
			System.out.println("error");
		}
		return tiporol;

	}

	public DefaultTableModel getTablaEmp() {
		return miTablaEmpresas;
	}

	public DefaultTableModel getTablaGen() {
		return miTablaVistasGen;
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

	public void setControlador(Controlador controlador) {
		this.controlador = controlador;
	}

	public void setRegistro(registro vRegistro2) {
		this.vRegistro2 = vRegistro2;	
	}

}

//	public void icono() {
//		 Image icon = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/logoApp.png"));
//	        setIcon
//	 setVisible(true);
//	}


