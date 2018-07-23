package com.tlp;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


//@WebServlet("/step4")
public class CoverageStabilityServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private RequestDispatcher dispatcher;
	private Person person;
	private HttpSession session;
	private Cookie ck;
	private CoverageStability coverageStability;
	private CoveragestabilityLogic coverageStabilityLogic;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		session = request.getSession();
		person = (Person)session.getAttribute("person");
		if(person != null) {
			System.out.println("Do get Method of Coverage Stability.");
			dispatcher = request.getRequestDispatcher("coverage_stability.jsp");
			dispatcher.forward(request, response);
		}else {
			response.sendRedirect(request.getContextPath() + "/step1");
		}
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");

		System.out.println("Do Post Method of Coverage Stability.");
		if(!request.getParameter("coverage").isEmpty() && !request.getParameter("industry").isEmpty()) {
			coverageStability = new CoverageStability(person, request.getParameter("coverage"), request.getParameter("industry"));
			coverageStabilityLogic = new CoveragestabilityLogic(coverageStability);
			coverageStabilityLogic.start();
			System.out.println("CS: " + coverageStabilityLogic.getInsurance().getStatus());
			session.setAttribute("coverageStabilityStatus", coverageStabilityLogic.getInsurance().getStatus());
			response.sendRedirect(request.getContextPath() + "/final");
		}
		else {
			doGet(request, response);
		}
	}

}
