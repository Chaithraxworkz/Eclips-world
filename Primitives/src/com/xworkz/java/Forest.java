package com.xworkz.java;

public class Forest 
{
	public  String name;
	public int totalArea;
	public String type;
	public String region;
	public int ticketPrice;
	public int[] areas;
	public String[] primaryAnimals;
	public String[] locations;
	public String[] birds;
	public String[] trees;
	public boolean[] rainForest;
	
	public Forest( String name,int totalArea,String type,String region,int ticketPrice,int[] Areas,String[] primaryAnimals,String[] locations,String[] birds,String[] birds,boolean[] rainForest)
	{
		this.name=name;
		this.totalArea=totalArea;
		this.type=type;
		this.region=region;
		this.ticketPrice=ticketPrice;
		this.areas=areas;
		this.primaryAnimals=primaryAnimals;
		this.locations=locations;
		this.birds=birds;
		this.trees=trees;
		this.rainForest=rainForest;
	}
	public void disply()
	{
		System.out.println(this.name);
		System.out.println(this.totalArea);
		System.out.println(this.type);
		System.out.println(this.region);
		System.out.println(this.ticketPrice);
		for (int i = 0; i < this.areas.length; i++) 
		{
			int j = this.areas[i];
			System.out.println(j);
		}
		for (int i = 0; i < this.primaryAnimals.length; i++)
		{
			String j1 = this.primaryAnimals[i];
			System.out.println(j1);
		}
		for (int i = 0; i < this.locations.length; i++)
		{
			String j2 = this.locations.length[i];
			System.out.println(j2);
		}
		for (int i = 0; i < this.birds.length; i++)
		{
			String j3 = this.birds[i];
			System.out.println(j3);
		}
		for (int i = 0; i < this.trees.length; i++) 
		{
			String j4 = this.trees[i];
			System.out.println(j4);
		}
		for (int i = 0; i < this.rainForest.length; i++) 
		{
			boolean j5 = this.rainForest[i];
			System.out.println(j5);
		}
	}
	
}
