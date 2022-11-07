package com.xworkz.inheritance.child;

import com.xworkz.inheritance.thing.Court;

public class HighCourt extends Court
{
	public int noOfJudges;
	public String caseType;
	
	public HighCourt()
	{
		System.out.println("court Default const...");
	}
}
