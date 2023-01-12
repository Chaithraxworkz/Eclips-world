package com.xworkz.javaspring.configuration;

import java.time.LocalDate;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz.javaspring")
public class NewsConfiguration 
{
	public NewsConfiguration() 
	{
		System.out.println("Running the NewsConfiguration");
	}

	@Bean
	public String papername()
	{
		System.out.println("Registering the papername");
		return "Vijayavani";
	}
	@Bean
	public String paperOwnername()
	{
		System.out.println("Registering the paperOwnername");
		return "Hareesha";
	}
	@Bean
	public String nameOfEngine()
	{
		System.out.println("Registering nameOfEngine");
		return "RX";
	}
	@Bean
	public String typeOFEngine()
	{
		System.out.println("Registering typeOFEngine");
		return "Bajaj";
	}
	@Bean
	public String snakeName()
	{
		System.out.println("Registering snakeName");
		return "cobra";
	}
	@Bean
	public String snakeType()
	{
		System.out.println("Registering snakeType");
		return "Asian cobra";
	}
	@Bean
	public boolean Possion()
	{
		System.out.println("Registering Possion");
		return true;
	}
	@Bean
	public String ghostGender()
	{
		System.out.println("Registering ghostGender");
		return "Male";
	}
	@Bean
	public double ghostWeight()
	{
		System.out.println("Registering ghostWeight");
		return 75;
	}
	@Bean
	public boolean ParentsOfGhost()
	{
		System.out.println("Registering ParentsOfGhost");
		return true;
	}
	@Bean
	public long phoneNo()
	{
		System.out.println("Registering phoneNo");
		return 7598412368l;
	}
	@Bean
	public int friends()
	{
		System.out.println("Registering friends");
		return 10;
	}
	@Bean
	public LocalDate dateOfBirth()
	{
		System.out.println("Registering dateOfBirth");
		return LocalDate.now();
	}
	@Bean
	public boolean ghostPartner()
	{
		System.out.println("Registering ghostPartner");
		return false;
	}
	@Bean
	public String type()
	{
		System.out.println("Registering type");
		return "accident";
	}
	@Bean
	public String ghostMother()
	{
		System.out.println("Registering ghostMother");
		return "Shakunthala";
	}
	@Bean
	public String sisterName()
	{
		System.out.println("Registering sisterName");
		return "Spoorthi";
	}
}
