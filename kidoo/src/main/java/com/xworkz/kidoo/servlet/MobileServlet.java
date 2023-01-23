package com.xworkz.kidoo.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(loadOnStartup= 6 , urlPatterns = "/techno")
public class MobileServlet extends HttpServlet
{
	public MobileServlet() 
	{
		System.out.println("created the mobileServer");
	}
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{
		System.out.println("Running the doGet Mobile");
	}
}
