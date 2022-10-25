package com.xworkz.decoder.pride;

public class Saloon 
{
	public static String shop_Name;
	public String location="vijay Nagar";
	public long phone_No;
	public Types type=Types.BEAUTY;
	public double price;
	
	public Saloon(long phone_No)
	{
		this.phone_No=phone_No;
	}
	public void setprice(double price)
	{
		this.price=price;
	}
	public void display()
	{
		System.out.println(this.shop_Name);
		System.out.println(this.location);
		System.out.println(this.phone_No);
		System.out.println(this.type);
		System.out.println(this.price);
	}
	static
	{
		Saloon.shop_Name="Smart & Glam";
	}
	
}