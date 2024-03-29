package MEDICALCENTER;

import java.sql.*;
/*
 Nombre del JavaBean: ConeccionSQLServer.java
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

public class ConeccionSQLServer {
	// -----------------------------------------------------------------
	// DECLARACI�N DE VARIABLES
	// -----------------------------------------------------------------
	protected Connection conn = null;
	String strHost = "127.0.0.1";
	String strPuerto = "1433";
	String strNombreDB = "BDI";
	String strUsuario = "prueba";
	String strPassword = "prueba";

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
		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver").newInstance();
		conn = DriverManager.getConnection("jdbc:sqlserver://" + strHost + ":" + strPuerto 
				+ ";databaseName=" + strNombreDB + ";integratedSecurity=false", strUsuario, strPassword);
		return conn;
		// integratedSecurity=true significa que toma las credenciales de windows y no toca escribir usuario o contrase�a. 
		// Si esta en false, es un usuario de base de datos y necesito usuario y contrase�a 
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
