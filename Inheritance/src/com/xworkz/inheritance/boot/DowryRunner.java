package com.xworkz.inheritance.boot;

import com.xworkz.inheritance.child.Girl;
import com.xworkz.inheritance.thing.Dowry;

public class DowryRunner {

	public static void main(String[] args) 
	{
		System.out.println("main start aytu...");
		Dowry obj=new Girl("Property",50000,"Gold");
		System.out.println(obj.type);
		System.out.println(obj.amount);
		System.out.println(obj.jewelary);
	}

}
