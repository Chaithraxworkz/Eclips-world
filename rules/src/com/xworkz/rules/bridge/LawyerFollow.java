package com.xworkz.rules.bridge;

import com.xworkz.rules.Court;

public class LawyerFollow implements Court
{
	@Override
	public String courtType() 
	{
		System.out.println("High Court");
		return null;
	}
	@Override
	public String nameOfJudge() 
	{
		System.out.println("Satish Chandra Sharma");
		return null;
	}
	
	@Override
	public String locationOfCourt() 
	{
		System.out.println("Bngalore");
		return null;
	}
	
	@Override
	public String courtRules()
	{
		System.out.println("All are Silent");
		return null;
	}
	@Override
	public String courtDate() 
	{
		System.out.println("Tuesday");
		return null;
	}
}
