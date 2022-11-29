package com.xworkz.rules.bridge;

import com.xworkz.rules.Institute;

public class InstituteRulesFollow implements Institute
{
	@Override
	public String nameOfInstitute() 
	{
		System.out.println("X-workz");
		return null;
	}
	@Override
	public String locationOfInstitute() 
	{
		System.out.println("Rajajinagar");
		return null;
	}
	@Override
	public double feesPaidInstitute() 
	{
		System.out.println(22000);
		return 0;
	}
	@Override
	public String nameOfInstituteHR() 
	{
		System.out.println("Akshara");
		return null;
	}
	@Override
	public String rulesOfInstitute() 
	{
		System.out.println("Give Presentation");
		return null;
	}
}
