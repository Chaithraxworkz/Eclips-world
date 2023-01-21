package com.xworkz.decoder.pride;

public class Flower 
{
	public static String shop_Name;
	public Flower_Name name=Flower_Name.ORCHID;
	public String color;
	public int quantity;
	public double price=799; 
	
	public Flower(String color)
	{
		this.color=color;
	}
	public void setprice(double price)
	{
		this.price=price;
	}
	public void display()
	{
		System.out.println(this.shop_Name);
		System.out.println(this.name);
		System.out.println(this.color);
		System.out.println(this.price);
		System.out.println(this.quantity);
	}
	public void displayTotalPrice()
	{
		double total=price*quantity;
		System.out.println("Total price of the flower"+total);
	}
	static
	{
		Flower.shop_Name="Wild Orchid Flower Shop.";
	}
}
