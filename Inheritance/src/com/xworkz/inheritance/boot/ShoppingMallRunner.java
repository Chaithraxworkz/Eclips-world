package com.xworkz.inheritance.boot;

import com.xworkz.inheritance.child.Orion;
import com.xworkz.inheritance.thing.ShoppingMall;

public class ShoppingMallRunner {

	public static void main(String[] args) 
	{
		System.out.println("Main start aytu....");
		ShoppingMall mall=new Orion("Orian", "Riajajinagar", true);
		mall.display();
		System.out.println("==============================");
		
		ShoppingMall mall1=new Orion("Glulu", "Bangalore", false);
		mall1.display();
	}

}
