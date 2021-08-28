package Implemts;

import Iconexion.iconexion;

public class Conexion_SQLServer implements iconexion  {

	private String host;
	private String puerto;
	private String usuario;
	private String contraseña;
	
	public Conexion_SQLServer() {
		this.host = "";
		this.puerto = "";
		this.usuario = "";
		this.contraseña = "";
		
	}
	
	
	@Override
	public void conectar() {
		System.out.println("Se conecto a SQL Server");
		
	}


}
