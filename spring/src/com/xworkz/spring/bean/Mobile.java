package com.xworkz.spring.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component
public class Mobile 
{
	@Autowired
	@Qualifier("mobname")
	private String name;
	@Autowired
	@Qualifier("mobprice")
	private double price;
	@Autowired
	@Qualifier("mobcolor")
	private String color;
	@Autowired
	@Qualifier("mobmodel")
	private String model;
	@Autowired
	@Qualifier("ram")
	private double ram;
	@Autowired
	@Qualifier("camera")
	private boolean dualCamera;
	@Autowired
	@Qualifier("gst")
	private String gstNo;
	@Autowired
	@Qualifier("model")
	private String modelNo;
	@Autowired
	@Qualifier("sim")
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
