package com.xworkz.rules.bridge;

import com.xworkz.rules.Bank;

public class XworkzRaj implements DevelopmentInstitute,TestingInstitute,Bank
{
	@Override
	public double training() 
	{
		System.out.println("training");		
		return 0;
	}

	@Override
	public boolean placement() 
	{
		System.out.println("placement");
		return false;
	}

	@Override
	public boolean interview() 
	{
		System.out.println("interview");
		return false;
	}
	@Override
	public double presentation() 
	{
		System.out.println("presentation");
		return 0;
	}
	
	@Override
	public String nameOfBank() 
	{
		System.out.println("nameOfBank");
		return null;
	}

	@Override
	public String locationOfBank()
	{
		System.out.println("locationOfBank");
		return null;
	}

	@Override
	public String amountDeposit()
	{
		System.out.println("amountDeposit");
		return null;
	}

	@Override
	public boolean amountCredit() 
	{
		System.out.println("amountCredit");
		return false;
	}

	@Override
	public String customername()
	{
		System.out.println("customername");
		return null;
	}

	@Override
	public double hackathon()
	{
		System.out.println("hackathon");
		return 0;
	}

}
