package com.web.servlets;

import java.io.IOException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns="/welcomegradle", name="WelcomeGradleWeb")
public class WelcomeGradleWeb extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException{
		response.getWriter().println("<h1>Welcome Gradle Web World</h1>"
				+ "</br></br><a href = 'jsp/welcome.jsp'>Welcome page</a>");		
	}
	
	
}
