package com.xworkz.java;

public class Toothpaste
{
	public String name;
	public String brand;
	public String manufacturedDate;
	public String expirydate;
	public double gram;
	public int price;
	public String[] color;
	public String[] flavors;
	public double[] size;
	public String[] purpose;
	public int[] batchNo;
	public float[] MolecularWeight;
	
	public Toothpaste(String name,String brand,String manufacturedDate,String expirydate,int price,String[] color,String[] flavors,double[] size,int[] batchNo,String[] purpose)
	{
		this.name=name;
		this.brand=brand;
		this.manufacturedDate=manufacturedDate;
		this.expirydate=expirydate;
		this.gram=gram;
		this.price=price;
		this.color=color;
		this.flavors=flavors;
		this.size=size;
		this.batchNo=batchNo;
		this.purpose=purpose;
	}
	public void display()
	{
		System.out.println(this.name);
		System.out.println(this.brand);
		System.out.println(this.manufacturedDate);
		System.out.println(this.expirydate);
		System.out.println(this.gram);
		System.out.println(this.price);
		for (int i = 0; i < this.color.length; i++) 
		{
			String f1 = this.color[i];
			System.out.println(f1);
		}
		for (int i = 0; i < this.flavors.length; i++) 
		{
			String f2 = this.flavors[i];
			System.out.println(f2);
		}
		for (int i = 0; i < this.size.length; i++) 
		{
			double f3 = this.size[i];
			System.out.println(f3);
		}
		for (int i = 0; i < this.purpose.length; i++) 
		{
			String f4 = this.purpose[i];
			System.out.println(f4);
		}
		for (int i = 0; i < this.batchNo.length; i++) 
		{
			int f5 = this.batchNo[i];
			System.out.println(f5);
		}
	}
}
