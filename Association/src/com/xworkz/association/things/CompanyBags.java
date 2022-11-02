package com.xworkz.association.things;

public class CompanyBags 
{
	public String name="Lenovo";
	public Bag bag=new Bag("American Toruister", 1500, "Leather", "Tarpalins", "Mysore", "College", false);
	
	public void display()
	{
		System.out.println(this.name);
		System.out.println(bag.name);
		System.out.println(bag.price);
		System.out.println(bag.quality);
		System.out.println(bag.shopName);
		System.out.println(bag.location);
		System.out.println(bag.type);
		System.out.println(bag.wheels);
		
		System.out.println(bag.getName());
		bag.setName("Tourister");
		
		System.out.println(bag.getColor());
		bag.setColor("Blue");
		
		System.out.println(bag.getItsWorking());
		bag.setItsWorking(true);
	}
}
