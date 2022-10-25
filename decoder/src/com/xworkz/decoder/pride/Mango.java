package com.xworkz.decoder.pride;

public class Mango
{
	public static String name;
	public String color;
	public boolean sweet;
	public States state=States.UP;
	public double price; 
	
	public Mango(String color)
	{
		this.color=color;
	}
	public void setprice(double price)
	{
		this.price=price;
	}
	public void display()
	{
		System.out.println(this.name);
		System.out.println(this.color);
		System.out.println(this.sweet);
		System.out.println(this.state);
		System.out.println(this.price);
	}
	static
	{
		Mango.name="Badami";
	}
}
