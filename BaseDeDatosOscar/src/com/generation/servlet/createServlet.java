package com.generation.servlet;

import java.io.IOException;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.generation.model.animales;
import com.mysql.*;
import com.mysql.jdbc.Connection;

/**
 * Servlet implementation class createServlet
 */
@WebServlet(description = "ParaConectarALaBaseDedatos", urlPatterns = { "/createServlet" })
public class createServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public createServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		String url="jdbc:mysql://localhost/animales";
		String user="root";
		String password="qwerty12";
	
		
		try {
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			Connection conn=(Connection) DriverManager.getConnection(url,user,password);
			System.out.println("Conexion exitosa");
			
			Statement stmnt = (Statement) conn.createStatement();
			
			
			animales mianimal =  new animales();
			
			mianimal.setIdAnimales(Integer.parseInt(request.getParameter("idAnimales")));
			mianimal.setNombre(request.getParameter("nombre"));
			mianimal.setEdad(Integer.parseInt(request.getParameter("edad")));
			mianimal.setHabitat(request.getParameter("habitat"));
			
			
			
			  stmnt.executeUpdate("insert into animales values(IDAnimal.nextval,'"+mianimal.getNombre()+"',"+mianimal.getEdad()+",'"+mianimal.getHabitat()+"')");
				
				
				stmnt.close();
				conn.close();
			
			
		}
		
			
		
		
		catch(Exception e){
			System.out.println("Exception "+e);
			
		}

}
}
	
