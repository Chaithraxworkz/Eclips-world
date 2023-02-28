package com.xworkz.chaithra_xworkz.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@ComponentScan("com.xworkz.chaithra_xworkz")
public class GarmentConfiguration 
{
	public GarmentConfiguration()
	{
		System.out.println("created" + this.getClass().getSimpleName());
	}
	
	@Bean
	public ViewResolver viewResolver()
	{
		System.out.println("registering the garments");
		return new InternalResourceViewResolver("/" , ".jsp");
	}
	
	@Bean
	public LocalContainerEntityManagerFactoryBean localContainerEntityManagerFactoryBean()
	{
		System.out.println("regisering the localContainerEntityManagerFactoryBean");
		return new LocalContainerEntityManagerFactoryBean();
	}
}
