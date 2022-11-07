package com.xworkz.inheritance.child;

import com.xworkz.inheritance.thing.Doctor;

public class Dentist extends Doctor
{
	public double fee;
	public String clinic_Name;
	
	public Dentist()
	{
		System.out.println("Default consrutor..");
	}
}
