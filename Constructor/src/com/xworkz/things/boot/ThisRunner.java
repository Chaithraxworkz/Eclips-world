package com.xworkz.things.boot;
import com.xworkz.things.Tractor;

public class TractorRunner {

	public static void main(String[] args) 
	{
		System.out.println("Entering to the main");
		Tractor obj=new Tractor("Mahindra","HP",250000,"Red",5,"2020");
		System.out.println(obj.name);
		System.out.println(obj.Brand);
		System.out.println(obj.price);
		System.out.println(obj.color);
		System.out.println(obj.hp);
		System.out.println(obj.model);
		
		
	}

}
