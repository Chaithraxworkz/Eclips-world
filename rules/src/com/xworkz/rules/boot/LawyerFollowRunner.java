package com.xworkz.rules.boot;

import com.xworkz.rules.Court;
import com.xworkz.rules.bridge.LawyerFollow;

public class LawyerFollowRunner {

	public static void main(String[] args) 
	{
		LawyerFollow lawyer=new LawyerFollow();
		lawyer.courtType();
		lawyer.nameOfJudge();
		lawyer.locationOfCourt();
		lawyer.courtRules();
		lawyer.courtDate();
		
		System.out.println("``````````````````````````````````````");
		Court lawyer2=new LawyerFollow();
		lawyer2.courtType();
		lawyer2.nameOfJudge();
		lawyer2.locationOfCourt();
		lawyer2.courtRules();
		lawyer2.courtDate();
		
	}

}
