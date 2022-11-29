package com.xworkz.rules.bridge;

import com.xworkz.rules.Hotel;

public class HotelRules implements Hotel
{
	@Override
	public String nameOfHotel() 
	{
		System.out.println("null");
		return null;
	}
	@Override
	public String hotelLocation() 
	{
		System.out.println("null");
		return null;
	}
	@Override
	public String ownerOfHotel() 
	{
		System.out.println("null");
		return null;
	}
	@Override
	public String rulesOfHotel() 
	{
		System.out.println("Keep clean");
		return null;
	}
	@Override
	public int noOfCustomers() 
	{
		System.out.println(150);
		return 0;
	}
}
