package com.xworkz.association.things;

public class Market 
{
	public String name="More SuperMarket";
	public Grocessary gross=new Grocessary("Rava", 80, 500, "16-aug-2021", 210, 450.0, "Fine", 4);
	
	public void display()
	{
		System.out.println(this.name);
		System.out.println(gross.name);
		System.out.println(gross.price);
		System.out.println(gross.quantity);
		System.out.println(gross.manf_Date);
		System.out.println(gross.batchNo);
		System.out.println(gross.weight);
		System.out.println(gross.quality);
		System.out.println(gross.rating);
		
		
		System.out.println(gross.getBrand());
		gross.setBrand("MTR");
		
		System.out.println(gross.getExp_Date());
		gross.setExp_Date("30-mar-2022");
	}
}
