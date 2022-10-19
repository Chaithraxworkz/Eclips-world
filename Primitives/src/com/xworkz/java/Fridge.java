package com.xworkz.java;

public class Fridge
{
	public String brand;
	public String modelNo;
	public String capacity;
	public int size;
	public String[] doors;
	public  String[] color;
	public double height;
	public String[] types;
	public String[] shopFrom;
	
	public Fridge(String brand,String modelNo,String capacity,int size,String[] doors,String[] color,double height,String[] types,String[] shopFrom)
	{
		this.brand=brand;
		this.modelNo=modelNo;
		this.capacity=capacity;
		this.size=size;
		this.doors=doors;
		this.color=color;
		this.height=height;
		this.types=types;
		this.shopFrom=shopFrom;
	}
	public void display()
	{
		System.out.println(this.brand);
		System.out.println(this.modelNo);
		System.out.println(this.capacity);
		System.out.println(this.size);
		System.out.println(this.height);
		for (int i = 0; i < this.color.length; i++)
		{
			String act = this.color[i];
			System.out.println(act);
		}
		for (int i = 0; i < this.doors.length; i++) 
		{
			String act1 = this.doors[i];
			System.out.println(act1);
		}
		for (int i = 0; i < this.types.length; i++) 
		{
			String act2 = this.types[i];
			System.out.println(act2);
		}
		for (int i = 0; i < this.shopFrom.length; i++) 
		{
			String act3 = this.shopFrom[i];
			System.out.println(act3);
		}
	}
}
