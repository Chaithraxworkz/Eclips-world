package com.xworkz.collections.boot;

import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Collectors;

import com.xworkz.collections.dto.PalaceDTO;

public class PalaceRunner {

	public static void main(String[] args) 
	{
		Collection<PalaceDTO> palace = new ArrayList<PalaceDTO>();
		palace.add(new PalaceDTO("Lalitha Mahal Palace", "Mysore", 2009, false, 200));
		palace.add(new PalaceDTO("Bangalore Palace", "Bangalore", 1878, false, 1000));
		palace.add(new PalaceDTO("Amba Vilas Palace", "Mysore", 1912, true, 500));
		palace.add(new PalaceDTO("Rambagh Palace", "Jaipur", 1931, true, 600));
		palace.add(new PalaceDTO("Lake  Palace", "Udaipur", 1743, true, 900));
		 
		palace.stream().filter(!dto ->dto.isDestroyed()).collect(Collectors.toSet()).forEach(dto->)
		
		
		
	}

}
