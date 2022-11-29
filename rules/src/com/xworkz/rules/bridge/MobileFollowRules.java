package com.xworkz.rules.bridge;

import com.xworkz.rules.Mobile;

public class MobileFollowRules implements Mobile
{
	@Override
	public String nameOfMobile() 
	{
		System.out.println("nameOfMobile");
		return null;
	}
	@Override
	public double mobilePrice()
	{
		System.out.println("mobilePrice");
		return 0;
	}
	@Override
	public String colorOfMobile()
	{
		System.out.println("colorOfMobile");
		return null;
	}
	@Override
	public String ramOfMobile()
	{
		System.out.println("colorOfMobile");
		return null;
	}
	@Override
	public double rulesOfMobile() 
	{
		System.out.println("rulesOfMobile");
		return 0;
	}
}
