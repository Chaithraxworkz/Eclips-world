package com.xworkz.chaithra.dto;

import lombok.Data;

@Data
public class MobileDTO 
{
	private String brand;
	private String color;
	private double price;
	private boolean dualCamera;
	private String ram;
	
	 public MobileDTO()
	 {
		 System.out.println("created" + this.getClass().getSimpleName());
		 
	 }
}
