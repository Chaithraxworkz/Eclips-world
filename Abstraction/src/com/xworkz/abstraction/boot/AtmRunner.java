package com.xworkz.abstraction.boot;

import com.xworkz.abstraction.Atm;
import com.xworkz.abstraction.child.SbiAtm;

public class AtmRunner {

	public static void main(String[] args)
	{
		System.out.println("Enter the main");
		Atm atm=new SbiAtm();
		atm.checkBalance();
		atm.withdraw();
	}

}
