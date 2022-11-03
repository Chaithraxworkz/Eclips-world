package com.xworkz.association.boot;

import com.xworkz.association.things.Temple;
import com.xworkz.association.things.God;


public class TempleRunner {

	public static void main(String[] args) 
	{
		Temple temp=new Temple();
		God god=new God();
		
		System.out.println(temp.name);
		System.out.println(god.getName());
		System.out.println(god.getAstra());
		System.out.println(god.getCountry());
		System.out.println(god.getLocation());
		System.out.println(god.getNoOfPeople());
		System.out.println(god.getNoOfPujari());
		System.out.println(god.getAmount());
		
		temp.display();
		
	}

}
