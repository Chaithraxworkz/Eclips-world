package com.xworkz.decoder.pride.boot;
import com.xworkz.decoder.pride.Sweet;

public class SweetRunner {

	public static void main(String[] args) 
	{
		System.out.println("Enter the main");
		Sweet obj=new Sweet("Kaju Barfi");
		obj.setprice(500);
		obj.quantity=3.5;
		obj.display();
		obj.displayTotalPrice();
	}

}
