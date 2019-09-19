package com.crudpractica.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.lang.reflect.InvocationTargetException;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/DeleteCarnivorousServlet")
public class DeleteCarnivorousServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("application/json");
		PrintWriter salida = response.getWriter();
		
		//Paso 1. Declarar las variables
		String user="root";
		String pass="roo";
		String urlServidor="jdbc:mysql://localhost:3306//animalitus?useSSL=false&serverTimezone=UTC";
		int nRegistros=0;
		String sentenciaSQL="";
		
		//Paso 2. Declarar los objetos
		Connection conn = null;
		Statement stmnt = null;
		
		//Paso 3. Inicializar el driver
		try 
		{
			Class.forName("com.mysql.cj.jdbc.Driver").getDeclaredConstructor().newInstance();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			try {
				stmnt.close();
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
		}
		
		
		//Paso 4. Abrir la conexión
		//Paso 5. Configurar el statement
		//Paso 6. Ejecutar la instrucción de sql
		//Paso 7. Procesar los datos
		//Paso 8. Cerrar la conexión
		
		salida.close();
		
	}

}
