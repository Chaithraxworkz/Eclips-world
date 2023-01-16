package com.xworkz.crocodile.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import com.xworkz.crocodile.Browser;
import com.xworkz.crocodile.Provider;


@Component
public class Chrome implements Browser
{
	@Autowired
	@Qualifier("jio")
	public Provider provider;
	
	public Chrome() 
	{
		System.out.println("Created the Chrome");
	}

	public void browser() 
	{
		System.out.println("Running chrome");
		provider.connect();
	}
	

}
