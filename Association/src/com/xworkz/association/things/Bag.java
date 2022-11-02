package com.xworkz.association.things;

public class Bag 
{
	public String name;
	public String brand;
	public double price;
	public String quality;
	public boolean itsWorking;
	public String shopName;
	public String location;
	public String type;
	public String color;
	public boolean wheels;
	
	
	public Bag(String brand, double price, String quality, String shopName, String location, String type,
			boolean wheels) {
		super();
		this.brand = brand;
		this.price = price;
		this.quality = quality;
		this.shopName = shopName;
		this.location = location;
		this.type = type;
		this.wheels = wheels;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public void setItsWorking(boolean itsWorking)
	{
		this.itsWorking=itsWorking;
	}
	public void setColor(String color)
	{
		this.color=color;
	}
	public String getName()
	{
		return name;
	}
	public boolean getItsWorking() 
	{
		return itsWorking;
	}
	public String getColor()
	{
		return color;
	}
}
