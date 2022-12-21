package com.xworkz.collections.boot;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class MetroCityNames {

	public static void main(String[] args) 
	{
		String metro1 = "Delhi";
		String metro2 = "Bangalore";
		String metro3 = "Chennai";
		String metro4 = "Hydrabad";
		String metro5 = "Ahmedabad";
		
		Collection<String> metro = new LinkedHashSet<String>();
		metro.add(metro1);
		metro.add(metro4);
		metro.add(metro2);
		metro.add(metro3);
		metro.add(metro5);
		metro.add(null);
		System.out.println("Metro List :" +metro.size());
		System.out.println(metro);
		for(String element : metro)
		{
			System.out.println(element);
		}
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		Iterator<String> ref = metro.iterator();
		while(ref.hasNext())
		{
			String element = ref.next();
			System.out.println(element);
		}
	}

}
