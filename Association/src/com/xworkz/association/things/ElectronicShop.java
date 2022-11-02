package com.xworkz.association.things;

public class ElectronicShop 
{
	public String name="HP World";
	public Computer comp=new Computer("HP", "64bit", 4.5, "UK", "Windows10", 9, 20.3, 17);
	
	public void display()
	{
		System.out.println(this.name);
		System.out.println(comp.brand);
		System.out.println(comp.ram);
		System.out.println(comp.manfufacturedBy);
		System.out.println(comp.quality);
		System.out.println(comp.windows);
		System.out.println(comp.rating);
		System.out.println(comp.weight);
		System.out.println(comp.height);
		
		System.out.println(comp.getPrice());
		comp.setPrice(80000);
		
		System.out.println(comp.getCamera());
		comp.setCamera(true);
		
	}
}
