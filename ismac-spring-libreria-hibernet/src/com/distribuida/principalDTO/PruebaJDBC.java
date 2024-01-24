package com.distribuida.principalDTO;

import java.sql.Connection;
import java.sql.DriverManager;

public class PruebaJDBC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String jdbcURL="jdbc:mysql://localhost:3306/bdlibreria";
		String user="root";
		String password="root";
		
		try {
			System.out.println("Estableciendo Conexion");
			
			Connection connection = DriverManager.getConnection(jdbcURL,user,password);
			
			System.out.println("Conexion exitosa");
			
			
		}catch(Exception e){
			e.printStackTrace();
			
		}
		

	}

}
