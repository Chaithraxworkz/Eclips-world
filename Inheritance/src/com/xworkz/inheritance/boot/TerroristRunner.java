package com.xworkz.inheritance.boot;

import com.xworkz.inheritance.child.Kasab;
import com.xworkz.inheritance.overriding.Terrorist;

public class TerroristRunner {

	public static void main(String[] args)
	{
		System.out.println("Entering the main");
		Terrorist terror=new Kasab();
		terror.weapon();
		terror.location();
	}

}
