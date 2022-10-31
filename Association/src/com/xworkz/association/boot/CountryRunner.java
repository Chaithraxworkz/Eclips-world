package com.xworkz.association.boot;
import com.xworkz.association.Gender;
import com.xworkz.association.Country;
import com.xworkz.association.thing.City;
import com.xworkz.association.thing.Name;
import com.xworkz.association.thing.Precident;

public class CountryRunner 
{

	public static void main(String[] args) 
	{
		System.out.println("Main start aytu....");
		Country obj=new Country("India");
		Precident pre=new Precident("Narendra Modhi");
		
		Name name=new Name("India", "Jambu Dwipa", null);
		City city=new City(name);
		obj.setPrecident(pre);
		pre.setTenure(6);
		
		
		obj.display();
		
	}

}
