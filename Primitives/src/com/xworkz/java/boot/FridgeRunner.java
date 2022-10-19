package com.xworkz.java.boot;

import com.xworkz.java.Fridge;

public class FridgeRunner {

	public static void main(String[] args) 
	{
		System.out.println("enter the string main method");
		String[] doors={"single door","double door"};
		String[] color={"Blue"};
		String[] types={"side-by-side","bottom freezer","undercounter","French door"};
		String[] shopFrom={"amazon","flipcart","reliance mart"};
		
		Fridge fridge=new Fridge("Godrej", "AID0053228", "401l", 7, doors, color, 5.9, types, shopFrom);
		fridge.display();
	}

}
