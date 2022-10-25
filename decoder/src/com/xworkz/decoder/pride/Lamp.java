package com.xworkz.decoder.pride;

public class Lamp 
{
	public static String brand;
	public Lights name=Lights.ANTIQUE;
	public double price=1500;
	public String type;
	public char voltage;
	
	public Lamp( String type) 
	{
		this.type = type;
	}
	public void setprice(double price)
	{
		this.price = price;
	}
	public void display()
	{
		System.out.println(this.brand);
		System.out.println(this.name);
		System.out.println(this.price);
		System.out.println(this.type);
		System.out.println(this.voltage);
	}
	static
	{
		Lamp.brand="Philips";
	}
	
}
