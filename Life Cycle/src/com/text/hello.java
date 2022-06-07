package com.text;

import java.io.IOException;
import javax.servlet.GenericServlet;
import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;


@WebServlet("/hello")
public class hello extends GenericServlet implements Servlet {
	private static final long serialVersionUID = 1L;
    
    public hello() {
    	System.out.println("constructor");
    }
      	public void init(ServletConfig config) throws ServletException {
      		System.out.println("init()");
	}

	
	public void destroy() {
		System.out.println("destroy()");	
	}

	
	
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		System.out.println("processing the request and response");	
	}

}
