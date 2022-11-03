package com.xworkz.association.boot;

import com.xworkz.association.things.Bike;
import com.xworkz.association.things.Fuel;

public class BikeRunner {

	public static void main(String[] args) 
	{
		System.out.println("Maint start aytu......");
		Bike bike=new Bike();
		Fuel fuel=new Fuel();
		
		System.out.println(bike.name);
		System.out.println(bike.fuel);
		System.out.println(fuel.kmh);
		System.out.println(fuel.price);
		System.out.println(fuel.ownerName);
		System.out.println(fuel.v_color);
		System.out.println(fuel.type);
		System.out.println(fuel.getColor());
		System.out.println(fuel.getOwnerName());
		System.out.println(fuel.getPrice());
		System.out.println(fuel.getVechicle());
		
		bike.display();
	}

}
