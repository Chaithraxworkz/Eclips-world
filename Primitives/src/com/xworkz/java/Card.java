package com.xworkz.java;

public class Card
{
	public String name;
	public String[] colors;
	public int width;
	public String acc_No;
	public int height;
	public double price;
	public String[] types;
	public String[] shapes;
	public String[] events;
	
	public Card(String name,int width,String acc_No,int height,String[] colors,double price,String[] type,String[] shapes,String[] events)
	{
		System.out.println("details of the cards");
		this.name=name;
		this.width=width;
		this.height=height;
		this.price=price;
		this.colors=colors;
		this.types=types;
		this.shapes=shapes;
		this.events=events;
		this.acc_No=acc_No;
	}
	public void display()
	{
		System.out.println(this.name);
		System.out.println(this.width);
		System.out.println(this.height);
		System.out.println(this.price);
		System.out.println(this.acc_No);
		for (int i = 0; i < this.colors.length; i++) 
		{
			String string = this.colors[i];
			System.out.println(string);
		}
		for (int i = 0; i < this.types.length; i++) 
		{
			String string = this.types[i];
			System.out.println(string);
		}
		for (int i = 0; i < this.shapes.length; i++)
		{
			String string = this.shapes[i];
			System.out.println(string);
		}
		for (int i = 0; i < this.events.length; i++) 
		{
			String string = this.events[i];
			System.out.println(string);
		}
	}
}
