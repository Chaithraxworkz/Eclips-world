package com.java.simple.boot;
import com.java.simple.*;

public class BreadRunner {

	public static void main(String[] args) 
	{
		Bread obj=new Bread("Special");
		System.out.println(obj);
		System.out.println(obj.type);
		System.out.println(obj.shape);
		System.out.println(obj.price);
		System.out.println(obj.quantity);
		System.out.println(obj.companyName);
		
		obj.shape="Square";
		obj.price=30;
		obj.quantity="fresh";
		obj.companyName="Nandini";
		
		System.out.println(obj.type);
		System.out.println(obj.shape);
		System.out.println(obj.price);
		System.out.println(obj.quantity);
		System.out.println(obj.companyName);
		
	}

}
