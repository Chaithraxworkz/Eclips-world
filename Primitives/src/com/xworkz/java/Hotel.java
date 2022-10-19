package com.xworkz.java;

public class Hotel 
{
	public String hotelName;
	public String location;
	public int bill;
	public String start_Date;
	public boolean buffee;
	public String[] items;
	public String[] types;
	public int[] quantity;
	
	public Hotel(String hotelName,String location,int bill,String start_Date,boolean buffee,String[] items,String[] types,int[] quantity) 
	{
		this.hotelName=hotelName;
		this.location=location;
		this.bill=bill;
		this.start_Date=start_Date;
		this.buffee=buffee;
		this.items=items;
		this.types=types;
		this.quantity=quantity;
	}
	public void display()
	{
		System.out.println(this.hotelName);
		System.out.println(this.location);
		System.out.println(this.bill);
		System.out.println(this.start_Date);
		System.out.println(this.buffee);
		for (int i = 0; i < this.items.length; i++) 
		{
			String string = this.items[i];
			System.out.println(string);
		}
		for (int i = 0; i < this.types.length; i++) 
		{
			String string1 = this.types[i];
			System.out.println(string1);
		}
		for (int i = 0; i < this.quantity.length; i++) 
		{
			int string2 = this.quantity[i];
			System.out.println(string2);
		}
	}
}
