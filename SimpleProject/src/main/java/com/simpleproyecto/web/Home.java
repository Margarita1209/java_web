package com.simpleproyecto.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Home
 */
@WebServlet("/Home")
public class Home extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Home() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String firstName = request.getParameter("name");
		String lastName = request.getParameter("lastname");
		String lenguaje = request.getParameter("lenguajefavorito");
		String city = request.getParameter("cuidad");
		
	    response.setContentType("text/html");
	    PrintWriter out = response.getWriter();
	    
	    if (firstName == "" && lastName == "") {
        	out.write("<h1>Bienvenido, Unknown</h1>");
        }
        else {
        	if(firstName != "" && lastName == "") {
        		out.write("<h1>Bienvenido, " + firstName + " Unknown</h1>");
        	}
        	else if(firstName == "" && lastName != "") {
        		out.write("<h1>Bienvenido, Unknown " + lastName + "</h1>");
        	}
        	else {
        		out.write("<h1>Bienvenido, " + firstName + " " + lastName + "</h1>");
        	}
        }
        if (lenguaje == "") {
        	out.write("<h1>Tu lenguaje favorito es: Unknown</h1>");
        }
        else {
        	out.write("<h1>Tu lenguaje favorito es: " + lenguaje + "</h1>");
        }
        if (city == "") {
        	out.write("<h1>Tu ciudad es: Unknown</h1>");
        }
        else {
        	out.write("<h1>Tu ciudad es: " + city + "</h1>");
        }		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
