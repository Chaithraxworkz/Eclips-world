package com.xworkz.spring.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Rubber 
{
	@Autowired
	@Qualifier("namadeya")
	private String name;
	@Autowired
	@Qualifier("rubberType")
	private String type;
	@Autowired
	@Qualifier("price")
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
	@Autowired
	@Qualifier("size")
	private double size;
	
	@Override
	public String toString() 
	{
		return "Rubber [name=" + name + ", type=" + type + ", price=" + price + ", color=" + color + ", sharp=" + sharp
				+ ", stolen=" + stolen + ", size=" + size + "]";
	}

	
}
