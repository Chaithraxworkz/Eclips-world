package com.xworkz.crocodile.bean;

import org.springframework.stereotype.Component;
import com.xworkz.crocodile.Browser;

@Component
public class FireBox implements Browser
{
	public FireBox() 
	{
		System.out.println("created the firebox const");
	}

	public void browser() 
	{
		System.out.println("Running firebox");
	}

}
