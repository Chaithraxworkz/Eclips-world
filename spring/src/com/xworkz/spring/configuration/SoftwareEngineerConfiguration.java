package com.xworkz.spring.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz.spring")
public class SoftwareEngineerConfiguration 
{
	public SoftwareEngineerConfiguration() 
	{
			System.out.println("Details of SoftwareEngineerConfiguration");
	}
	@Bean
	public String engineerName()
	{
		System.out.println("Registered engineerName");
		return "Chaithra";
	}
	@Bean
	public double salary()
	{
		System.out.println("Registered salary");
		return 25000;
	}
	@Bean
	public String softwaryCompany()
	{
		System.out.println("Registered softwaryCompany");
		return "Infosys";
	}@Bean
	public boolean experience()
	{
		System.out.println("Registered experience");
		return false;
	}
	
	
}
