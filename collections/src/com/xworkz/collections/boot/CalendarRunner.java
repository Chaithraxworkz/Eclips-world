package com.xworkz.collections.boot;

import java.util.Collection;
import java.util.LinkedList;

import com.xworkz.collections.dto.CalendarDTO;
import com.xworkz.collections.dto.CalenderType;

public class CalendarRunner {

	public static void main(String[] args) 
	{
		CalendarDTO calendar1 = new CalendarDTO(CalenderType.POCKET, "Doodle", 30D);
		CalendarDTO calendar2 = new CalendarDTO(CalenderType.DESK, "Brahma Books", 50D);
		CalendarDTO calendar3 = new CalendarDTO(CalenderType.FREEPLK, "Chumbak", 60D);
		CalendarDTO calendar4 = new CalendarDTO(CalenderType.POCKET, "Gathbandhan", 80D);
		CalendarDTO calendar5 = new CalendarDTO(CalenderType.WALL, "Crudearea", 100D);
		
		boolean equals=calendar3.equals(calendar1);
		System.out.println(calendar3.getBrand().equals(calendar1.getBrand()));
		Collection<CalendarDTO> obj = new LinkedList<CalendarDTO>();
		obj.add(calendar4);
		obj.add(calendar5);
		obj.add(calendar3);
		obj.add(calendar2);
		obj.add(calendar1);
		
		boolean contains=obj.contains(calendar4);
		System.out.println("contains :" +contains);
	}

}
