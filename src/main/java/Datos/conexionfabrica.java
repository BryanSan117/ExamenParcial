package Datos;

import Iconexion.iconexion;
import Implemts.Conexion_MySQL;
import Implemts.Conexion_PostgreSQL;
import Implemts.Conexion_SQLServer;


public class conexionfabrica {

	public iconexion getConexion(String motor) {
	if (motor == null ) {
		
	}
	if (motor.equalsIgnoreCase("Postgresql")) {
		return new Conexion_PostgreSQL();
	}if (motor.equalsIgnoreCase("SQL SERVER")) {
		return new Conexion_SQLServer();
	}if (motor.equalsIgnoreCase("MySQL")) {
		return new Conexion_MySQL();
	}
	return new Conexion_MySQL(); 
	}
}
