package com.xworkz.server.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.naming.Name;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.stream.Location;

@WebServlet(loadOnStartup=2 , urlPatterns = "/location")
public class LocationServlet extends HttpServlet
{
	public LocationServlet() 
	{
		System.out.println("Created the LocationSevlet");
	}
	@Override
	public void init() throws ServletException 
	{
		System.out.println("Running the init....in location");
	}
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{
		System.out.println("Running the doGet in Location Servlet");
		String Name = req.getParameter("name");
		String Email = req.getParameter("email");
		String StartPoint = req.getParameter("startPoint");
		String Destination = req.getParameter("destination");
		String Gender = req.getParameter("gender");
		
		System.out.println(Name);
		System.out.println(Email);
		System.out.println(StartPoint);
		System.out.println(Destination);
		System.out.println(Gender);
		
		PrintWriter writer = resp.getWriter();
		writer.print("<html>");
		writer.print("<body>");
		writer.print("<h1>");
		writer.print("<br>");
		if(Name.length()>3)
		{
			writer.print("<span style='color:Blue;'>");
			writer.print("Name" +Name+"is successful");
		}
		else
		{
			writer.print("<span style='color:Red;'>");
			writer.print("Name is invalid");
		}
		writer.print("<br>");
		if(Email.length()>10)
		{
			writer.print("<span style='color:Orange;'>");
			writer.print("Email" +Email+"login successful");
		}
		else
		{
			writer.print("<span style='color:Blue;'>");
			writer.print(" invalid email");
		}
		writer.print("<br>");
		if(StartPoint.length()>3)
		{
			writer.print("<span style='color:Blue;'>");
			writer.print("StartPoint" +StartPoint+"is successful");
		}
		else
		{
			writer.print("<span style='color:Red;'>");
			writer.print("invlid StartPoint");
		}
		writer.print("<br>");
		if(Destination.length()>5)
		{
			writer.print("<span style='color:Orange;'>");
			writer.print("Destination" +Destination+"is successful");
		}
		else
		{
			writer.print("<span style='color:Blue;'>");
			writer.print("invalid Destination");
		}
		writer.print("<br>");
		if(Gender.length()>4)
		{
			writer.print("<span style='color:Green;'>");
			writer.print("Gender" +Gender);
		}
		else
		{
			writer.print("<span style='color:Orange;'>");
			writer.print("It is invalid Gender");
		}
		writer.print("<br>");
		writer.print("<a href=\"Location.html\">Back</a>");
		writer.print("</span>");
		writer.print("</h1>");
		writer.print("</body>");
		writer.print("</html>");
		writer.print("tex/html");
	}
}
