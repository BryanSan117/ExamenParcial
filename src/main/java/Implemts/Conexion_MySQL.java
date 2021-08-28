package Implemts;

import Iconexion.iconexion;

public class Conexion_MySQL implements iconexion {
	private String host;
	private String puerto;
	private String usuario;
	private String contraseña;
	
	public void ConexionMysQL() {
		this.host = "localhost";
		this.puerto = "3306";
		this.usuario = "MysQl";
		this.contraseña = "43519586";
		
	}

	@Override
	public void conectar() {
		System.out.println("Se conecto en MySQl");
		
	}

	
}
