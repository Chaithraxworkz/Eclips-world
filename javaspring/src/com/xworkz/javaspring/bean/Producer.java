package com.xworkz.javaspring.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Producer 
{
	@Autowired
	private Assistant assistant;
	
	public Producer() 
	{
		System.out.println("Created the producer no-arg constructor");
	}
}
