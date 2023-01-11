package com.xworkz.spring.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz.spring")
public class PencilConfiguration 
{
	public PencilConfiguration() 
	{
		System.out.println("Details of PencilConfiguration");
	}
	@Bean
	public String namadeya()
	{
		System.out.println("Registered namadeya");
		return "Apsara";
	}
	@Bean
	public String pencilType()
	{
		System.out.println("Registered pencilType");
		return "Drawing pencil";
	}
	@Bean
	public double price()
	{
		System.out.println("Registered price");
		return 15;
	}
	@Bean
	public String banna()
	{
		System.out.println("Registered banna");
		return "Black";
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
	
}
