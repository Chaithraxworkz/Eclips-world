package com.xworkz.java;

public class Mixer 
{
	public String name;
	public String capacity;
	public String brand;
	public int noOfSped;
	public double price;
	public int[] noOfJars;
	public String[] jarTypes;
	public String[] colors;
	public boolean[] stainlessSteel;
	public String[] shops;
	
	public Mixer(String name,String capacity,String brand,int noOfSpeed,double price,int[] noOfJars,String[] jarTypes,String[] colors,boolean[] stainlessSteel,String[] shops)
	{
		this.name=name;
		this.capacity=capacity;
		this.brand=brand;
		this.noOfSpeed=noOfSpeed;
		this.price=price;
		this.noOfJars=this.noOfJars;
		this.jarTypes=jarTypes;
		this.colors=colors;
		this.stainlessSteel=stainlessSteel;
		this.shops=shops;
	}
	public void display()
	{
		System.out.println(this.name);
		System.out.println(this.capacity);
		System.out.println(this.brand);
		System.out.println(this.noOfSpeed);
		System.out.println(this.price);
		for (int i = 0; i < this.colors.length; i++) 
		{
			String code = this.colors[i];
			System.out.println(code);
		}
		for (int i = 0; i < this.noOfJars.length; i++) 
		{
			int code1 = this.noOfJarsl[i];
			System.out.println(code1);
		}
		for (int i = 0; i < this.jarTypes.length; i++) 
		{
			String code2 = this.jarTypesl[i];
			System.out.println(code2);
		}
		for (int i = 0; i < this.stainlessSteel.length; i++)
		{
			boolean code3 = this.stainlessSteel[i];
			System.out.println(code3);
		}
		for (int i = 0; i < this.shops.length; i++)
		{
			String code4 = this.shops[i];
			System.out.println(code4);
		}
	}
}
