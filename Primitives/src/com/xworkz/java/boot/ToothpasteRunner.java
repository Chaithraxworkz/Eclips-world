package com.xworkz.java.boot;

import com.xworkz.java.Toothpaste;

public class ToothpasteRunner {

	public static void main(String[] args)
	{
		System.out.println("Entering the main method to string");
		
		 String[] color= {"White","Red","Black"};
		 String[] flavors= {"Mint","peppermint","cinnamon-clove"};
		 double[] size= {0.75,25,18};
		 String[] purpose= {"oral hygiene"," halitosis"};
		 int[] batchNo= {025,642,357,625};
		 
		 
		 Toothpaste paste=new Toothpaste("Oral-B", "oral", "01-03-2019", "31-12-2020", 150, color, flavors, size, batchNo, purpose);
		 paste.display();
	}

}
