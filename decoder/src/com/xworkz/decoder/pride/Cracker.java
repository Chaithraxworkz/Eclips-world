package com.xworkz.decoder.pride;
import com.xworkz.decoder.pride.TypesOfCrackers;

public class Cracker
{
	public static String name;
	public String color="Multicolor";
	public double price;
	public TypesOfCrackers type;
	public  double quantity;
	
	public Cracker(double price)
	{
		this.price=price;
	}
	
	public void setquantity(double quantity)
	{
		this.quantity=quantity;
	}
	public void display()
	{
		System.out.println(this.name);
		System.out.println(this.color);
		System.out.println(this.price);
		System.out.println(this.type);
		System.out.println(this.quantity);
	}
	public void dispalyTotalPrice()
	{
		double total=quantity*price;
		System.out.println("total the cracker price"+total);
	}
	static
	{
		Cracker.name="Sivakasi";
	}
}
