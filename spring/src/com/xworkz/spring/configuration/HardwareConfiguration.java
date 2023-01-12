package com.xworkz.spring.configuration;

import java.time.LocalDate;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz.spring")
public class HardwareConfiguration 
{
	public HardwareConfiguration() 
	{
		System.out.println("Details of HardwareConfiguration");
	}
	@Bean
	public int id()
	{
		System.out.println("Registering the Id");
		return 5501;
	}
	@Bean
	public String HWshopName()
	{
		System.out.println("Registering the shopName");
		return "Sri Shakti";
	}
	@Bean
	public String gross()
	{
		System.out.println("Registering the Gross");
		return "SYB54261HB";
	}
	@Bean
	public String shopOwner()
	{
		System.out.println("Registering the shopOwner");
		return "Chidanand";
	}
	@Bean
	public String stala()
	{
		System.out.println("Registering the stala");
		return "Vijaynagar";
	}
	
	@Bean
	public String namadeya()
	{
		System.out.println("Registered namadeya");
		return "Apsara";
	}
	@Bean
	public String pencilType()
	{
		System.out.println("Registered pencilType");
		return "Drawing pencil";
	}
	@Bean
	public double price()
	{
		System.out.println("Registered price");
		return 15;
	}
	@Bean
	public String banna()
	{
		System.out.println("Registered banna");
		return "Black";
	}
	@Bean
	public boolean sharp()
	{
		System.out.println("Registered sharp");
		return true;
	}
	@Bean
	public boolean pencilStolen()
	{
		System.out.println("Registered pencilStolen");
		return false;
	}
	@Bean("mobname")
	public String name()
	{
		return "VIVO";
	}
	@Bean("mobprice")
	public double pencilprice()
	{
		return 20000d;
	}
	@Bean("mobcolor")
	public String color()
	{
		return "Blue";
	}
	@Bean("mobmodel")
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

	@Bean
	public String rubbername()
	{
		System.out.println("Registered namadeya");
		return "Nataraja";
	}
	@Bean
	public String rubberType()
	{
		System.out.println("Registered pencilType");
		return "Ink Rubber";
	}@Bean
	public double rubberprice()
	{
		System.out.println("Registered price");
		return 20;
	}
	@Bean
	public String rubbercolor()
	{
		System.out.println("Registered banna");
		return "Brown";
	}
	@Bean
	public boolean rubbersharp()
	{
		System.out.println("Registered sharp");
		return true;
	}
	@Bean
	public boolean rubberlStolen()
	{
		System.out.println("Registered pencilStolen");
		return false;
	}
	@Bean
	public double size()
	{
		System.out.println("Registered size");
		return 3.5;
	}
	
	@Bean
	public String shopName()
	{
		System.out.println("Registered shopName");
		return "Dell Laptop";
	}
	@Bean
	public double version()
	{
		System.out.println("Registered version");
		return 11.65;
	}
	@Bean
	public String softwaredeveloper()
	{
		System.out.println("Registered softwaredeveloper");
		return "Srusti";
	}
	@Bean
	public LocalDate date()
	{
		System.out.println("Registered date");
		return LocalDate.now();
	}
	@Bean
	public boolean free()
	{
		System.out.println("Registered free");
		return true;
	}
	@Bean
	public String engineerName()
	{
		System.out.println("Registered engineerName");
		return "Chaithra";
	}
	@Bean
	public double salary()
	{
		System.out.println("Registered salary");
		return 25000;
	}
	@Bean
	public String softwaryCompany()
	{
		System.out.println("Registered softwaryCompany");
		return "Infosys";
	}@Bean
	public boolean experience()
	{
		System.out.println("Registered experience");
		return false;
	}


}
