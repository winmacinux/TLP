package com.tlp;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


//@WebServlet("/step3")
public class PropertyRiskServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private RequestDispatcher dispatcher;
	private Person person;
	private HttpSession session;
	private Cookie ck;
	private PropertyRisk propertyRisk;
	private PropertyRiskLogic logic;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		session = request.getSession();
		person = (Person)session.getAttribute("person");
		if(person != null) {
			response.setContentType("text/html");
			System.out.println("Do get Method of Property Risk.");
			dispatcher = request.getRequestDispatcher("property_risk.jsp");
			dispatcher.forward(request, response);
		}
		else {
			response.sendRedirect(request.getContextPath() + "/step1");
		}

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		System.out.println("Do Post Method of Property Risk.");
		if(!request.getParameter("priorLosses").isEmpty() && !request.getParameter("ageOfProperty").isEmpty() && !request.getParameter("propertyValue").isEmpty() ) {			
			propertyRisk = new PropertyRisk(person, request.getParameter("constructionType"), Integer.parseInt(request.getParameter("priorLosses")), Integer.parseInt(request.getParameter("ageOfProperty")), Integer.parseInt(request.getParameter("propertyValue"))); 
			logic = new PropertyRiskLogic(propertyRisk);
			logic.start();
			System.out.println("PR: " + logic.getData().getStatus());
			session.setAttribute("propertyRiskStatus", logic.getData().getStatus());
			response.sendRedirect(request.getContextPath() + "/step4");
		}
		else {
			doGet(request, response);
		}
	}

}
