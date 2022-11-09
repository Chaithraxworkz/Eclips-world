package com.xworkz.inheritance.boot;

import com.xworkz.inheritance.child.Party;
import com.xworkz.inheritance.thing.Political;

public class PoliticalRunner {

	public static void main(String[] args)
	{
		System.out.println("Main start aytu...");
		Political political=new Party("BJP", 1000, "Atal Bihri");
		political.display();
	}

}
