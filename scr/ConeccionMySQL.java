package MEDICALCENTER;

import java.sql.*;
/*
Nombre del JavaBean: ConeccionMySQL.java
Escrito por: Nairo Granados Mart�nez

Descripci�n: 
Este JavaBean sirve para Crear, Abrir y Cerrar una conecci�n

Variables:
Connection conn = Utilizada para establecer la conceccion con la base de datos.
String strHost = N�mero IP del servidor de Firebird.
String strPuerto = N�mero del Puerto de la base de datos.
String strNombreDB = Nombre de la Base de Datos.
String strUsuario = Usuario de la Base de Datos.
String strPassword = Password del Usuario.
*/

public class ConeccionMySQL {
	// -----------------------------------------------------------------
	// DECLARACI�N DE VARIABLES
	// -----------------------------------------------------------------
	protected Connection conn = null;
	String strHost = "127.0.0.1";
	String strPuerto = "3306";
	String strNombreDB = "Taller8";
	String strUsuario = "root";
	String strPassword = "NOVAt1e2r3r4a5";

	// -----------------------------------------------------------------
	// METODOS
	// -----------------------------------------------------------------

	// -----------------------------------------------------------------
	// Metodo setConneccion:
	// Procedimiento que establece conecci�n con la base de datos.
	//
	// -----------------------------------------------------------------
	public Connection setConeccion() throws ClassNotFoundException,
			SQLException, InstantiationException, IllegalAccessException {
		Class.forName("com.mysql.jdbc.Driver").newInstance();
		conn = DriverManager.getConnection("jdbc:mysql://" + strHost + ":"
				+ strPuerto + "/" + strNombreDB, strUsuario, strPassword);
		return conn;
	}

	// -----------------------------------------------------------------
	// Metodo setCerrarConeccion:
	// Procedimiento que cierra la conecci�n con la base de datos.
	//
	// -----------------------------------------------------------------
	public void setCerrarConeccion() throws SQLException {
		if (conn != null) {
			try {
				conn.close();
			} catch (Exception e) { /* ignore close errors */
			}
		}
	}
}
