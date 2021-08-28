package Implemts;

import Iconexion.iconexion;

public class Conexion_PostgreSQL implements iconexion {

	private String host;
	private String puerto;
	private String usuario;
	private String contraseña;
	
	public Conexion_PostgreSQL() {
		this.host = "localhost";
		this.puerto = "5432";
		this.usuario = "postgres";
		this.contraseña = "38159996";
	}
	
	@Override
	public void conectar () {
		System.out.println("Se conecto a PostgreSQL");
	}


}

