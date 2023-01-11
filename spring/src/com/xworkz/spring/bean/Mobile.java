package com.xworkz.spring.bean;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component
public class Mobile 
{
	private String name;
	private double price;
	private String color;
	private String model;
	private double ram;
	private boolean dualCamera;
	private String gstNo;
	private String modelNo;
	private boolean dualSim;
	
	public Mobile() 
	{
			System.out.println("Running the Mobile");
	}

	@Override
	public String toString() {
		return "Mobile [name=" + name + ", price=" + price + ", color=" + color + ", model=" + model + ", ram=" + ram
				+ ", dualCamera=" + dualCamera + ", gstNo=" + gstNo + ", modelNo=" + modelNo + ", dualSim=" + dualSim
				+ "]";
	}
	
}
