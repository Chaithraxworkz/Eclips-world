package com.xworkz.javaspring.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Company 
{
	@Autowired
	private Location location;
	
	public Company() 
	{
		System.out.println("created the Location no-arg const");
	}
	public void CompanyLocation()
	{
		System.out.println("HashCode reference :"+location.hashCode());
	}
}
