package com.xworkz.inheritance.boot;

import com.xworkz.inheritance.child.Indian;
import com.xworkz.inheritance.overriding.PetrolBunk;

public class PetrolBunkRunner {

	public static void main(String[] args) 
	{
		System.out.println("Main start aytu...");
		PetrolBunk bunk=new Indian();
		bunk.name();
		bunk.price();
	}

}
