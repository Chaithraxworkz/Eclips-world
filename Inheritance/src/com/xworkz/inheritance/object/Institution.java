package com.xworkz.inheritance.object;

public class Institution 
{
	private String name;
	private String location;
	private double fees;
	private long phNo;
	private String hr;
	private double start_Date;
	private int pinCode;
	private String s_Name;
	private int noOfStudents;
	private boolean presentation;
	
	public Institution()
	{
		System.out.println("details of the institution");
	}
	
	public Institution(String name, String location, double fees, long phNo, String hr, double start_Date, int pinCode,
			String s_Name, int noOfStudents, boolean presentation)
	{
		super();
		this.name = name;
		this.location = location;
		this.fees = fees;
		this.phNo = phNo;
		this.hr = hr;
		this.start_Date = start_Date;
		this.pinCode = pinCode;
		this.s_Name = s_Name;
		this.noOfStudents = noOfStudents;
		this.presentation = presentation;
	}
	@Override
	public boolean equals(Object other) 
	{
		if(other instanceof Institution)
		{
			Institution institute=(Institution)other;
			if(this.hr.equals(institute.hr) && this.location.equals(institute.location) && this.name.equals(institute.name)
			&& this.fees.equals(institute.fees) && this.noOfStudents.equals(institute.noOfStudents)&& this.s_Name.equals(institute.s_Name))
			{
				System.out.println("Teaching is good in that Institution");
				return true;
			}
			else
			{
				System.out.println("Teaching is not good");
			}
		}
		return false;
	}
	
	@Override
	public String toString() 
	{
		return "Institution [name=" + name + ", location=" + location + ", fees=" + fees + ", phNo=" + phNo + ", hr="
				+ hr + ", start_Date=" + start_Date + ", pinCode=" + pinCode + ", s_Name=" + s_Name + ", noOfStudents="
				+ noOfStudents + ", presentation=" + presentation + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public double getFees() {
		return fees;
	}

	public void setFees(double fees) {
		this.fees = fees;
	}

	public long getPhNo() {
		return phNo;
	}

	public void setPhNo(long phNo) {
		this.phNo = phNo;
	}

	public String getHr() {
		return hr;
	}

	public void setHr(String hr) {
		this.hr = hr;
	}

	public double getStart_Date() {
		return start_Date;
	}

	public void setStart_Date(double start_Date) {
		this.start_Date = start_Date;
	}

	public int getPinCode() {
		return pinCode;
	}

	public void setPinCode(int pinCode) {
		this.pinCode = pinCode;
	}

	public String getS_Name() {
		return s_Name;
	}

	public void setS_Name(String s_Name) {
		this.s_Name = s_Name;
	}

	public int getNoOfStudents() {
		return noOfStudents;
	}

	public void setNoOfStudents(int noOfStudents) {
		this.noOfStudents = noOfStudents;
	}

	public boolean isPresentation() {
		return presentation;
	}

	public void setPresentation(boolean presentation) {
		this.presentation = presentation;
	}
	
	
	
	
}
