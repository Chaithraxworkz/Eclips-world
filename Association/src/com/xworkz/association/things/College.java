package com.xworkz.association.things;

public class College 
{
	private String name="JNNC";
	public Student student=new Student("Srusti", 8459702513l, "4JN18CS426", name, true, false, "India", "Karnataka");
	
	public void display()
	{
		System.out.println(this.name);
		System.out.println(this.student);
		System.out.println(student.name);
		System.out.println(student.phoneNo);
		System.out.println(student.regNo);
		System.out.println(student.collegeName);
		System.out.println(student.library);
		System.out.println(student.campus);
		System.out.println(student.country);
		System.out.println(student.state);
		
		System.out.println(student.getLocation());
		student.setLocation("Shivamogga");
		
		System.out.println(student.getFees());
		student.setFees(80000);
		
		System.out.println(student.getBranch());
		student.setBranch("CSE");
		
		System.out.println(student.getPinCode());
		student.setPinCode(562860);
		
	}
	
}
