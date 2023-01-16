package com.xworkz.crocodile.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.xworkz.crocodile.Fuel;
import com.xworkz.crocodile.PetrolBunk;

@Component
public class Shell implements PetrolBunk 
{
	@Autowired
	@Qualifier("petrol")
	public Fuel fuel;

	public Shell() 
	{
		System.out.println("created the shell");
	}
	public void purchase() 
	{
		System.out.println("running the purchase");
	}

}
