package com.xworkz.association.things;

public class Shirt 
{
	public String brand;
	public double price;
	public String size="XL";
	public double quality;
	public String color;
	public String type="T-Shirt";
	public String country;
	public String owner_Name;
	public boolean sleaves;
	public double quantity=32;
	public String age;
	
	public Shirt(String brand, double price, double quality, String color, String country, String owner_Name,
			boolean sleaves, String age) {
		super();
		this.brand = brand;
		this.price = price;
		this.quality = quality;
		this.color = color;
		this.country = country;
		this.owner_Name = owner_Name;
		this.sleaves = sleaves;
		this.age = age;
	}
	public void setSize(String size)
	{
		this.size=size;
	}
	public void setType(String type)
	{
		this.type=type;
	}
	public void setQuantity(double quantity)
	{
		this.quantity=quantity;
	}
	public String getSize()
	{
		return size;
	}
	public String getType()
	{
		return type;
	}
	public double getQuantity()
	{
		return quantity;
	}
	
}
