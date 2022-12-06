package com.xworkz.rules.bridge;

import com.xworkz.rules.things.AirportRules;

public class Passengers implements AirportRules
{

	@Override
	public boolean currectTimeToReach() 
	{
		System.out.println("Running ToReach");
		return true;
	}

	@Override
	public int noOfStaff() 
	{
		System.out.println("Running noOfStaff");
		return 50;
	}

}
