package com.xworkz.javaspring.configuration;

import java.util.Collection;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

@Configuration
@ComponentScan(basePackages = "com.xworkz.javaspring",excludeFilters = {
@ComponentScan.Filter(type = FilterType.ASSIGNABLE_TYPE,value = Collection.class)})
public class MovieConfiguration 
{
	public  MovieConfiguration()
	{
		System.out.println("Create MovieConfiguration no-arg consructor");
	}
}
