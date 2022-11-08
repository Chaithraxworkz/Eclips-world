package com.xworkz.inheritance.boot;

import com.xworkz.inheritance.child.BachelorParty;
import com.xworkz.inheritance.thing.Party;

public class PartyRunner {

	public static void main(String[] args)
	{
		Party party=new BachelorParty("Divya", "Bangalore", 10);
		
		BachelorParty bachelor=new BachelorParty("Divya","Bangalore",10);
			System.out.println(bachelor.name);
			System.out.println(bachelor.venue);
			System.out.println(bachelor.members);
		
		
		
	}
	

}
