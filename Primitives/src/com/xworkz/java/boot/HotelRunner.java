package com.xworkz.java.boot;

public class HotelRunner {

	public static void main(String[] args) 
	{
		System.out.println("Details of the main method");
		String[] items= {"Idly","Dosa","Riceath","coffee"};
		String[] types= {"South","North"};
		int[] quantity= {4,3,6,8};
		
		Hotel obj=new Hotel("Sumadura","Rajajinagar",200,"02-08-1996",false,items,types,quantity);
		obj.display();
	}

}
