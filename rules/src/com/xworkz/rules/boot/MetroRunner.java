package com.xworkz.rules.boot;

import com.xworkz.rules.bridge.BMRCL;
import com.xworkz.rules.bridge.Staff;
import com.xworkz.rules.things.MetroRules;

public class MetroRunner {

	public static void main(String[] args) 
	{
		Staff staff=new Staff();
		BMRCL bmrcl=new BMRCL(staff);
		bmrcl.bmrclCheck();
		
	}

}
