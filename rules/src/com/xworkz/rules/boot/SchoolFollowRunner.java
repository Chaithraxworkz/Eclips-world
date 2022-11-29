package com.xworkz.rules.boot;

import java.lang.management.ManagementPermission;

import com.xworkz.rules.Management;
import com.xworkz.rules.bridge.SchoolFollow;

public class SchoolFollowRunner {

	public static void main(String[] args) 
	{
		SchoolFollow school=new SchoolFollow();
		school.chairmanOfSchool();
		school.nameOfSchool();
		school.principleOfSchool();
		school.schoolLocation();
		school.wearUniform();
		
		System.out.println("`````````````````");
		Management follow=new SchoolFollow();
		follow.chairmanOfSchool();
		
	}

}
