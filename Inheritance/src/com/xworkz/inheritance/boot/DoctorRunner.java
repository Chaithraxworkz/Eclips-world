package com.xworkz.inheritance.boot;

import com.xworkz.inheritance.child.*;
import com.xworkz.inheritance.thing.Doctor;

public class DoctorRunner {

	public static void main(String[] args) 
	{
		System.out.println("Entering th main");
		Doctor doc=new Doctor();
		
		Doctor doc1=new Dentist();
		System.out.println("dentist");
		System.out.println(doc1.name);
		System.out.println(doc1.gender);
		Dentist dent=(Dentist)doc1;
		System.out.println(dent.fee);
		System.out.println(dent.clinic_Name);
		
		Doctor doc2=new ENT();
		
		ENT ent=(ENT)doc2;
		System.out.println(ent.suffering);
		System.out.println(ent.apponitment);
		
		Doctor doc3=new Cardologist();
		
		Cardologist card=(Cardologist)doc3;
		System.out.println(card.specilist);
		System.out.println(card.noOfPatients);
	}

}
