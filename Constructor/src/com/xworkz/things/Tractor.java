package com.xworkz.things;

public class Tractor 
{
	public String name;
	public String Brand;
	public double price;
	public String color;
	public double hp;
	public String model;
	
	public Tractor()
	{
		System.out.println("Details of the tractor");
	}
	public Tractor(String name)
	{
		this.name=name;
	}
	public Tractor(String name,String Brand,double price)
	{
		this(name);
		this.Brand=Brand;
		this.price=price;
	}
	public Tractor(String name,String Brand,double price, String color)
	{
		this(name,Brand,price);
		this.color=color;
	}
	public Tractor(String model,double hp,String color)
	{
		this(hp,color);
		this.model=model;
	}
	public Tractor(double hp,double price,String color,String model)
	{
		this(model,price,color);
		this.hp=hp;
	}
	public Tractor(String name,double hp,String color,String Brand,double price)
	{
		this(name,Brand,hp,color);
		this.price=price;
	}
}
