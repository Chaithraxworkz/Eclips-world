package com.java.simple.boot;

import com.java.simple.*;

public class FishRunner 
{

	public static void main(String[] args)
	{

		Fish obj=new Fish("Kingfisher");
		System.out.println(obj);
		System.out.println(obj.name);
		System.out.println(obj.price);
		System.out.println(obj.type);
		System.out.println(obj.weight);
		System.out.println(obj.length);
		
		obj.price=200;
		obj.type="Fried";
		obj.weight="400";
		obj.length=4.4;
		System.out.println(obj.name);
		System.out.println(obj.price);
		System.out.println(obj.type);
		System.out.println(obj.weight);
		System.out.println(obj.length);
		
	}

}
