package com.xworkz.collections.boot;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class AnimalRunner 
{
	public static void main(String[] args) 
	{
		String animal1 = "Lion";
		String animal2 = "Tiger";
		String animal3 = "Dog";
		String animal4 = "Deer";
		String animal5 = "Elephant";
		String animal6 = "Cow";
		String animal7 = "Giraffe";
		String animal8 = "Monkey";
		String animal9 = "Cat";
		String animal10 = "Rabbit";
		
		Collection<String> animal = new ArrayList<String>();
		animal.add(animal10);
		animal.add(animal8);
		animal.add(animal9);
		animal.add(animal5);
		animal.add(animal7);
		animal.add(animal6);
		animal.add(animal4);
		animal.add(animal3);
		animal.add(animal2);
		animal.add(animal1);
		animal.add("Camel");
		animal.add(null);
		animal.add(animal10);
		System.out.println("Count animals :" + animal.size());
		System.out.println(animal);
		for(String element : animal)
		{
			System.out.println(element);
		}
		Iterator<String> ref = animal.iterator();
		while(ref.hasNext())
		{
			String element = ref.next();
			System.out.println(element);
		}
	}
}
