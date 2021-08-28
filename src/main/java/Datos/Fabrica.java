package Datos;

import Iconexion.iconexion;

public class Fabrica {

	public static void main(String[] args) {
		conexionfabrica Fabrica = new conexionfabrica();
		
		iconexion cx1 = Fabrica.getConexion("PostgreSQL");
		System.out.println();
		System.out.println("1.  Conexion  con PostgreSQL");
		System.out.println();
		System.out.println("**************************************************");
		cx1.conectar();
		System.out.println("**************************************************");

	
		iconexion cx2 = Fabrica.getConexion("SQL");
		System.out.println();
		System.out.println("3.  Conexion  con SQL Server");
		System.out.println();
		System.out.println("**************************************************");
		cx2.conectar();
		System.out.println("**************************************************");


		iconexion cx3 = Fabrica.getConexion("MySQL");
		System.out.println();
		System.out.println("4.	Conexion  con MySQL Server");
		System.out.println();
		System.out.println("**************************************************");
		cx3.conectar();
		System.out.println("**************************************************");

		
	}

}
