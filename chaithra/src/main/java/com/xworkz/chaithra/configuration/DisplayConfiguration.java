package com.xworkz.chaithra.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz.chaithra")
public class DisplayConfiguration 
{
	public DisplayConfiguration() 
	{
		System.out.println("created" + this.getClass().getSimpleName());
	}
}
