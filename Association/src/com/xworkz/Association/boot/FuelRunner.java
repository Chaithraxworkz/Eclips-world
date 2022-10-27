package com.xworkz.Association.boot;

import com.xworkz.Association.thing.Fuel;
import com.xworkz.Association.thing.Types;

public class FuelRunner {

	public static void main(String[] args)
	{
		System.out.println("Main start aytu......");
		Fuel fuel=new Fuel(true,Types.PETROL,105,1);
		fuel.showOff();
		fuel.displayTotalprice();
	}

}
