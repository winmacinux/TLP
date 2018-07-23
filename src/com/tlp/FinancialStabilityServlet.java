package com.tlp;

import java.io.IOException;
import java.util.Arrays;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


//@WebServlet("/step2")
public class FinancialStabilityServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private RequestDispatcher dispatcher;
	private Person person;
	private HttpSession session;
	private Cookie ck;
	private FinancialStability financialStability;
	private FinancialStabilityLogic financialStabilityLogic;
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		session = request.getSession();
		person = (Person)session.getAttribute("person");
		if(person != null) {
			System.out.println("Do get Method of Financial Stability.");
			dispatcher = request.getRequestDispatcher("financial_stability.jsp");
			dispatcher.forward(request, response);
		}else {
			response.sendRedirect(request.getContextPath() + "/step1");
		}
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");

		System.out.println("Do Post Method of Financial Stability.");
		if(!request.getParameter("yearsInBusiness").isEmpty() && !request.getParameter("numberOfBankruptcies").isEmpty() && !request.getParameter("yearsAtCurrentAddress").isEmpty()) {
			financialStability  = new FinancialStability(person, Integer.parseInt(request.getParameter("yearsInBusiness")), Integer.parseInt(request.getParameter("numberOfBankruptcies")), Integer.parseInt(request.getParameter("yearsAtCurrentAddress")));
			financialStabilityLogic = new FinancialStabilityLogic(financialStability);
			financialStabilityLogic.start();
			System.out.println("FS: " + financialStabilityLogic.getInsurance().getStatus());
			session.setAttribute("financialStabilityStatus", financialStabilityLogic.getInsurance().getStatus());
			response.sendRedirect(request.getContextPath() + "/step3");
		}
		else {
			doGet(request, response);
		}
		
	}

}
