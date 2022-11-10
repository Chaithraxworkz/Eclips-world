package com.xworkz.inheritance.boot;

import com.xworkz.inheritance.overriding.Home;

public class HomeRunner {

	public static void main(String[] args) 
	{
		System.out.println("Main start aytu...");
		Home home=new Home();
		home.pgName();
		home.phoneNo();
	}

}
