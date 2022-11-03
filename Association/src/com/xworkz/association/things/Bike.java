package com.xworkz.association.things;

public class Bike
{
	public String name="Mythra";
	public Fuel fuel=new Fuel();
	public void display()
	{
		System.out.println(this.name);
		if(this.fuel!=null)
		{
			System.out.println(fuel.getColor());
			fuel.setColor("Orange");
			System.out.println("fuel color"+fuel.getColor());
			
			System.out.println(fuel.getOwnerName());
			fuel.setOwnerNme("Chaithra");
			System.out.println("owne Name"+fuel.getOwnerName());
			
			System.out.println(fuel.getPrice());
			fuel.setPrice(110);
			System.out.println("price of the fuel"+fuel.getPrice());
			
			System.out.println(fuel.getVechicle());
			fuel.setVechicle("Suzuki");
			System.out.println("vechicle name is"+fuel.getVechicle());
			
		}
	}
}
