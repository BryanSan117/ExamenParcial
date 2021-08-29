package Datos;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

import Iconexion.iconexion;

public class Fabrica {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		conexionfabrica Fabrica = new conexionfabrica();
		
		System.out.println("Introduzca una descripcion para el articulo: ");
		String descripcion = teclado.nextLine();
		System.out.println("Introduzca un precio para el articulo : ");
		int precio = teclado.nextInt();
		

		try {
			Connection conexion = DriverManager.getConnection("jdbc:sql://localhost/db_Articuloz","sa","1235");

			
			Statement consulta = (Statement) conexion.createStatement();
			((java.sql.Statement) consulta).executeUpdate("insert into articulos (descripcion, precio) values ('"
					+ descripcion
					+ "',"
					+ precio + ")");
			
			conexion.close();
			System.out.println("Articulo insertado correcta mente");
			
		} catch (SQLException e) {
			e.printStackTrace();
			
		}
		
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
