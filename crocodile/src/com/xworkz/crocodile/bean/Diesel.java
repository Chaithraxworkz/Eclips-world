package com.xworkz.crocodile.bean;

import org.springframework.stereotype.Component;

import com.xworkz.crocodile.Fuel;

@Component
public class Diesel implements Fuel 
{
	public Diesel() 
	{
		System.out.println("Running the diesel");
	}

	public void consume() 
	{

	}

}
