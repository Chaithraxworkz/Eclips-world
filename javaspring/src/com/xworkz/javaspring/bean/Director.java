package com.xworkz.javaspring.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Director 
{
	@Autowired
	private Experience experience;
	
	@Autowired
	private CameraMan cameraMan;
	
	public Director() 
	{
		System.out.println("Created the director no-arg constructor");
	}
	
	public void Director()
	{
		System.out.println("Hashcode reference :"+ experience.hashCode());
		System.out.println("Hashcode reference :"+ cameraMan.hashCode());
	}
}
