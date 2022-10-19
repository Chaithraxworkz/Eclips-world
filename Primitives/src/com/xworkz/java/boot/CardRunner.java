package com.xworkz.java.boot;

import com.xworkz.java.Card;

public class CardRunner {

	public static void main(String[] args) 
	{
		System.out.println("Enter into the main method");
		String[] colors= {"White","Blue","Red","Green"};
		String[] types= {"ATM","PAN","DL","Invittion"};
		String[] shapes= {"Square","Rectangle"};
		String[] events= {"Marriage","Birthday"};
		Card ref=new Card("ATM",colors,12,"157301084572",5,100,types,shapes,events);
		ref.display();
	}

}
