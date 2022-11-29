package com.xworkz.rules.boot;

import com.xworkz.rules.College;
import com.xworkz.rules.bridge.StudentsFollow;

public class StudentsFollowRunner {

	public static void main(String[] args)
	{
		StudentsFollow students=new StudentsFollow();
		students.collegePrincipal();
		students.locationOfCollege();
		students.studentName();
		students.wearIdCard();
		students.wearUniform();
		students.studentPhoneNo();
		
		System.out.println("____________________________________________________________________");
		College college=new StudentsFollow();
		college.collegePrincipal();
		college.locationOfCollege();
		college.studentName();
		college.wearIdCard();
		college.wearUniform();
		college.studentPhoneNo();
	}

}
