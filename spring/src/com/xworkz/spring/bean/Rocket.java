package com.xworkz.spring.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Rocket 
{
	@Value("Delhi")
	private String country;
	@Value("Atlas LV-3B")
	private String name;
	@Value("10000")
	private double budget;
	
	public Rocket() 
	{
			System.out.println("details of the Rocket");
	}
	
	public Rocket(String country, String name, double budget) 
	{
		super();
		this.country = country;
		this.name = name;
		this.budget = budget;
	}

	public String getCountry() 
	{
		return country;
	}
	public String getName() 
	{
		return name;
	}
	public double getBudget() 
	{
		return budget;
	}
}
