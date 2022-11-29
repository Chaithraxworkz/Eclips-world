package com.xworkz.rules.bridge;

import com.xworkz.rules.Pen;

public class PenFollowRules implements Pen
{
	@Override
	public String nameOfPen() 
	{
		System.out.println("Cello PinPoint");
		return null;
	}
	@Override
	public double priceOfPen() 
	{
		System.out.println(15);
		return 0;
	}
	@Override
	public String typeOfPen()
	{
		System.out.println("Black");
		return null;
	}
	@Override
	public String rulesOfPen() 
	{
		System.out.println("Writing a Book or Paper");
		return null;
	}
	@Override
	public String shapeOfPen() 
	{
		System.out.println("Round");
		return null;
	}
}
