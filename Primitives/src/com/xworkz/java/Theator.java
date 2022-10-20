package com.xworkz.java;

public class Theator 
{
	public String name;
	public String location;
	public double price;
	public String types;
	public SeatType seatType;
	public String[] timings;
	public long[] queue;
	
	public Theator(String name,String location,double price,String types,String[] timings,SeatType seatType,long[] queue)
	{
		this.name=name;
		this.location=location;
		this.price=price;
		this.types=types;
		this.seatType=seatType;
		this.timings=timings;
		this.queue=queue;
	}
	public void display()
	{
		System.out.println(this.name);
		System.out.println(this.location);
		System.out.println(this.price);
		System.out.println(this.types);
		System.out.println(this.seatType);
		for (int i = 0; i <this. queue.length; i++)
		{
			long lib = this.queue[i];
			System.out.println(lib);
		}
		for (int i = 0; i < this.timings.length; i++)
		{
			String lib1 = this.timings[i];
			System.out.println(lib1);
		}
	}
	
	
}
