package com.xworkz.goa.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz.goa")
public class BeachConfiguration 
{
	public BeachConfiguration() 
	{
		System.out.println("created" + this.getClass().getSimpleName());
	}
}
