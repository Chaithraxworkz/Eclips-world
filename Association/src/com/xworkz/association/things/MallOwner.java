package com.xworkz.association.things;

public class MallOwner 
{
	public String name="Sumanth";
	public Shirt shirt=new Shirt("Puma", 200.0, 4.6 , "Black", "India", "Adarsh", true, "27");
	
	public void displa()
	{
		System.out.println(this.name);
		if(this.shirt!=null)
		{
			System.out.println(this.shirt);
			System.out.println(shirt.brand);
			System.out.println(shirt.price);
			System.out.println(shirt.quality);
			System.out.println(shirt.color);
			System.out.println(shirt.country);
			System.out.println(shirt.owner_Name);
			System.out.println(shirt.sleaves);
			System.out.println(shirt.age);
			
			System.out.println(shirt.getQuantity());
			shirt.setQuantity(32);
			System.out.println(shirt.getQuantity());
			
			System.out.println(shirt.getSize());
			shirt.setSize("XL");
			System.out.println(shirt.getSize());
			
			System.out.println(shirt.getType());
			shirt.setType("T-Shirt");
			System.out.println(shirt.getType());
			
		}
	}
}
