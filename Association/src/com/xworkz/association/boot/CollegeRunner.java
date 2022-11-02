package com.xworkz.association.boot;

import com.xworkz.association.things.College;
import com.xworkz.association.things.Student;

public class CollegeRunner {

	public static void main(String[] args)
	{
		System.out.println("Enter the main");
		College college=new College();
		Student student=new Student("Srusti", 8459702513l, "4JN18CS426", "collegeName", true, false, "India", "Karnataka");
		
		System.out.println(college.student);
		System.out.println(student.getBranch());
		System.out.println(student.getLocation());
		System.out.println(student.getFees());
		System.out.println(student.getPinCode());
		
		college.display();
		
		
	}

}
