package com.xworkz.spring.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
@ComponentScan("com.xworkz.spring")
public class MobileConfiguration 
{
	public MobileConfiguration() 
	{
		System.out.println("Details of the MobileConfiguration");
	}
	@Bean("name")
	public String naame()
	{
		return "VIVO";
	}
	@Bean("price")
	public double price()
	{
		return 20000d;
	}
	@Bean("color")
	public String color()
	{
		return "Blue";
	}
	@Bean("GE2.45H")
	public String model()
	{
		return "Kernal";
	}
	@Bean("ram")
	public double ram()
	{
		return 64;
	}
	@Bean("camera")
	public boolean dualCamera()
	{
		return true;
	}
	@Bean("gst")
	public String gstNo()
	{
		return "DSR5420K";
	}
	@Bean("model")
	public String modelNo()
	{
		return "52140B4";
	}
	@Bean("sim")
	public boolean dualSim()
	{
		return true;	
	}

}
