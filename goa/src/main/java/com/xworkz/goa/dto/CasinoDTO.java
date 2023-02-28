package com.xworkz.goa.dto;

import lombok.Data;

@Data
public class CasinoDTO 
{
	 private String name;
	 private String crusie;
	 private double entryFee;
	 private boolean freeFood;
	 private boolean freeAlcohal;
	 
	 
	public CasinoDTO() 
	{
		System.out.println("Created the GoaDTO");
	}
	
}
