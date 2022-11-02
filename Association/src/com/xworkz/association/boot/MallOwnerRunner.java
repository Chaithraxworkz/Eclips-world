package com.xworkz.association.boot;

import com.xworkz.association.things.MallOwner;
import com.xworkz.association.things.Shirt;

public class MallOwnerRunner {

	public static void main(String[] args) 
	{
		MallOwner mall=new MallOwner();
		Shirt shirt=new Shirt("Puma", 200.0, 4.6 , "Black", "India", "Adarsh", true, "27");
		
		System.out.println(mall.name);
		System.out.println(mall.shirt);
		System.out.println(shirt.getQuantity());
		System.out.println(shirt.getSize());
		System.out.println(shirt.getType());
		
		mall.displa();
	}

}
