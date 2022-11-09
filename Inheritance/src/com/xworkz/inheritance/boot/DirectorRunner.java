package com.xworkz.inheritance.boot;

import com.xworkz.inheritance.child.Company;
import com.xworkz.inheritance.thing.Director;

public class DirectorRunner {

	public static void main(String[] args) 
	{
		System.out.println("Entering the main......");
		Director director=new Company("Prashanth", "Male", 1987, "TCS");
		director.display();
		
	}

}
