package com.xworkz.java;

public enum PaymentMode 
{
	WALLET("wallet"),PAYTM("paytm"),UPI("upi"),PHONEPAY("phonepay"),CASH("cash");
	
	public String name;
	
	private PaymentMode(String name)
	{
		this.name=name;
	}
}
