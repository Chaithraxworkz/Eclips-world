package com.xworkz.things;

public class Chain 
{
	public String type;
	public double price;
	public int length;
	public String material;
	public int weight;
	public String stolen;
	public String usedFor;
	public String fresh;
	
	public Chain()
	{
		System.out.println("Enter the details of no-arg's list");
	}
	public Chain(String type)
	{
		super();
		this.type=type;
	}
	public Chain(double price,int length)
	{
		this("circle");
		this.price=price;
		this.length=length;
	}
	public Chain(int length,double price,String material)
	{
		this(500,length);
		this.material=material;
	}
	public Chain(String material,int weight,String stolen)
	{
		this(material,10);
		this.weight=weight;
		this.stolen=stolen;
	}
	public Chain(int weight,String stolen,String usedFor)
	{
		this("belt",15,stolen);
		this.usedFor=usedFor;
	}
	public Chain(int weight,String stolen,string usedFor,String fresh)
	{
		this(weight,stolen,usedFor);
		this.usedFor=this.usedFor;
		this.fresh=fresh;
	}
	
}
