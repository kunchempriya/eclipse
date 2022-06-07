package com.test;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;

@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response .setContentType("text/html");
		
		PrintWriter out =response.getWriter();
		
		String name =request.getParameter("user");
		String Pass =request.getParameter("pwd");
		
		if(name.equals("admin") && Pass.equals("admin"))
		{
			//out.println("login success.");
			RequestDispatcher rd = request.getRequestDispatcher("register.html");
			rd.forward(request,response);
			//response.sendRedirect("https://www.google.com/");
		}
		
		
		else
		{
			out.println("<font color ='red'>login failed.</font>");	
			RequestDispatcher rd = request .getRequestDispatcher("Login.html");
			rd.include(request,response);
		}
	}

}
