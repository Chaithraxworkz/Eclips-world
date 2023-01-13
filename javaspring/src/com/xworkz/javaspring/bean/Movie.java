package com.xworkz.javaspring.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Movie 
{
	@Autowired
	private Director director;
	@Autowired
	private Producer producer;
	public Movie() 
	{
		System.out.println("Created the movie of no-arg constructor");
	}
	public void Moviedirector()
	{
		System.out.println("Hashcode reference :" + director.hashCode());
		System.out.println("Hashcode reference :"+ producer.hashCode());
	}
}
