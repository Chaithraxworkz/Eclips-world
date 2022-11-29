package com.xworkz.rules.bridge;

import com.xworkz.rules.Car;

public class CarRulesFollow implements Car
{
	@Override
	public String nameOfCar()
	{
		System.out.println("nameOfCar");
		return null;
	}
	@Override
	public String colorOfCar() 
	{
		System.out.println("colorOfCar");
		return null;
	}
	@Override
	public double priceOfCar() 
	{
		System.out.println("priceOfCar");
		return 0;
	}
	@Override
	public String rulesOfCar() 
	{
		System.out.println("rulesOfCar");
		return null;
	}
	@Override
	public String modelOfCar() 
	{
		System.out.println("modelOfCar");
		return null;
	}
}
