package com.xworkz.java.boot;
import com.xworkz.java.Mobile;

public class MobileRunner 
{

	public static void main(String[] args) 
	{
		System.out.println("Entering the main method");
		String[] color= {"Black","Gold","Blue","Gold"};
		int[] ram= {64,32,128};
		Mobile obj=new Mobile("Vivo","china",40000,"756210486",20.6,color,ram);
		obj.display();
	}

}
