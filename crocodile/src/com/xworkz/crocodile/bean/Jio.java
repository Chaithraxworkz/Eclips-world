package com.xworkz.crocodile.bean;

import org.springframework.stereotype.Component;
import com.xworkz.crocodile.Provider;

@Component
public class Jio implements Provider
{
	public Jio() 
	{
		System.out.println("created the jio constructor");
	}

	public void connect() 
	{
		System.out.println("Running jio");
	}

}
