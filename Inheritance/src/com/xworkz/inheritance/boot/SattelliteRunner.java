package com.xworkz.inheritance.boot;

import com.xworkz.inheritance.child.Moon;
import com.xworkz.inheritance.thing.Satellite;

public class SattelliteRunner {

	public static void main(String[] args) 
	{
		System.out.println("Start the main.....");
		Satellite obj=new Moon("NASA", "1 October 1958", 240.000);
		obj.display();
		
		Satellite obj2=new Moon("Aryabhata", "19 April 1975", 563.00);
		obj2.display();
	}

}
