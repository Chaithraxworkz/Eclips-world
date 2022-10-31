package com.xworkz.association.thing;
import com.xworkz.association.thing.*;

public class Fuel 
{
	public boolean special;
	public Types type;
	public double price;
	public double quantity;
	public Brand brand=new Brand("Indian",20657824l,4);
	
	public Fuel( boolean special, Types type, double price, double quantity) {
		super();
		this.special = special;
		this.type = type;
		this.price = price;
		this.quantity = quantity;
	}
	
	public void showOff()
	{
		System.out.println(this.special);
		System.out.println(this.type);
		System.out.println(this.price);
		System.out.println(this.quantity);
		brand.showOff();
		brand.location.showOff();
	}
	public void displayTotalprice()
	{
		double total=price*quantity;
		System.out.println("display the totla price of the fuel : " + total);
	}
}
