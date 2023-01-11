package com.xworkz.spring.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz.spring")
public class HardwareConfiguration 
{
	public HardwareConfiguration() 
	{
		System.out.println("Details of HardwareConfiguration");
	}
	@Bean
	public int id()
	{
		System.out.println("Registering the Id");
		return 5501;
	}
	@Bean
	public String shopName()
	{
		System.out.println("Registering the shopName");
		return "Sri Shakti";
	}
	@Bean
	public String gross()
	{
		System.out.println("Registering the Gross");
		return "SYB54261HB";
	}
	@Bean
	public String shopOwner()
	{
		System.out.println("Registering the shopOwner");
		return "Chidanand";
	}
	@Bean
	public String stala()
	{
		System.out.println("Registering the stala");
		return "Vijaynagar";
	}
}
