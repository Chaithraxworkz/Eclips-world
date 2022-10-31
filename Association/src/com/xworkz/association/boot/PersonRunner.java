package com.xworkz.association.boot;
import com.xworkz.association.packages.*;
public class PersonRunner {

	public static void main(String[] args)
	{
		System.out.println("Entering to the main");
		City city=new City("Bengalore", "Bendakaluru", true, "Winter");
		Location location=new Location("Jaynagar",10,city);
		Address address=new Address(location);
		Company company=new Company("Infosys", "Narayan murthy", address);
		Job job=new Job("Developer", 3.5, false);
		Email email=new Email("chaithra","chaitjgd123",987452163200l,company);
		Email email2=new Email("Kajol","kajol986g4", 8755100642l, company);
		Email[] array= {email,email2};
		Person obj=new Person("Jeevitha",array,job);
		obj.showOff();
		
		
	}

}
