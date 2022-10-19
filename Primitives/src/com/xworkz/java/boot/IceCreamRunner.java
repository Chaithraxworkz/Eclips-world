package com.xworkz.java.boot;

import com.xworkz.java.IceCream;

public class IceCreamRunner 
{

	public static void main(String[] args)
	{
		System.out.println("Enter the main");
		
		String[] color= {"pink","yellow","chocolate"};
		String[] type= {"cone","cup","ball"};
		String[] ingredients= {"milk","cocoPower","sugar"};
		System.out.println("Icecream facts of the string");
		String name="ButterScotch";
		IceCream cream = new IceCream(name,true,"Buttermilk",20,color,type,ingredients);
		cream.display();
	}

}
