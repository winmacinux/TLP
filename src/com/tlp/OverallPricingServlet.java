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

//@WebServlet("/result")
public class OverallPricingServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private RequestDispatcher dispatcher;
	private Person person;
	private HttpSession session;
	private Cookie ck;
	private OverallPricing overallPricing;
	private OverallPricingLogic logic;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		System.out.println("Do get Method of Overall Pricing.");
		session = request.getSession();
		Object financialStabilityStatus = session.getAttribute("financialStabilityStatus");
		Object coverageStabilityStatus = session.getAttribute("financialStabilityStatus");
		Object propertyRiskStatus = session.getAttribute("financialStabilityStatus");
		
		if(financialStabilityStatus !=null && coverageStabilityStatus !=null && propertyRiskStatus != null) {
			person = (Person) session.getAttribute("person");
			overallPricing = new OverallPricing(person, session.getAttribute("financialStabilityStatus").toString(), session.getAttribute("coverageStabilityStatus").toString(), session.getAttribute("propertyRiskStatus").toString());
			logic = new OverallPricingLogic(overallPricing);
			logic.start();
			System.out.println("OP: " + logic.getInsurance().getStatus());
			request.setAttribute("overallPricing", logic.getInsurance());
			dispatcher = request.getRequestDispatcher("success.jsp");
			dispatcher.forward(request, response);
		}
		else {
			response.sendRedirect(request.getContextPath() + "/step1");
		}
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		System.out.println("Do Post Method of Overall Pricing.");
	}

}
