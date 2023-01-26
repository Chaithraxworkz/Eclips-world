package com.xworkz.series.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(loadOnStartup=2,urlPatterns = "/series")
public class WebSeriesServlet extends HttpServlet
{
	public WebSeriesServlet()
	{
		System.out.println("Create the webSeries");
	}
	@Override
	public void init() throws ServletException 
	{
		System.out.println("Running the init.......Series");
	}
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{
		System.out.println("Running the doGet in WebSeies");
		String Name = req.getParameter("seriesName");
		String Languages = req.getParameter("language");
		String Episodes = req.getParameter("episodes");
		String OTT = req.getParameter("ott");
		String Budget = req.getParameter("budget");
		
		System.out.println(Name);
		System.out.println(Languages);
		System.out.println(Episodes);
		System.out.println(OTT);
		System.out.println(Budget);
		
		PrintWriter writer = resp.getWriter();
		writer.print("<html>");
		writer.print("<body>");
		writer.print("<h1>");
		writer.print("<span style='color:purple;'>");
		writer.print("Series Name" + Name + "is sent success");
		writer.print("</span>");
		writer.print("</h1>");
		writer.print("</body>");
		writer.print("</html>");
		resp.setContentType("text/html");
	}
}
