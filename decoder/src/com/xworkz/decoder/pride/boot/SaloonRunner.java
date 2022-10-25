package com.xworkz.decoder.pride.boot;
import com.xworkz.decoder.pride.Saloon;

public class SaloonRunner {

	public static void main(String[] args) 
	{
		System.out.println("Mainstart aytu......");
		Saloon ref=new Saloon(8549632107);
		ref.setprice(5000);
		ref.display();
		
	}

}
