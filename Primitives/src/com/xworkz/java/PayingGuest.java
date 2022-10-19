package com.xworkz.java;

public class PayingGuest 
{
	public String name;
	public long rent;
	public int rooms;
	public String type;
	public String location;
	public String[] breakFast;
	public String[] Dinner;
	public String[] categary;
	public String[] facilities;
	public String[] roomMates; 
	
	public PayingGuest(String name,long rent,int rooms,String type,String location,String[] breakFast,String[] Dinner,String[] categary,String[] fcilities,String[] roomMates)
	{
		this.name=name;
		this.rent=rent;
		this.rooms=rooms;
		this.type=type;
		this.location=location;
		this.breakFast=breakFast;
		this.Dinner=Dinner;
		this.categary=categary;
		this.facilities=facilities;
		this.roomMates=roomMates;
	}
	public void display()
	{
		System.out.println(this.name);
		System.out.println(this.rent);
		System.out.println(this.rooms);
		System.out.println(this.type);
		System.out.println(this.location);
		for (int i = 0; i < this.breakFast.length; i++) 
		{
			String string = this.breakFast[i];
			System.out.println(string);
		}
		for (int i = 0; i < this.Dinner.length; i++) 
		{
			String string = this.Dinner[i];
			System.out.println(string);
		}
		for (int i = 0; i < this.categary.length; i++) 
		{
			String string = this.categary[i];
			System.out.println(string);
		}
		for (int i = 0; i < this.facilities.length; i++) 
		{
			String string = this.facilities[i];
			System.out.println(string);
		}
		for (int i = 0; i < this.roomMates.length; i++)
		{
			String string = this.roomMates[i];
			System.out.println(string);
		}
	}
}
