package com.xworkz.inheritance.boot;

import com.xworkz.inheritance.child.Ravi;
import com.xworkz.inheritance.thing.Criminal;

public class CriminalRunner {

	public static void main(String[] args) 
	{
		System.out.println("Enter the main");
		Criminal criminal=new Ravi("Shantanu", "Murder", 48);
		Ravi ravi=(Ravi)criminal;
		ravi.display();
	}

}
