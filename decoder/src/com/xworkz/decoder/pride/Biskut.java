package com.xworkz.decoder.pride;

public class Biskut 
{
	public final String brand="Britaniya";
	public String name;
	public double price;
	public String manf_Date;
	public double weight;
	
	
	public Biskut(String name, double price, String manf_Date, double weight)
	{
		super();
		this.name = name;
		this.price = price;
		this.manf_Date = manf_Date;
		this.weight = weight;
	}

	public void showoff()
	{
		System.out.println("Enter the details of the biskut");
		System.out.println(this.name);
		System.out.println(this.price);
		System.out.println(this.manf_Date);
		System.out.println(this.weight);
	}
	static
	{
		
	}
}
