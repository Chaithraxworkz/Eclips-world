package com.xworkz.goa.dto;

import lombok.Data;

@Data
public class BeachDTO 
{
	private String name;
	private String location;
	private boolean clean;
	private String games;
	
	public BeachDTO() 
	{
		System.out.println("created" + this.getClass().getSimpleName());
	}
	
}
