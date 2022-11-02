package com.xworkz.association.things;

public class Grocessary 
{
	public String name;
	public String brand;
	public double price;
	public double quantity;
	public String manf_Date;
	public String exp_Date;
	public int batchNo;
	public double weight;
	public String quality;
	public int rating;
	
	public Grocessary(String name, double price, double quantity, String manf_Date, int batchNo, double weight,String quality, int rating) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
		this.manf_Date = manf_Date;
		this.batchNo = batchNo;
		this.weight = weight;
		this.quality = quality;
		this.rating = rating;
	}
	
	
	public String getBrand()
	{
		return brand;
	}
	public void setBrand(String brand)
	{
		this.brand=brand;
	}
	
	public String getExp_Date()
	{
		return exp_Date;
	}
	public void setExp_Date(String exp_Date)
	{
		this.exp_Date=exp_Date;
	}
}
