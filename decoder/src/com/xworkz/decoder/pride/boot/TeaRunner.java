package com.xworkz.decoder.pride.boot;
import com.xworkz.decoder.pride.*;

public class TeaRunner {

	public static void main(String[] args)
	{
		Tea obj=new Tea();
		System.out.println(obj.ManufactureDate);
		System.out.println(obj.ExpiryDate);
		System.out.println(obj. packageInfo);
		System.out.println(obj.company);
		System.out.println(obj.weight);
		System.out.println(obj.Sweet);
		System.out.println(obj.form);
		System.out.println(obj.height);
		System.out.println(obj.modelNo);
		
		
		obj.ManufactureDate="31-12-2021";
		obj.ExpiryDate="30-06-2022";
		obj.packageInfo="Box";
		obj.company="HUL";
		obj.weight=400;
		obj.height=250;
		obj.Sweet=true;
		obj.form="Dust";
		obj.modelNo=70201;
		
		System.out.println(obj.ManufactureDate);
		System.out.println(obj.ExpiryDate);
		System.out.println(obj. packageInfo);
		System.out.println(obj.company);
		System.out.println(obj.weight);
		System.out.println(obj.Sweet);
		System.out.println(obj.form);
		System.out.println(obj.height);
		System.out.println(obj.modelNo);
		
		System.out.println("details of cigerrete");
		  Cigaret ref=new Cigaret();
		
		  ref.flavor="topping";
			ref.buyTobaccoProducts="21 States";
			ref.smokerAge=18;
			ref.tobaccoNotUse="Alberta";
			ref.taxation="United States";
			ref.manufactureDate="28-02-2019";
			ref.expDate="30-04-2021";
			ref.smokeRestriction="Bhutan";
			ref.type="electronic";
			
			System.out.println(ref.flavor);
			System.out.println(ref.buyTobaccoProducts);
			System.out.println(ref.smokerAge);
			System.out.println(ref.tobaccoNotUse);
			System.out.println(ref.taxation);
			System.out.println(ref.manufactureDate);
			System.out.println(ref.expDate);
			System.out.println(ref.smokeRestriction);
			System.out.println(ref.type);
		
			
			System.out.println("details of dustbin");
			Dustbin obj1=new Dustbin();
			
			obj1.company="KDP";
			obj1.price=250;
			obj1.quantity=10;
			obj1.weight="300";
			obj1.country="India";
			obj1.State="Dubai";
			obj1.height="200";
			obj1.location="Bangalore";
			obj1.type="Metal";
			
			System.out.println(obj1.company);
			System.out.println(obj1.price);
			System.out.println(obj1.quantity);
			System.out.println(obj1.weight);
			System.out.println(obj1.country);
			System.out.println(obj1.State);
			System.out.println(obj1.height);
			System.out.println(obj1.location);
			System.out.println(obj1.type);
				
		
	}

}
