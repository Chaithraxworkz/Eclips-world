package com.xworkz.inheritance.child;

import com.xworkz.inheritance.thing.Doctor;

public class Cardologist extends Doctor
{
	public String specilist;
	public int noOfPatients;
	
	public Cardologist()
	{
		System.out.println("default constructor..");
	}
}
