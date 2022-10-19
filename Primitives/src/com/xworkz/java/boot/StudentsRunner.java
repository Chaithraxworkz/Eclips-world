package com.xworkz.java.boot;

import com.xworkz.java.Students;

public class StudentsRunner 
{
	public static void main(String[] args)
	{
		System.out.println("Enter into main");
		
		String[] subjects= {"Maths","Kannada","English","Science"};
		long[] fees = {50000,20000};
		String[] taluk = {"Channapatana","Bhadravathi"};
		boolean[] scholarShip = {true,false};
		String[] type = {"BoysHighSchool","GirlsHighSchool"};
		int[] sl_No = {1,3,5,4,9,8};
		Students temp=new Students("Rushma","356cs002","9753201495",27,true,subjects,fees,taluk,scholarShip,type,sl_No);
		temp.display();
		
		Students temp2=new Students("Pavan","356cs453","842501972",28,false,subjects,fees,taluk,scholarShip,type,sl_No);
		temp2.display();
	}
}
