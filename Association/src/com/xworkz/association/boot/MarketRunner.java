package com.xworkz.association.boot;

import com.xworkz.association.things.Grocessary;
import com.xworkz.association.things.Market;

public class MarketRunner 
{

	public static void main(String[] args) 
	{
		System.out.println("Main start aytu....");
		Market shop=new Market();
		Grocessary gross=new Grocessary("Rava", 80, 500, "16-aug-2021", 210, 450.0, "Fine", 4);
		
		System.out.println(shop.name);
		System.out.println(shop.gross);
		System.out.println(gross.getBrand());
		System.out.println(gross.getExp_Date());
		
		shop.display();
	}

}
