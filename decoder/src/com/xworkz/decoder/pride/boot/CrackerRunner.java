package com.xworkz.decoder.pride.boot;

import com.xworkz.decoder.pride.Cracker;
import com.xworkz.decoder.pride.TypesOfCrackers;

public class CrackerRunner {

	public static void main(String[] args) 
	{
		System.out.println("Main start aytuu........");
		Cracker pataki=new Cracker(1000);
		pataki.type=TypesOfCrackers.GIFT_BOX;
		pataki.quantity=50.00;
		pataki.display();
		pataki.dispalyTotalPrice();
	}

}
