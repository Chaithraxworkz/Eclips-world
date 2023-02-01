package com.xworkz.food.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz.food")
public class SpringConfiguration 
{
	public SpringConfiguration() 
	{
		System.out.println("Create the SpringConfiguration");
	}
}
