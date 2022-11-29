package com.xworkz.rules.bridge;

import com.xworkz.rules.Company;

public class CompanyFollows implements Company
{
	@Override
	public String nameOfCompany() 
	{
		System.out.println("TCS");
		return null;
	}
	@Override
	public String locationOfCompany() 
	{
		System.out.println("Bangalore");
		return null;
	}
	@Override
	public int noOfEmployees() 
	{
		System.out.println(1000);
		return 0;
	}
	@Override
	public String modeOfCompany() 
	{
		System.out.println("Work from Home");
		return null;
	}
	@Override
	public String rulesOfCompany() 
	{
		System.out.println("Complete the task");
		return null;
	}
}
