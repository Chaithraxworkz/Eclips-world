package com.xworkz.inheritance.child;

import com.xworkz.inheritance.thing.Political;

public class Party extends Political
{
	public String founder;

	public Party(String partyName, int noOfMembers, String founder) 
	{
		super(partyName, noOfMembers);
		this.founder=founder;
	}
	public void display()
	{
		super.display();
		System.out.println(this.founder);
	}
	
}
