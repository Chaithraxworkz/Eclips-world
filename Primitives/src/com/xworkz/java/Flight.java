package com.xworkz.java;

public class Flight 
{
	public String name;
	public String flightNo;
	public double price;
	public String startFrom;
	public String landing;
	public String[] location;
	public String[] foods;
	public double[] noOfPassengers;
	public String[] juice;
	
	public Flight(String name,String flightNo,double price,String startFrom,String landing,String[] location,String[] foods,double[] noOfPassengers,String[] juice)
	{
		System.out.println("To enter the details of the flights");
		this.name=name;
		this.flightNo=flightNo;
		this.price=price;
		this.startFrom=startFrom;
		this.landing=landing;
		this.location=location;
		this.foods=foods;
		this.noOfPassengers=noOfPassengers;
		this.juice=juice;
	}
	public void display()
	{
		System.out.println(this.name);
		System.out.println(this.flightNo);
		System.out.println(this.price);
		System.out.println(this.startFrom);
		System.out.println(this.landing);
		for (int i = 0; i < this.foods.length; i++)
		{
			String obj = this.foods[i];
			System.out.println(obj);
		}
		for (int i = 0; i < this.location.length; i++) 
		{
			String obj1 = this.location[i];
			System.out.println(obj1);
		}
		for (int i = 0; i < this.noOfPassengers.length; i++) 
		{
			double obj2 = this.noOfPassengers[i];
			System.out.println(obj2);
		}
		for (int i = 0; i < this.juice.length; i++) 
		{
			String obj4 = this.juice[i];
			System.out.println(obj4);
		}
	}
}
