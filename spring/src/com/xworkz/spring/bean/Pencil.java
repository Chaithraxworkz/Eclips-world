package com.xworkz.spring.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Pencil 
{
	@Autowired
	@Qualifier("namadeya")
	private String name;
	@Autowired
	@Qualifier("pencilType")
	private String type;
	@Autowired
	private double price;
	@Autowired
	@Qualifier("banna")
	private String color;
	@Autowired
	@Qualifier("sharp")
	private boolean sharp;
	@Autowired
	@Qualifier("pencilStolen")
	private boolean stolen;
	
	@Override
	public String toString()
	{
		return "Pencil [name=" + name + ", type=" + type + ", price=" + price + ", color=" + color + ", sharp=" + sharp
				+ ", stolen=" + stolen + "]";
	}
}
