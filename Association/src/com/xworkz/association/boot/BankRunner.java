package com.xworkz.association.boot;

import com.xworkz.association.things.Bank;
import com.xworkz.association.things.PhonePay;

public class BankRunner {

	public static void main(String[] args)
	{
		System.out.println("Main start aytu...");
		Bank obj=new Bank();
		PhonePay pay=new PhonePay("Deepu", 5210210187452l, "Channapatana", 7552210664L, "Canara", true, "Karnataka", 1000);
		
		System.out.println(obj.b_Name);
		System.out.println(obj.pay);
		System.out.println(pay.getDOB());
		System.out.println(pay.getIFSC());
		System.out.println(pay.getLocation());
		
		obj.display();
	}

}
