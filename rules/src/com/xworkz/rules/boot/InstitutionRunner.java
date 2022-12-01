package com.xworkz.rules.boot;

import com.xworkz.rules.Bank;
import com.xworkz.rules.bridge.DevelopmentInstitute;
import com.xworkz.rules.bridge.TestingInstitute;
import com.xworkz.rules.bridge.XworkzRaj;
import com.xworkz.rules.things.Institution;

public class InstitutionRunner {

	public static void main(String[] args) 
	{
		Object obj=new XworkzRaj();
		Institution inst=new XworkzRaj();
		inst.placement();
		inst.training();
		inst.presentation();
		System.out.println("----------------------------------------------------------");
		
		DevelopmentInstitute development=new XworkzRaj();
		development.interview();
		development.placement();
		development.presentation();
		development.training();
		System.out.println("------------------------------------------------------------");
		
		TestingInstitute test=new XworkzRaj();
		test.placement();
		test.presentation();
		test.training();
		test.interview();
		test.hackathon();
		System.out.println("--------------------------------------------------------------");
		
		XworkzRaj work=new XworkzRaj();
		work.interview();
		work.placement();
		work.presentation();
		work.amountCredit();
		work.amountDeposit();
		work.hackathon();
		work.customername();
		work.locationOfBank();
		work.nameOfBank();
		work.training();
	}

}
