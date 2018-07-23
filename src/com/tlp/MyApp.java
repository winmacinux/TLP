package com.tlp;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;

public class MyApp extends HttpServlet {

	private static final long serialVersionUID = 1L;
	private RequestDispatcher dispatcher;
	private Person person;
	private HttpSession session;
	private Cookie ck;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		System.out.println("do get Method of Person Servlet");
		dispatcher = request.getRequestDispatcher("person.jsp");
		dispatcher.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		response.setContentType("text/html");
		session = request.getSession();
		System.out.println("Here");
		if(!request.getParameter("name").isEmpty() && !request.getParameter("age").isEmpty() && !request.getParameter("email").isEmpty() && !request.getParameter("contact").isEmpty() && !request.getParameter("panCard").isEmpty()) {
			
			person = new Person(request.getParameter("name"), Integer.parseInt(request.getParameter("age")), request.getParameter("email"), request.getParameter("contact"), request.getParameter("panCard"));
			
//			request.setAttribute("person", person);
//			dispatcher = servletContext.getRequestDispatcher();				
//			dispatcher = request.getRequestDispatcher("step2");
//			dispatcher.forward(request, response);
//			
			session.setAttribute("person", person);
			System.out.println("do Post Method of Person Servlet");
			
			response.sendRedirect(request.getContextPath() + "/step2");
		}
		else {
			doGet(request, response);
		}

	}

}
