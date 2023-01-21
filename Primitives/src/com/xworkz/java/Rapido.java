package com.xworkz.java;

public class Rapido
{
	public static String name;
	public String location;
	public PaymentMode paymentMode=PaymentMode.PAYTM;

	public Rapido(String name,String location)
	{
		this.name=name;
		this.location=location;
		
	}
	public void display()
	{

		System.out.println(this.name);
		System.out.println(this.location);
		System.out.println(paymentMode.name);
		
	}
}
	
