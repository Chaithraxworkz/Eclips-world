package com.xworkz.association.boot;

import com.xworkz.association.things.Bag;
import com.xworkz.association.things.CompanyBags;

public class CompanyBagsRunner {

	public static void main(String[] args) 
	{
		System.out.println("Enter the main");
		CompanyBags company=new CompanyBags();
		Bag bag=new Bag("American Toruister", 1500, "Leather", "Tarpalins", "Mysore", "College", false);
		
		System.out.println(company.name);
		System.out.println(company.bag);
		System.out.println(bag.getName());
		System.out.println(bag.getItsWorking());
		System.out.println(bag.getColor());
		
		company.display();
	}

}
