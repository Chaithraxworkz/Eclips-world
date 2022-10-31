package com.xworkz.association.boot;

import com.xworkz.association.thing.Fuel;
import com.xworkz.association.thing.Types;

public class FuelRunner {

	public static void main(String[] args)
	{
		System.out.println("Main start aytu......");
		Fuel fuel=new Fuel(true,Types.PETROL,105,1);
		fuel.showOff();
		fuel.displayTotalprice();
	}

}
