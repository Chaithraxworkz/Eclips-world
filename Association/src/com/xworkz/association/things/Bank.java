package com.xworkz.association.things;

public class Bank
{
	public String b_Name="Canara";
	public PhonePay pay=new PhonePay("Deepu", 5210210187452l, "Channapatana", 7552210664L, "Canara", true, "Karnataka", 1000);
	
	public void display()
	{
		System.out.println(this.b_Name);
		System.out.println(pay.ownerName);
		System.out.println(pay.accNo);
		System.out.println(pay.address);
		System.out.println(pay.phoneno);
		System.out.println(pay.bank);
		System.out.println(pay.online);
		System.out.println(pay.state);
		System.out.println(pay.creditAmount);
		
		System.out.println(pay.getDOB());
		pay.setDOB("30-mar-2003");
		
		System.out.println(pay.getIFSC());
		pay.setIFSC("CNB4201586");
		
		System.out.println(pay.getLocation());
		pay.setLocation("Bangalore");
		
	}
}
