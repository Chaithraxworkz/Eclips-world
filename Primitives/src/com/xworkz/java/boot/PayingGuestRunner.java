package com.xworkz.java.boot;

import com.xworkz.java.PayingGuest;

public class PayingGuestRunner {

	public static void main(String[] args) 
	{
		System.out.println("Enter PayingGuest for bangalore");
		String[] breakFast = {"Dosa","Upma","Ricebath","Pongal","Idli"};
		String[] Dinner = {"Rice","Sambar"};
		String[] categary = {"Students","Workers"};
		String[] facilities = {"Wi-fi","Gyser","WashingMachine"};
		String[] roomMates = {"Rashmi","Lavanya"};
		
		PayingGuest ref=new PayingGuest("Mahalakshmi",7000,5,"Girls","vijaynagar",breakFast,Dinner,categary,facilities,roomMates);
		
		ref.display();
	}

}
