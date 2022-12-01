package com.xworkz.rules.bridge;

import com.xworkz.rules.Pg;

public class MahalakshmiPg implements Pg
{
	public static int noOfPeoples=30;

	@Override
	public double closeTimings() 
	{
		System.out.println("closeTimings");
		return 10.00;
	}

	@Override
	public boolean outSidersNotAllowed() 
	{
		System.out.println("outSidersNotAllowed");
		return false;
	}

	public int noOfPeoples() 
	{
		return 0;
	}
	
}
