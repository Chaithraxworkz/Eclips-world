package com.xworkz.rules.bridge;

import com.xworkz.rules.Temple;

public class TempleRuleFollow implements Temple
{
	@Override
	public String nameOfTemple() 
	{
		System.out.println("Lakshmi");
		return null;
	}
	@Override
	public String locationOfTemple() 
	{
		System.out.println("Vijaynagar");
		return null;
	}
	@Override
	public int noOfPeoples() 
	{
		System.out.println(200);
		return 0;
	}
	@Override
	public String rulesOfTemple()
	{
		System.out.println("Queue");
		return null;
	}
	@Override
	public boolean openOrNot() 
	{
		System.out.println(false);
		return false;
	}
}
