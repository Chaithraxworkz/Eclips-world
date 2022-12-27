package com.xworkz.collections.boot;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import com.xworkz.collections.dto.SanitizerDTO;

public class SanitizerRunner {

	public static void main(String[] args) 
	{
		SanitizerDTO dto1 = new SanitizerDTO(25478, "Sterillium", 85D, "Blue");
		SanitizerDTO dto2 = new SanitizerDTO(26541, "Savlon", 40D, "White");
		SanitizerDTO dto3 = new SanitizerDTO(35214, "Dettol", 60D, "Pink");
		SanitizerDTO dto4 = new SanitizerDTO(45216, "Lifebuoy", 100D, "Orange");
		SanitizerDTO dto5 = new SanitizerDTO(48541, "Godrej ", 600D, "Violet");
		SanitizerDTO dto6 = new SanitizerDTO(62145, "Dabur", 120D, "Blue");
		SanitizerDTO dto7 = new SanitizerDTO(35487, "Multani ", 1000D, "Green");
		SanitizerDTO dto8 = new SanitizerDTO(85412, "Corvil ", 550D, "Red");
		SanitizerDTO dto9 = new SanitizerDTO(75412, "Trust", 300D, "White");
		SanitizerDTO dto10 = new SanitizerDTO(95412, "DCM Shriram", 2000D, "Yellow");
		
		
		Collection<SanitizerDTO> collection = new ArrayList<SanitizerDTO>();
		collection.add(dto10);
		collection.add(dto9);
		collection.add(dto8);
		collection.add(dto7);
		collection.add(dto6);
		collection.add(dto5);
		collection.add(dto4);
		collection.add(dto3);
		collection.add(dto2);
		collection.add(dto1);
		
		Iterator<SanitizerDTO> sanitizer = collection.iterator();
		while(sanitizer.hasNext())
		{
			SanitizerDTO element = sanitizer.next();
			if(element.getPrice() > 100)
			{
				System.out.println("Sanitizer price is >100 : " + element);
			}
		}
		
		
		Iterator<SanitizerDTO> sanitizer2 = collection.iterator();
		while(sanitizer2.hasNext())
		{
			SanitizerDTO element2 = sanitizer2.next();
			if(element2 != null)
			{
				System.out.println("it is not  null : " +element2);
			}
			else
			{
				System.out.println("It is null : " +element2);
			}
			
		}
		
		
		Iterator<SanitizerDTO> sanitizer3 = collection.iterator();
		while(sanitizer3.hasNext())
		{
			SanitizerDTO element3 = sanitizer3.next();
			if(element3.getColor().matches("Blue"))
			{
				System.out.println("remove sanitizer color : " +element3);
				sanitizer3.remove();
				
			}
		}
		
		
		Iterator<SanitizerDTO> sanitizer4 = collection.iterator();
		while(sanitizer4.hasNext())
		{
			SanitizerDTO element4 = sanitizer4.next();
			if(element4.getPrice()< 70)
			{
				System.out.println("sanitizer with least price : " + element4);
			}
				
		}
		
		
		Iterator<SanitizerDTO> sanitizer5 = collection.iterator();
		while(sanitizer5.hasNext())
		{
			SanitizerDTO element5 = sanitizer5.next();
			if(element5.getPrice() > 1050)
			{
				System.out.println("Max price of sanitizer : " +element5);
			}
		}
		
		
		Iterator<SanitizerDTO> sanitizer6 = collection.iterator();
		while(sanitizer6.hasNext())
		{
			SanitizerDTO element6 = sanitizer6.next();
			if(element6.getPrice() > 950)
			{
				System.out.println(" 2nd max Price of sanitizer : " + element6);
			}
		}
		
	}
	
}
