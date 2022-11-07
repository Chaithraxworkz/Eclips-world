package com.xworkz.inheritance.boot;

import com.xworkz.inheritance.child.DistrictCourt;
import com.xworkz.inheritance.child.HighCourt;
import com.xworkz.inheritance.child.SupremeCourt;
import com.xworkz.inheritance.thing.Court;

public class CourtRunner {

	public static void main(String[] args) 
	{
		System.out.println("Start main method");
		Court court=new Court();
		Court court1=new HighCourt();
		System.out.println(court1.name);
		System.out.println(court1.location);
		HighCourt highcourt=(HighCourt)court1;
		System.out.println(highcourt.noOfJudges);
		System.out.println(highcourt.caseType);
		
		Court court2=new SupremeCourt();
		
		SupremeCourt suprime=(SupremeCourt)court2;
		System.out.println(suprime.s_Name);
		System.out.println(suprime.address);
		
		Court court3=new DistrictCourt();
		
		DistrictCourt district=(DistrictCourt)court3;
		System.out.println(district.caseNumber);
		System.out.println(district.wardNo);
				
	}

}
