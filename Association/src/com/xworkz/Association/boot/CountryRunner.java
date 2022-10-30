package com.xworkz.Association.boot;
import com.xworkz.Association.Gender;
import com.xworkz.Association.Country;
import com.xworkz.Association.thing.City;
import com.xworkz.Association.thing.Name;
import com.xworkz.Association.thing.Precident;

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
