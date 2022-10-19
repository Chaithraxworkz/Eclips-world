package com.xworkz.java;

public class Mobile 
{
	public String name;
	public String model;
	public double price;
	public String phoneNo;
	public double weight;
	public String[] color;
	public int[] ram;
	
	public Mobile(String name,String model,double price,String phoneNo,double weight, String[] color,int[] ram)
	{
		this.name=name;
		this.model=model;
		this.price=price;
		this.phoneNo=phoneNo;
		this.weight=weight;
		this.color=color;
		this.ram=ram;
	}
	public void display()
	{
		System.out.println(this.name);
		System.out.println(this.model);
		System.out.println(this.price);
		System.out.println(this.phoneNo);
		System.out.println(this.weight);
		for (int i = 0; i < this.color.length; i++) 
		{
			String string = this.color[i];
			System.out.println(string);
		}
		for (int i = 0; i < this.ram.length; i++) 
		{
			int string = this.ram[i];
			System.out.println(string);
		}
	}
}
