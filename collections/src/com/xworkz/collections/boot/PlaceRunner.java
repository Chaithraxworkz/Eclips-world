package com.xworkz.collections.boot;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;

import com.xworkz.collections.dto.PlaceDTO;

public class PlaceRunner {

	public static void main(String[] args) 
	{
		PlaceDTO place1 = new PlaceDTO("Agra", "TajMahal", 500);
		PlaceDTO place2 = new PlaceDTO("Delhi", "Red-Fort", 1000);
		PlaceDTO place3 = new PlaceDTO("athura", "Krishna Janma Bhoomi", 1500);
		PlaceDTO place4 = new PlaceDTO("Ahmedabad", "Calico Museum ", 900);
		PlaceDTO place5 = new PlaceDTO("Jaipur", "courtyards and museums", 3500);
		
		boolean equals=place4.equals(place1);
		System.out.println(place4.getFamous().equals(place1.getFamous()));
		Collection<PlaceDTO> placedto = new LinkedList<PlaceDTO>();
		placedto.add(place5);
		placedto.add(place4);
		placedto.add(place3);
		placedto.add(place2);
		placedto.add(place1);
		
		boolean contains = placedto.contains(place2);
		System.out.println("contains : "+ contains);
	}

}
