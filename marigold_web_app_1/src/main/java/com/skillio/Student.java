package com.skillio;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Student extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
	        throws ServletException, IOException
	    {
			System.out.println("We are in Student class!!!!"); 
			
			req.setAttribute("stdName", "We are in Student class!!!!");

			
			req.getRequestDispatcher("sample.jsp").forward(req, resp);
			


	    }
}


