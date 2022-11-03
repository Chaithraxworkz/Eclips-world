package com.xworkz.association.things;

public class Chain 
{
	private String name="Texture Design";
	public double price;
	public double net_Weight;
	public String type;
	public double total_Rate;
	private String shop="Malabar Gold";
	String location;
	public long phNo;
	public double GST;
	public boolean almark;
	public String patterns;
	
	public void setprice(double price)
	{
		this.price=price;
	}
	public void setNet_Weight(double net_Weight)
	{
		this.net_Weight=net_Weight;
	}
	public void setType(String type)
	{
		this.type=type;
	}
	public void setTotal_Rate(double total_Rate)
	{
		this.total_Rate=total_Rate;
	}
	public void setShop(String shop)
	{
		this.shop=shop;
	}
	public void setLocation(String location)
	{
		this.location=location;
	}
	public void setPhNo(long phNo)
	{
		this.phNo=phNo;
	}
	public void setGST(double GST)
	{
		this.GST=GST;
	}
	public void setAlmark(boolean almark)
	{
		this.almark=almark;
	}
	public void setPatterns(String patterns)
	{
		this.patterns=patterns;
	}
	public double getPrice()
	{
		return price;
	}
	public double getNet_Weight()
	{
		return net_Weight;
	}
	public String getType()
	{
		return type;
	}
	public double getTotal_Rate()
	{
		return total_Rate;
	}
	public String getShop()
	{
		return shop;
	}
	public String getLocation()
	{
		return location;
	}
	public long getPhNo()
	{
		return phNo;
	}
	public double getGST()
	{
		return GST;
	}
	public boolean getAlmark()
	{
		return almark;
	}
	public String getPatterns()
	{
		return patterns;
	}
}
