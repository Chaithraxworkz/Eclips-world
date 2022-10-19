package com.xworkz.java.boot;

import com.xworkz.java.Flight;

public class FlightRunner {

	public static void main(String[] args) 
	{
		System.out.println("Entering into the main method");
		String[] location= {"Bangalore","Delhi"};
		String[] foods= {"Noodels","burger","Biskuts"};
		double[] noOfPassengers= {1000,1500,3000};
		String[] juice= {"Hot drinks","Cool drinks","Fruit juice"};
		Flight ref=new Flight("Air India","AIC101",50000,"Bangalore","Delhi",location,foods,noOfPassengers,juice);
		ref.display();
	}

}
