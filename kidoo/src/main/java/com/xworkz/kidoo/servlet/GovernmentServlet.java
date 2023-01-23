package com.xworkz.kidoo.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(loadOnStartup = 8 , urlPatterns = "/bjp")
public class GovernmentServlet extends HttpServlet
{
	public GovernmentServlet() 
	{
		System.out.println("created the government");
	}
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{
		System.out.println("Running the doGet Government");
	}
}
