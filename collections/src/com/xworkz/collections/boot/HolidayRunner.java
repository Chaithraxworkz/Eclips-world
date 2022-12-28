package com.xworkz.collections.boot;

import java.util.ArrayList;
import java.util.Collection;

import com.xworkz.collections.dto.HolidayDTO;
import com.xworkz.collections.dto.Types;

public class HolidayRunner {

	public static void main(String[] args) 
	{
		HolidayDTO day1 = new HolidayDTO(Types.FESTIVALS, "Sankranthi", 2);
		HolidayDTO day2 = new HolidayDTO(Types.BANKHOLIDAY, "Strike", 7);
		HolidayDTO day3 = new HolidayDTO(Types.FESTIVALS, "Ganeshafest", 3);
		HolidayDTO day4 = new HolidayDTO(Types.NATIONALHOLIDAY, "Republicday", 1);
		HolidayDTO day5 = new HolidayDTO(Types.FEDERALHOLIDAY, "Election", 2);
		
		boolean equals=day2.equals(day5);
		System.out.println(day2.getName().equals(day5.getName()));
		Collection<HolidayDTO> holiday = new ArrayList<HolidayDTO>();
		holiday.add(day4);
		holiday.add(day2);
		holiday.add(day5);
		holiday.add(day3);
		holiday.add(day1);
		
		boolean contains=holiday.contains(day4);
		System.out.println("contains : "+contains);
	}

}
