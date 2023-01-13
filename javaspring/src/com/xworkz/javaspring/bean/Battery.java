package com.xworkz.javaspring.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Battery 
{
	@Autowired
	private Capacity capacity;
	
	public Battery() 
	{
		System.out.println("created the battery of no-arg constructor ");
	}
	public void Batterycharge()
	{
		System.out.println("Hashcode ref :" + capacity.hashCode());
	}
}
