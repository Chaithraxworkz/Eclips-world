package com.xworkz.company.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(loadOnStartup=3,urlPatterns = "/company")
public class SoftwareCompanyServlet extends HttpServlet
{
	public SoftwareCompanyServlet() 
	{
		System.out.println("create the software company");
	}
	@Override
	public void init() throws ServletException 
	{
		System.out.println("running the init.......company");
	}
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{
		System.out.println("Running the doGet of softWare Company");
		String CompanyName = req.getParameter("name");
		String FounderName = req.getParameter("founder");
		String FoundedYear = req.getParameter("year");
		String Age = req.getParameter("age");
		String Location = req.getParameter("location");
		String PhNo = req.getParameter("phNo");
		String CEOName = req.getParameter("ceo");
		String KeyPeople = req.getParameter("people");
		String CompanyISIN = req.getParameter("isin");
		String NoofEmployees = req.getParameter("employees");
		String Salary = req.getParameter("salary");
		String HeadQuarters = req.getParameter("head");
		String 	NoOfFields = req.getParameter("field");
		String Fields = req.getParameter("field");
		String Website = req.getParameter("website");
		String ManagerName = req.getParameter("manager");
		
		System.out.println(CompanyName);
		System.out.println(FounderName);
		System.out.println(FoundedYear);
		System.out.println(Age);
		System.out.println(Location);
		System.out.println(PhNo);
		System.out.println(CEOName);
		System.out.println(KeyPeople);
		System.out.println(CompanyISIN);
		System.out.println(NoofEmployees);
		System.out.println(Salary);
		System.out.println(HeadQuarters);
		System.out.println(NoOfFields);
		System.out.println(Fields);
		System.out.println(Website);
		System.out.println(ManagerName);
		
		PrintWriter writer = resp.getWriter();
		writer.print("<html>");
		writer.print("<body>");
		writer.print("<h1>");
		writer.print("<span style ='color : orange;'>");
		writer.print("Software Company" + CompanyName +"sent success");
		writer.print("</span>");
		writer.print("</h1>");
		writer.print("</body>");
		writer.print("</html>");
		resp.setContentType("text/html");
		
	}
}
