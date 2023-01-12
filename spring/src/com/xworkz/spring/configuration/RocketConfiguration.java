package com.xworkz.spring.configuration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.xworkz.spring.bean.Actor;
import com.xworkz.spring.bean.Rocket;
import com.xworkz.spring.bean.Season;



//@Configuration
//@ComponentScan("com.xworkz.spring")
public class RocketConfiguration 
{
	public RocketConfiguration() 
	{
		System.out.println("run RocketConfiguration");
	}
	@Bean
	public Rocket isro()
	{
		System.out.println("Registering a rocket");
		Rocket roc = new Rocket("Scout","US",100000);
		return roc;
	}
	
	@Bean
	public Actor hero()
	{
		System.out.println("Registering a actor");
		Actor actor = new Actor("Darshan","Hindi",49);
		return actor;
	}
	@Bean
	public Season summer()
	{
		System.out.println("Registering a season");
		Season season = new Season();
		return season;
	}
}
