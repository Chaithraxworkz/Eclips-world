package com.xworkz.decoder.pride;

public class Milk 
{
	public static String brand;
	public int founded;
	public MilkProducts products=MilkProducts.ICECREAM;
	public double price;
	public double quantity;
	
	public Milk(int founded)
	{
		this.founded=founded;
	}
	public void setprice(double price)
	{
		this.price=price;
	} 
	public void display()
	{
		System.out.println(this.brand);
		System.out.println(this.founded);
		System.out.println(this.products);
		System.out.println(this.price);
		System.out.println(this.quantity);
	}
	public void displayTotalPrice()
	{
		double total=price*quantity;
		System.out.println("enter the total price of the milk"+ total);
	}
	static
	{
		Milk.brand="Nandini";
	}

}
