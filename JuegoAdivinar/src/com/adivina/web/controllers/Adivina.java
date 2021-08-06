package com.adivina.web.controllers;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.*;

/**
 * Servlet implementation class Adivina
 */
@WebServlet("/Adivina")
public class Adivina extends HttpServlet {
	
	
	int num = 15;
			
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Adivina() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession session = request.getSession();
		
		String numero = request.getParameter("numero");

		
		//Dando valor a button
		session.setAttribute("boton", "Try");
		session.setAttribute("numeroRandom", num);
		
		
		//El parametro "numero" comienza como null, generar aviso
		if (numero==null || numero.isEmpty()) {
			session.setAttribute("aviso", "Ingresa un numero");
		}
		//Cuando el parametro "numero" tiene valor se analiza
		else {
			int num1 = Integer.parseInt(numero);
					
			//Si es igual al numero random generado:
			if(num1 == num) {
				//Entrega el atributo guardado en "aviso" para usar en el JSP con getAttibute
				session.setAttribute("aviso", num + " is the number!");
						
				//Cambio valor de button
				session.setAttribute("boton", "Jugar de nuevo");
			}
			//Si es mucho menor
			else if(num1 < (num-2)) {
				session.setAttribute("aviso", "Too low!");
			}
			//Si es mucho mayor
			else if(num1 > (num+2)) {
				session.setAttribute("aviso", "Too high!");
			}
			//Si está cerca
			else {
				session.setAttribute("aviso", "Estás cerca");
			}
					
			if("Jugar de nuevo".equals(session.getAttribute("boton"))) {
						
				//Genera nuevo numero aleatorio
				Random al = new Random();
				num = al.nextInt(99) + 1;
			}
		
								
		//Ejecuta JSP
		RequestDispatcher view = request.getRequestDispatcher("/WEB-INF/Formulario.jsp");
		view.forward(request, response);
	}

}
