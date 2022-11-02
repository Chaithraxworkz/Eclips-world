package com.xworkz.association.things;

public class Saree 
{
	public String shopName;
	public String name="Mysore Silk";
	double price;
	public String color="Blue";
	public String type;
	public double weight=10.6;
	String quality;
	public String location;
	public long phNo;
	public int noOfEmployees;
	public double rating;
	
	
	public Saree(String shopName,String name, double price, String color, String type, double weight, String location,int noOfEmployees, double rating) {
		
		this.shopName = shopName;
		this.name=name;
		this.price = price;
		this.color = color;
		this.type = type;
		this.weight = weight;
		this.location = location;
		this.noOfEmployees = noOfEmployees;
		this.rating = rating;
	}
	public void setPhNo(long phNo)
	{
		this.phNo=phNo;
	}
	public void setQuality(String quality)
	{
		this.quality=quality;
	}
	
	public long getPhNo()
	{
		return phNo;
	}
	public String getQuality()
	{
		return quality;
	}
}
