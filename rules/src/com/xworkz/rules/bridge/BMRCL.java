package com.xworkz.rules.bridge;

import com.xworkz.rules.things.MetroRules;

public class BMRCL 
{
	private MetroRules metroRules;
	
	public BMRCL(MetroRules metroRules)
	{
		this.metroRules=metroRules;
	}
	public void bmrclCheck()
	{
		System.out.println("running the bmrclCheck");
		if(this.metroRules!=null)
		{
			double coin=this.metroRules.toGiveCoin();
			boolean mask=this.metroRules.wearMask();
			if(mask && coin>15)
			{
				System.out.println("metro is followed rules");
			}
			else
			{
				System.out.println("metro is not follow rules");
			}
		}
	}
}
