package com.xworkz.java;

public class IceCream 
{
	public String name;
	public String[] color;
	public String flavor;
	public int price;
	public boolean sweet;
	public String[] ingredients;
	public String[] type;
	
	public IceCream(String name,String[] color,String flavor,int price,boolean sweet,String[] ingredients,String[] type)
	{
		this.name=name;
		this.color=color;
		this.flavor=flavor;
		this.price=price;
		this.sweet=sweet;
		this.ingredients=ingredients;
		this.type=type;
		
	}
	
	public void display()
	{
		System.out.println("to display the icecreams");
		System.out.println(this.name);
		System.out.println(this.color);
		System.out.println(this.flavor);
		System.out.println(this.price);
		System.out.println(this.sweet);
		for (int i = 0; i <this.ingredients.length; i++) 
		{
			String string = this.ingredients[i];
			System.out.println(string);
		}
		for (int i = 0; i < this.type.length; i++) 
		{
			String temp = this.type[i];
			System.out.println(temp);
		}
		for (int i = 0; i < this.color.length; i++) 
		{
			String ice = this.color[i];
			System.out.println(ice);
			
		}	
		
	}
}
