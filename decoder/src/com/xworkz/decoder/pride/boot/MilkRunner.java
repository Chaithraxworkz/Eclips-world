package com.xworkz.decoder.pride.boot;
import com.xworkz.decoder.pride.Milk;

public class MilkRunner {

	public static void main(String[] args)
	{
		System.out.println("Main start aytu........");
		Milk obj=new Milk(1974);
		obj.setprice(100);
		obj.quantity=5;
		obj.display();
		obj.displayTotalPrice();
	}

}
