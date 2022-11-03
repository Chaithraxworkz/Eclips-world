package com.xworkz.association.things;

public class Pet
{
	public String name;
	String food; 
	public String age;
	public String color;
	private double weight;
	public double height;
	private String owner_Name;
	public long PhNo;
	public String Address;
	private double dogPrice=30000;
	public boolean walking;
	
	
	public String getName()
	{
		return name;
	}
	void setName(String name)
	{
		this.name=name;
	}
	public String getFood()
	{
		return food;
	}
	void setFood(String food)
	{
		this.food=food;
	}
	public String getAge()
	{
		return age;
	}
	void setAe(String age)
	{
		this.age=age;
	}
	public double getWeight()
	{
		return weight;
	}
	void setWeight(double weight)
	{
		this.weight=weight;
	}
	public String getColor()
	{
		return color;
	}
	void setColor(String color)
	{
		this.color=color;
	}
	public double getHeight()
	{
		return height;
	}
	void setHeight(double height)
	{
		this.height=height;
	}
	public String getOwnerName()
	{
		return owner_Name;
	}
	void setOwnerName(String owner_Name)
	{
		this.owner_Name=owner_Name;
	}
	public long getPhNo()
	{
		return PhNo;
	}
	void setPhNo(long phNo)
	{
		this.PhNo=phNo;
	}
	public String getAddress()
	{
		return Address;
	}
	void setAddress(String address)
	{
		this.Address=address;
	}
	public boolean getWalking()
	{
		return walking;
	}
	void setWalking(boolean walking)
	{
		this.walking=walking;
	}
}
