package com.xworkz.rules.boot;

import com.xworkz.rules.Hotel;
import com.xworkz.rules.bridge.HotelRules;

public class CustomerRunner {

	public static void main(String[] args) 
	{
		HotelRules ref=new HotelRules();
		ref.nameOfHotel();
		ref.hotelLocation();
		ref.ownerOfHotel();
		ref.rulesOfHotel();
		ref.noOfCustomers();
	}

}
