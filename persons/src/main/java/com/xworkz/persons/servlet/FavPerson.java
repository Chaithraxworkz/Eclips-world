package com.xworkz.persons.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(loadOnStartup=1 , urlPatterns ="/fav")
public class FavPerson extends HttpServlet
{
	public FavPerson() 
	{
		System.out.println("created the favperson");
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{
		System.out.println("Running the doPost in favperson");
		String fistName = req.getParameter("fistName");
		String LastName = req.getParameter("lastName");
		String Gender = req.getParameter("gender");
		String Reason = req.getParameter("reason");
		String Address = req.getParameter("address");
		
		System.out.println(fistName);
		System.out.println(LastName);
		System.out.println(Gender);
		System.out.println(Reason);
		System.out.println(Address);
		
		RequestDispatcher dispatcher= req.getRequestDispatcher("display.jsp");
		req.setAttribute("fistName", fistName);
		req.setAttribute("LastName", LastName);
		req.setAttribute("gender", Gender);
		req.setAttribute("Reason", Reason);
		req.setAttribute("Address", Address);
		dispatcher.forward(req, resp);
		
	}
}
