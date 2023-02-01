package com.xworkz.sunlite.component;

import org.springframework.stereotype.Component;

@Component
public class HeadPhonesComponent 
{
	public HeadPhonesComponent() 
	{
		System.out.println("Created " + this.getClass().getSimpleName());
	}
}

