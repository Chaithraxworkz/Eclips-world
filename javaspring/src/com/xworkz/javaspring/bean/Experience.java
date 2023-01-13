package com.xworkz.javaspring.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Experience 
{
	@Autowired
	private Skill skill;
	
	public Experience() 
	{
		System.out.println("Created the Experience no-arg constructor");
	}
	public void Experience()
	{
		System.out.println("Hashcode reference :" +skill.hashCode());
	}
}
