package com.xworkz.chaithra.dto;

import java.time.LocalDate;
import java.time.LocalTime;

import lombok.Data;

@Data
public class ChatsDTO 
{
	private String chatName;
	private double price;
	private boolean spicy;
	private String salty;
	private String location;
	private long phNo;
	private boolean famousChat;
	private int noOfChats;
	private int noOfPeoples;
	private LocalDate started;
	private LocalTime openingTime;
	
	private void ChtasDTO() 
	{
		System.out.println("created" + this.getClass().getSimpleName());
		
	}
}
