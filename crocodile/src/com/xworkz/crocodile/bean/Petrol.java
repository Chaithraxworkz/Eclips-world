package com.xworkz.crocodile.bean;

import org.springframework.stereotype.Component;

import com.xworkz.crocodile.Fuel;

@Component
public class Petrol implements Fuel 
{
	public Petrol() 
	{
		System.out.println("Running the petrol");
	}

	public void consume() 
	{

	}

}
