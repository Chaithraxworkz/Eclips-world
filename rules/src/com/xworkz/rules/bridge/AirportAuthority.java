package com.xworkz.rules.bridge;

import com.xworkz.rules.things.AirportRules;

public class AirportAuthority 
{
	private AirportRules airportRules;
	
	public AirportAuthority(AirportRules airportRules)
	{
		this.airportRules=airportRules;
	}
	
	public void airportCheck()
	{
		System.out.println("Running the airportCheck");
		if(this.airportRules!=null)
		{
			boolean Reach=this.airportRules.currectTimeToReach();
			int staff=this.airportRules.noOfStaff();
			if(Reach && staff>=10)
			{
				System.out.println("airport is following the rules");
			}
			else
			{
				System.out.println("airpoort is not following the rules");
			}
		}
	}
}
