package com.xworkz.rules.boot;

import com.xworkz.rules.bridge.AirportAuthority;
import com.xworkz.rules.bridge.Passengers;

public class AirportRunner {

	public static void main(String[] args) 
	{
		Passengers passenger=new Passengers();
		AirportAuthority authority=new AirportAuthority(passenger);
		authority.airportCheck();
	}

}
