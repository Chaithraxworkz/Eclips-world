package com.xworkz.javaspring.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CameraMan 
{
	@Autowired
	private Camera camera;
	
	public CameraMan() 
	{
		System.out.println("Created the CameraMan no-arg constructor");
	}
	public void CameraMan()
	{
		System.out.println("Hashcode reference :" + camera.hashCode() );
	}
}
