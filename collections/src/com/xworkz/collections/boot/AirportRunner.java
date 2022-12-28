package com.xworkz.collections.boot;

import java.util.ArrayList;
import java.util.Collection;

import com.xworkz.collections.dto.AirportDTO;

public class AirportRunner {

	public static void main(String[] args) 
	{
		AirportDTO dto1 = new AirportDTO("Banglore", "IND256741", 250);
		AirportDTO dto2 = new AirportDTO("Mysore", "IND62415", 150);
		AirportDTO dto3 = new AirportDTO("Delhi", "IND842163", 200);
		AirportDTO dto4 = new AirportDTO("Hubli", "IND62107", 280);
		AirportDTO dto5 = new AirportDTO("US", "USD201854", 100);
		
		boolean equals = dto1.equals(dto4);
		System.out.println(dto1.getLocation().equals(dto4.getLocation()));
		Collection<AirportDTO> dto = new ArrayList<AirportDTO>();
		dto.add(dto4);
		dto.add(dto5);
		dto.add(dto2);
		dto.add(dto3);
		dto.add(dto1);
		
		boolean contains=dto.contains(dto2);
		System.out.println("contains : " +contains);
		
	}

}
