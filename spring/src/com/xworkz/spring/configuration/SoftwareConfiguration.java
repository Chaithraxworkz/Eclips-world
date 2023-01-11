package com.xworkz.spring.configuration;

import java.time.LocalDate;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz.spring")
public class SoftwareConfiguration
{
	public SoftwareConfiguration() 
	{
		System.out.println("Details of SoftwareConfiguration");
	}
	@Bean
	public String shopName()
	{
		System.out.println("Registered shopName");
		return "Dell Laptop";
	}
	@Bean
	public double version()
	{
		System.out.println("Registered version");
		return 11.65;
	}
	@Bean
	public String softwaredeveloper()
	{
		System.out.println("Registered softwaredeveloper");
		return "Srusti";
	}
	@Bean
	public LocalDate date()
	{
		System.out.println("Registered date");
		return LocalDate.now();
	}
	@Bean
	public boolean free()
	{
		System.out.println("Registered free");
		return true;
	}
	
	
	
}
