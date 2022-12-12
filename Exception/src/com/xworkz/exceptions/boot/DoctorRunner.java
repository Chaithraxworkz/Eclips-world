package com.xworkz.exceptions.boot;

import com.xworkz.exceptions.Doctor;

public class DoctorRunner {

	public static void main(String[] args) 
	{
		Doctor doctor=new Doctor();
		try
		{
			System.out.println("enter before doctor");
			//doctor.method1();
			//System.out.println("enter after doctor");
			doctor.method6();
			System.out.println("enter the event");
		}
		catch (IllegalArgumentException e)
		{
			System.err.println("exception in main method");
		}
		catch (ArrayIndexOutOfBoundsException e)
		{
			System.out.println("starts main method");
		}
		System.out.println("after doctor...");
	}
}
