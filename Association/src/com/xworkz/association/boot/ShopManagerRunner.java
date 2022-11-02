package com.xworkz.association.boot;

import com.xworkz.association.things.Saree;
import com.xworkz.association.things.ShopManager;

public class ShopManagerRunner {

	public static void main(String[] args)
	{
		System.out.println("Main start aytu.....");
		ShopManager manager=new ShopManager();
		Saree saree=new Saree("Kuberan Silks","Mysore Silk", 100000, "Blue", "Crpe Silk", 15.6, "Bangalore", 20, 4.5);
		
		System.out.println(manager.name);
		System.out.println(manager.saree);
		System.out.println(saree.getPhNo());
		System.out.println(saree.getQuality());
		
		manager.display();
	}

}
