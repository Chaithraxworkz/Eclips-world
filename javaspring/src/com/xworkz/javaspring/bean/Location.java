package com.xworkz.javaspring.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Location 
{
	@Autowired
	private Area area;
	
	public Location() 
	{
		System.out.println("Created the Loation using no-arg const");
	}
	public void AreaOfLocation()
	{
		System.out.println("Hashcode reference :"+ area.hashCode());
	}
}
