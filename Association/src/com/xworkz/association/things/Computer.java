package com.xworkz.association.things;

public class Computer 
{
	public String brand;
	public double price;
	public String ram;
	public double quality;
	public boolean camera;
	public String manfufacturedBy;
	public String windows;
	public int rating;
	public double weight;
	public double height;
	
	
	public Computer(String brand, String ram, double quality, String manfufacturedBy, String windows, int rating,
			double weight, double height) {
		super();
		this.brand = brand;
		this.ram = ram;
		this.quality = quality;
		this.manfufacturedBy = manfufacturedBy;
		this.windows = windows;
		this.rating = rating;
		this.weight = weight;
		this.height = height;
	}
	public double getPrice() 
	{
		return price;
	}
	public void setPrice(double price)
	{
		this.price=price;
	}
	public boolean getCamera()
	{
		return camera;
	}
	public void setCamera(boolean camera)
	{
		this.camera=camera;
	}
}
