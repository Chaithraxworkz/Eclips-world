package com.xworkz.crocodile.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz.crocodile")
public class PetrolConfiguration 
{
	public PetrolConfiguration() 
	{
		System.out.println("created PetrolConfiguration");
	}
}
