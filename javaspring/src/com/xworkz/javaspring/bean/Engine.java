package com.xworkz.javaspring.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Engine 
{
	private String name;
	private String type;
	@Value("59452")
	private long number;
	@Value("4.53")
	private double version;
	private String company;
	private int strokes;
	
	public Engine(@Qualifier("nameOfEngine") String name,@Qualifier("typeOFEngine") String type,@Qualifier("companyname") String company) 
	{
		super();
		this.name = name;
		this.type = type;
		this.company = company;
	}
	
	@Override
	public String toString() {
		return "Engine [name=" + name + ", type=" + type + ", number=" + number + ", version=" + version + ", company="
				+ company + ", strokes=" + strokes + "]";
	}

	@Value("6")
	public void setStrokes(int strokes) 
	{
		this.strokes = strokes;
	}
	
	
}
