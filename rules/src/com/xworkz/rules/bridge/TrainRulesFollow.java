package com.xworkz.rules.bridge;

import com.xworkz.rules.Train;

public class TrainRulesFollow implements Train
{

	@Override
	public String nameOfTrain() 
	{
		System.out.println("Malgudi Express");
		return null;
	}
	 @Override
	public String goingToLocation()
	 {
		 System.out.println("Chennai");
		return null;
	}
	 @Override
	public double trainTicketPrice()
	 {
		 System.out.println(400);
		return 0;
	}
	 @Override
	public String rulesOfTrain() 
	 {
		System.out.println("not pulling the chain");		
		return null;
	 }
	 @Override
	public boolean chargerPlug() 
	 {
		 System.out.println(true);
		 return false;
	}
}
