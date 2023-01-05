package com.xworkz.collections.dto;

import java.time.LocalDate;
import java.util.Collection;
import java.util.LinkedList;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class WeaponRunner {

	public static void main(String[] args) 
	{
		WeaponDTO weapon1 = new WeaponDTO("air gun","Bartholomäus Girandoni" , LocalDate.of(1799, 07, 20), 10000, weaponType.FIREARMS);
		WeaponDTO weapon2 = new WeaponDTO("Hydrogen cyanide","Vidhwansak" , LocalDate.of(1688, 06, 01), 5000, weaponType.CHEMICALWEAPONS);
		WeaponDTO weapon3 = new WeaponDTO("smallpox","Hareesh" , LocalDate.of(1560, 02, 25), 1000, weaponType.BIOLOGICALWEAPONS);
		WeaponDTO weapon4 = new WeaponDTO("tear gas","Arun" , LocalDate.of(1459, 01, 14), 1500, weaponType.CHEMICALWEAPONS);
		WeaponDTO weapon5 = new WeaponDTO("bow and arrow","Anusha" , LocalDate.of(2048, 10, 01), 20000, weaponType.COMBATWEAPONS);
		WeaponDTO weapon6 = new WeaponDTO("pike","Sanjay" , LocalDate.of(2003, 06, 15), 3000, weaponType.SHORTRANGEWEAPONS);
		WeaponDTO weapon7 = new WeaponDTO("dirty bomb","Sashi" , LocalDate.of(2013, 03, 18), 4000, weaponType.BIOLOGICALWEAPONS);
		WeaponDTO weapon8 = new WeaponDTO("torpedo","Kavya" , LocalDate.of(1000, 05, 25), 9500, weaponType.MISSILES);
		WeaponDTO weapon9 = new WeaponDTO("pistol","Puneeth" , LocalDate.of(2001, 07, 20), 750000, weaponType.SEMIAUTOMIC);
		WeaponDTO weapon10 = new WeaponDTO("AK-47","Karan" , LocalDate.of(1468, 06, 30), 4500, weaponType.AUTOMIC);
		WeaponDTO weapon11 = new WeaponDTO("congereve rocket","Ashok" , LocalDate.of(1520, 07, 19), 50000, weaponType.ROCKETS);
		WeaponDTO weapon12 = new WeaponDTO("bolwgun","Deepa" , LocalDate.of(1654, 01, 15), 950, weaponType.FIREARMS);
		WeaponDTO weapon13 = new WeaponDTO("rifle","Pavan" , LocalDate.of(1495, 05, 05), 60000, weaponType.AUTOMIC);
		WeaponDTO weapon14 = new WeaponDTO("cannon","Srusti" , LocalDate.of(1854, 04, 06), 5000, weaponType.SIEGEWEAPONS);
		WeaponDTO weapon15 = new WeaponDTO("automic bomb","Sangeetha" , LocalDate.of(1754, 06, 14), 90000, weaponType.NUCLEARWEAPONS);
		WeaponDTO weapon16 = new WeaponDTO("sten gun","navya" , LocalDate.of(2017, 10, 10), 95000, weaponType.AUTOMIC);
		WeaponDTO weapon17 = new WeaponDTO("revolver","Smruthi" , LocalDate.of(2015, 11, 30), 100000, weaponType.LONGRANGEWEAPONS);
		WeaponDTO weapon18 = new WeaponDTO("bazooka","Manu" , LocalDate.of(2000, 12, 28), 60000, weaponType.ROCKETS);
		WeaponDTO weapon19 = new WeaponDTO("ICBM","Neeraj" , LocalDate.of(2019, 11, 30), 70000, weaponType.MISSILES);
		WeaponDTO weapon20 = new WeaponDTO("Greekfire","Gagan" , LocalDate.of(1749, 10, 25), 85000, weaponType.COMBATWEAPONS);
		
		Collection<WeaponDTO> dtos = new LinkedList<WeaponDTO>();
		dtos.add(weapon20);
		dtos.add(weapon19);
		dtos.add(weapon18);
		dtos.add(weapon17);
		dtos.add(weapon16);
		dtos.add(weapon15);
		dtos.add(weapon14);
		dtos.add(weapon13);
		dtos.add(weapon12);
		dtos.add(weapon11);
		dtos.add(weapon10);
		dtos.add(weapon9);
		dtos.add(weapon8);
		dtos.add(weapon7);
		dtos.add(weapon6);
		dtos.add(weapon5);
		dtos.add(weapon4);
		dtos.add(weapon3);
		dtos.add(weapon2);
		dtos.add(weapon1);
		System.out.println(dtos);
		
		
		System.out.println("==============================================");
		System.out.println("price greater than 1000");
		dtos.stream().filter(e -> e.getPrice()>60000).collect(Collectors.toList())
				.forEach(g -> System.out.println(g));
		
		System.out.println("==============================================");
		System.out.println("all the weapons are madeBy & madeOn");
		dtos.stream().collect(Collectors.toList())
		.forEach(n -> System.out.println("madeBy : " + n.getMadeBy() +" madeOn : " +n.getMadeOn()));
	
		System.out.println("==============================================");
		System.out.println("sorted in decending order");
		dtos.stream().sorted((s1,s2)->s2.getName().compareToIgnoreCase(s1.getName())).collect(Collectors.toList())
		.forEach(s -> System.out.println(s));
		
		System.out.println("==============================================");
		System.out.println("weapons sort by MadeBy");
		dtos.stream().sorted((s1 , s2)->s1.getMadeBy().compareTo(s2.getMadeBy())).collect(Collectors.toList())
		.forEach(d -> System.out.println(d));
		
		System.out.println("==============================================");
		System.out.println("weapons sort by MadeOn");
		dtos.stream().sorted((s1 , s2)->s1.getMadeOn().compareTo(s2.getMadeOn())).collect(Collectors.toList())
		.forEach(a -> System.out.println(a));
		
		System.out.println("==============================================");
		System.out.println("weapons sort by Price");
		dtos.stream().sorted((s1 , s2)->Double.compare(s1.getPrice(), s2.getPrice())).collect(Collectors.toList())
		.forEach(a -> System.out.println(a));
		
		System.out.println("==============================================");
		System.out.println("weapons sort by Price decending order");
		dtos.stream().sorted((s1 , s2)->s2.getPrice()Double.compareToIgnoreCase(s1.getPrice())).collect(Collectors.toList())
		.forEach(e -> System.out.println(e));
		
		System.out.println("==============================================");
		System.out.println("weapons sort by name & MadeOn asc order");
		dtos.stream().sorted((s1 , s2)->s1.getMadeOn().compareTo(s2.getMadeOn())).collect(Collectors.toList())
		.forEach(a -> System.out.println(a));
	}

}
