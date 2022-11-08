package com.xworkz.inheritance.boot;

import com.xworkz.inheritance.child.ArrangeMarriage;
import com.xworkz.inheritance.thing.Marriage;

public class MarriageRunner {

	public static void main(String[] args)
	{
		System.out.println("Main start aytu...");
		Marriage arrange=new ArrangeMarriage(11-11-2022,"Mysore",200);
		System.out.println(arrange.date);
		System.out.println(arrange.location);
		System.out.println(arrange.members);
		
	}

}
