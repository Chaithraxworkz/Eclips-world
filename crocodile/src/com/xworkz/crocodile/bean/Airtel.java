package com.xworkz.crocodile.bean;

import org.springframework.stereotype.Component;
import com.xworkz.crocodile.Provider;

@Component
public class Airtel implements Provider
{
	public Airtel() 
	{
		System.out.println("created the airtel const");
	}
	
	public void connect() 
	{
		System.out.println("Running the airtel");
	}

}
