package com.xworkz.inheritance.boot;

import com.xworkz.inheritance.child.Chatra;
import com.xworkz.inheritance.thing.Catering;

public class CateringRunner {

	public static void main(String[] args) 
	{
		System.out.println("Main start aytu....");
		Catering ref=new Chatra(40000, "Sri Lakshmi ", "Vijaynagar");
		System.out.println(ref.name);
		System.out.println(ref.price);
		System.out.println(ref.location);
	}

}
