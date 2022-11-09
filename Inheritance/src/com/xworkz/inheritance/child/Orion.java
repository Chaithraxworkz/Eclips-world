package com.xworkz.inheritance.child;

import com.xworkz.inheritance.thing.ShoppingMall;

public class Orion extends ShoppingMall
{
	public boolean stores;
	
	public  Orion(String name,String location,boolean stores)
	{
		super(name,location);
		this.stores=stores;
	}
	public void display()
	{
		super.display();
		System.out.println(this.stores);
	}
	
}
