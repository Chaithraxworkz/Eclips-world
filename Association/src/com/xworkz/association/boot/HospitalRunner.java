package com.xworkz.association.boot;

import com.xworkz.association.things.Hospital;
import com.xworkz.association.things.Patient;

public class HospitalRunner {

	public static void main(String[] args) 
	{
		System.out.println("Main start aytu...");
		Hospital obj=new Hospital();
		Patient rogi=new Patient("Pavan","22", 30000, 60.5, "Karehalli", 6.5, 97542204416L, "Dengue", false, "Karna", 200);
		
		System.out.println(obj.name);
		System.out.println(obj.rogi);
		
		obj.display();
		
		
	}

}
