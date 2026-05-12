package com.skillio;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Search extends HttpServlet {


	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
	        throws ServletException, IOException
	    {
			String cricketData = "Lord's cricket ground, the Home of Cricket, is owned by Marylebone Cricket Club. Buy cricket tickets, view fixtures, plan your day at Lord's.";
			String footBallData = "Association football, more commonly known as just football or soccer, is a team sport played between two teams of 11 players who almost exclusively use their ";
			
			
			String searchData = req.getParameter("q");
			
			if(searchData.equals("cricket")) {
				req.setAttribute("data", cricketData);
			} else if(searchData.equals("football")) {
				req.setAttribute("data", footBallData);
			} else {
				req.setAttribute("data", "Sorry..!!!!");
			}
			
			req.getRequestDispatcher("sample.jsp").forward(req, resp);
	    }
}