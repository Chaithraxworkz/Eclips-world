package com.xworkz.things.boot;
import com.xworkz.things.*;

public class TractorRunner {

	public static void main(String[] args) 
	{
		System.out.println("Entering to the main");
		Tractor obj=new Tractor("Mahindra","HP",250000,"Red",5,"2020");
		System.out.println(obj.name);
		System.out.println(obj.Brand);
		System.out.println(obj.price);
		System.out.println(obj.color);
		System.out.println(obj.hp);
		System.out.println(obj.model);
		
		System.out.println("Enter the delails of TaxtileShopOwner");
		TextileShop shop=new TextileShop("Rajendra","Suguna",9856420176,1,245);
		System.out.println(shop.ownerName);
		System.out.println(shop.ownerWifeName);
		System.out.println(shop.ownerDaughterName);
		System.out.println(shop.ownerDaughterNumber);
		System.out.println(shop.ownersNoOfWifes);
		System.out.println(shop.shopNo);
		System.out.println(shop.contactNo);
		
		System.out.println("Enter the details of Chain");
		Chain ref=new Chain(10,"belt","dog",250);
		System.out.println(ref.type);
		System.out.println(ref.price);
		System.out.println(ref.length);
		System.out.println(ref.material);
		System.out.println(ref.weight);
		System.out.println(ref.stolen);
		System.out.println(ref.usedFor);
		System.out.println(ref.fresh);
	}

}
