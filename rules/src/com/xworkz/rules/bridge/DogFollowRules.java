package com.xworkz.rules.bridge;

import com.xworkz.rules.Dog;

public class DogFollowRules implements Dog
{
	@Override
	public String nameOfDog()
	{
		System.out.println("Browni");
		return null;
	}
	@Override
	public String colorOfDog() {
		System.out.println("White");
		return null;
	}
	@Override
	public double priceOfDog()
	{
		System.out.println(10000);
		return 0;
	}
	@Override
	public String rulesOfDog() 
	{
		System.out.println("Eat & Sleep");
		return null;
	}
	@Override
	public double weightOfDog() 
	{
		System.out.println(20.5);
		return 0;
	}
}
