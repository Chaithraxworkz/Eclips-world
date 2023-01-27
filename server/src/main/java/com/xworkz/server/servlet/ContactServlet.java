package com.xworkz.server.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(loadOnStartup=3,urlPatterns = "/contact")
public class ContactServlet extends HttpServlet
{
	public ContactServlet() 
	{
		System.out.println("Created the contactServlet");
	}
	@Override
	public void init() throws ServletException 
	{
		System.out.println("Running the init......in contact");
	}
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{
		System.out.println("Running the doGet in contactservlet");
		String Name = req.getParameter("name");
		String Email = req.getParameter("email");
		String Mobile = req.getParameter("mobile");
		String Comments = req.getParameter("comment");
		
		System.out.println(Name);
		System.out.println(Email);
		System.out.println(Mobile);
		System.out.println(Comments);
		
		PrintWriter writer = resp.getWriter();
		writer.print("<html>");
		writer.print("<body>");
		writer.print("<h1>");
		writer.print("<body>");
		writer.print("<br>");
		if(Name.length()>3)
		{
			writer.print("<span style='color:Purple;'>");
			writer.print("Name" + Name +"is print successful");
		}
		else
		{
			writer.print("<span style='color:Red;'>");
			writer.print(" invaild Name");
		}
		writer.print("<br>");
		if(Email.length()>10)
		{
			writer.print("<span style='color:Blue;'>");
			writer.print("Email" + Email +"is print successful");
		}
		else
		{
			writer.print("<span style='color:Red;'>");
			writer.print("invalid Email");
		}
		writer.print("<br>");
		if(Mobile.length()>20)
		{
			writer.print("<span style='color:Purple;'>");
			writer.print("Mobile" + Mobile +"is print successful");
		}
		else
		{
			writer.print("<span style='color:Red;'>");
			writer.print("invalid MobileNo");
		}
		writer.print("<br>");
		if(Comments.length()>15)
		{
			writer.print("<span style='color:Blue;'>");
			writer.print("Comments" + Comments +"is print successful");
		}
		else
		{
			writer.print("<span style='color:Red;'>");
			writer.print("invalid comments");
		}
		writer.print("<br>");
		writer.print("<a href=\"Content.html\">Back</a>");
		writer.print("</span>");
		writer.print("</h1>");
		writer.print("</body>");
		writer.print("</html>");
		writer.print("text/html");
	}
	
}
