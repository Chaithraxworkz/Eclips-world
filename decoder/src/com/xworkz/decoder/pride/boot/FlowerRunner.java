package com.xworkz.decoder.pride.boot;
import com.xworkz.decoder.pride.Flower;

public class FlowerRunner {

	public static void main(String[] args)
	{
		System.out.println("Enter the main method");
		Flower flower=new Flower("Lavender");
		flower.quantity=4;
		flower.display();
		flower.displayTotalPrice();
	}

}
