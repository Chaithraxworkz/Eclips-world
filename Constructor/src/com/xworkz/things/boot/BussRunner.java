package com.xworkz.things.boot;
import com.xworkz.things.tasks.*;
import com.xworkz.things.sweet.Chocolate;
import com.xworkz.things.audio.*;

public class BussRunner {

	public static void main(String[] args) 
	{
		System.out.println("Entering the main");
		System.out.println("bus details to travel ");
		Bus obj=new Bus();
		System.out.println(obj.number);
		System.out.println(obj.starting);
		System.out.println(obj.destination);
		obj.number=562138;
		obj.starting="Shimogga";
		obj.destination="Goa";
		System.out.println(obj.number);
		System.out.println(obj.starting);
		System.out.println(obj.destination);
		
		
		System.out.println("To collect the deatil of the collector");
		DistrictCollector district=new DistrictCollector();
		district.name="Surya";
		district.age=40;
		district.district="Ramanagar";
		district.batchNo=2021;
		System.out.println(district.name);
		System.out.println(district.age);
		System.out.println(district.district);
		System.out.println(district.batchNo);
		
		System.out.println("collect the deails of chocolates");
		Chocolate obj1=new Chocolate();
		obj1.name="Milkybar";
		obj1.brand="Nestlay";
		obj1.price=20;
		obj1.flavour="Creamy White";
		System.out.println(obj1.name);
		System.out.println(obj1.brand);
		System.out.println(obj1.price);
		System.out.println(obj1.flavour);
		
		System.out.println("Full deails of song");
		Song ref=new Song();
		ref.name="Varaha Roopam";
		ref.lyrics="Shashiraj Kavoor";
		ref.language="Kannada";
		ref.singer="B Ajaneesh";
		ref.type="audio/mpeg";
		ref.rating=5;
		System.out.println(ref.name);
		System.out.println(ref.language);
		System.out.println(ref.singer);
		System.out.println(ref.lyrics);
		System.out.println(ref.type);
		System.out.println(ref.rating);
		
		System.out.println("Developer jataka");
		Developer code=new Developer();
		code.name="Avishek Ranjan";
		code.education="Engineering";
		code.experience=15;
		code.slary=100000;
		code.company="Infosys";
		System.out.println(code.name);
		System.out.println(code.education);
		System.out.println(code.experience);
		System.out.println(code.slary);
		System.out.println(code.company);
		
	}

}
