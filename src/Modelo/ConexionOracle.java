package Modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

import Controlador.Controlador;

public class ConexionOracle {

	private String login = "SYSTEM";
	private String pwd = "1342";
	private String url = "jdbc:oracle:thin:@localhost:1521:XE";
	private Connection conexion;
	private Modelo miModelo;
	private Controlador miControlador;

	public ConexionOracle() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conexion = DriverManager.getConnection(url, login, pwd);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public boolean datosLogin(String usuario, String pwsd) {
		boolean login1 = false;
		try {

			String sql = "select * from gonzalo245.USERS WHERE usr=? AND pwd=?";
			PreparedStatement pstmt = conexion.prepareStatement(sql);
			pstmt.setString(1, usuario);
			pstmt.setString(2, pwsd);
			ResultSet rset = pstmt.executeQuery();
			if (rset.next()) {
				login1 = true;

			} else {
				login1 = false;

			}

		} catch (Exception e) {
			// TODO: handle exception
		}
		return login1;

	}

	public void setModelo(Modelo miModelo) {
		this.miModelo = miModelo;

	}

	public void setControlador(Controlador controlador) {
		this.miControlador = controlador;

	}

}