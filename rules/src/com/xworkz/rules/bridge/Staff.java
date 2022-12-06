package com.xworkz.rules.bridge;

import com.xworkz.rules.things.MetroRules;

public class Staff implements MetroRules
{

	@Override
	public double toGiveCoin() 
	{
		System.out.println("running the toGiveCoin");
		return 0;
	}

	@Override
	public boolean wearMask() 
	{
		System.out.println("running the wearMask");
		return false;
	}

}
