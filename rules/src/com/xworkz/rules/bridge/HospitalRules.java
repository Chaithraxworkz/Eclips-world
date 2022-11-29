package com.xworkz.rules.bridge;

import com.xworkz.rules.Hospital;

public class HospitalRules implements Hospital
{
	@Override
	public String chairmanOfhospital()
	{
		System.out.println("Sandya");
		return null;
	}
	@Override
	public String hospitalName() 
	{
		System.out.println("Srinidhi Hospital");
		return null;
	}
	@Override
	public String typeOfDoctors() 
	{
		System.out.println("Surjan");
		return null;
	}
	@Override
	public String hospitalLocation()
	{
		System.out.println("Singapur");
		return null;
	}
	@Override
	public String rulesofHospital() 
	{
		System.out.println("keep scilince no arguments");
		return null;
	}
}
