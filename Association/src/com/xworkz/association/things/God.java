package com.xworkz.association.things;

public class God 
{
	private String name="Venkateshwara";
	public int noOfPeoples;
	private double amount=1000.0;
	public String astra;
	public String country;
	public int noOfPujari;
	private String location;
	
	public void setName(String name)
	{
		this.name=name;
	}
	public void setNoOfPeoples(int noOfPeoples)
	{
		this.noOfPeoples=noOfPeoples;
	}
	public void setAmount(double amount)
	{
		this.amount=amount;
	}
	public void setAstra(String astra)
	{
		this.astra=astra;
	}
	public void setCountry(String country)
	{
		this.country=country;
	}
	public void setNoOfPujaris(int noOfPujari)
	{
		this.noOfPujari=noOfPujari;
	}
	public void setLocation(String location)
	{
		this.location=location;
	}
	public String getName()
	{
		return name;
	}
	public int getNoOfPeople()
	{
		return noOfPeoples;
	}
	public String getAstra()
	{
		return astra;
	}
	public String getCountry()
	{
		return country;
	}
	public int getNoOfPujari()
	{
		return noOfPujari;
	}
	public String getLocation()
	{
		return location;
	}
	public double getAmount()
	{
		return amount;
	}
}
