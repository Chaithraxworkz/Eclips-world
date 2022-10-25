package com.xworkz.decoder.pride;

public class Sweet 
{
	public static String shopName;
	public String name;
	public double price=500;
	public Color color= Color.WHITE;
	public double quantity;

	public Sweet(String name)
	{
		this.name=name;
	}
	public void  setprice(double price)
	{
		this.price=price;
	}
	public void display()
	{
		System.out.println(this.shopName);
		System.out.println(this.name);
		System.out.println(this.color);
		System.out.println(this.price);
		System.out.println(this.quantity);
	}
	public void displayTotalPrice()
	{
		double total=price*quantity;
		System.out.println("The total price is"+ total);
	}
	static
	{
		Sweet.shopName="Padma_Nilaya";
	}
}

