package com.xworkz.spring.configuration;

import org.springframework.context.annotation.Bean;

public class RubberConfiguration 
{
	public RubberConfiguration() 
	{
			System.out.println("Details of RubberConfiguration");
	}
	@Bean
	public String namadeya()
	{
		System.out.println("Registered namadeya");
		return "Nataraja";
	}
	@Bean
	public String rubberType()
	{
		System.out.println("Registered pencilType");
		return "Ink Rubber";
	}@Bean
	public double price()
	{
		System.out.println("Registered price");
		return 20;
	}
	@Bean
	public String banna()
	{
		System.out.println("Registered banna");
		return "Brown";
	}
	@Bean
	public boolean sharp()
	{
		System.out.println("Registered sharp");
		return true;
	}
	@Bean
	public boolean pencilStolen()
	{
		System.out.println("Registered pencilStolen");
		return false;
	}
	@Bean
	public double size()
	{
		System.out.println("Registered size");
		return 3.5;
	}
	
}
