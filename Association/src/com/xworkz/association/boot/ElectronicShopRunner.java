package com.xworkz.association.boot;

import com.xworkz.association.things.Computer;
import com.xworkz.association.things.ElectronicShop;

public class ElectronicShopRunner {

	public static void main(String[] args)
	{
		System.out.println("Enter the main....");
		ElectronicShop shop=new ElectronicShop();
		Computer comp=new Computer("HP", "64bit", 4.5, "UK", "Windows10", 9, 20.3, 17);
		
		System.out.println(shop.name);
		System.out.println(shop.comp);
		System.out.println(comp.getPrice());
		System.out.println(comp.getCamera());
		
		shop.display();
	}

}
