package com.xworkz.decoder.pride;

public class ShirtBrand 
{
	public static String brand;
	public String color;
	public ShirtTypes type=ShirtTypes.HALF_SLEEVE;
	public double price;
	public String size;
	
	public ShirtBrand(String color)
	{
		this.color=color;
	}
	public void setprice(double price)
	{
		this.price=price;
	}
	public void display()
	{
		System.out.println(this.brand);
		System.out.println(this.color);
		System.out.println(this.type);
		System.out.println(this.size);
		System.out.println(this.price);
		
	}
	static
	{
		ShirtBrand.brand="Louis ";
	}
}
