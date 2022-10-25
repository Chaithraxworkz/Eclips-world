package com.xworkz.decoder.pride.boot;
import com.xworkz.decoder.pride.Mango;

public class MangoRunner {

	public static void main(String[] args) 
	{
		System.out.println("Main start aytu......");
		Mango fruit=new Mango("Yellow");
		fruit.price=300;
		fruit.sweet=false;
		fruit.display();
	}

}
