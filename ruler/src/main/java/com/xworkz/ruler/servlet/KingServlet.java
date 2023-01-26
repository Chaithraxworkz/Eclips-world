package com.xworkz.ruler.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(loadOnStartup=5,urlPatterns = "/king")
public class KingServlet extends HttpServlet
{
	public KingServlet() 
	{
		System.out.println("Created the king");
	}
	@Override
	public void init() throws ServletException 
	{
		System.out.println("Running the init.....king");
	}
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{
		System.out.println("Running the doGet in King");
		String KingName = req.getParameter("kingname");
		String Region = req.getParameter("region");
		String NoOfQueens = req.getParameter("queens");
		String DOB = req.getParameter("birth");
		String DOD = req.getParameter("death");
		
		System.out.println(KingName);
		System.out.println(Region);
		System.out.println(NoOfQueens);
		System.out.println(DOB);
		System.out.println(DOD);
		PrintWriter writer = resp.getWriter();
		writer.print("<html>");
		writer.print("<body>");
		writer.print("<h1>");
		writer.print("<span style ='color : red;'>");
		writer.print("King Name" + KingName +"sent success");
		writer.print("</span>");
		writer.print("</h1>");
		writer.print("</body>");
		writer.print("</html>");
		resp.setContentType("text/html");
	}
}
