package com.xworkz.association.things;

public class Patient 
{
	public String name;
	public String age;
	double price;
	public double weight;
	String address;
	public double height;
	public long phNo;
	public String deciease;
	public boolean appointment;
	public String doctorName;
	public int doctorFee;
	
	public Patient(String name, String age, double price, double weight, String address, double height, long phNo,
			String deciease, boolean appointment, String doctorName, int doctorFee) {
		super();
		this.name = name;
		this.age = age;
		this.price = price;
		this.weight = weight;
		this.address = address;
		this.height = height;
		this.phNo = phNo;
		this.deciease = deciease;
		this.appointment = appointment;
		this.doctorName = doctorName;
		this.doctorFee = doctorFee;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public void setAge(String age)
	{
		this.age=age;
	}
	public void setPrice(double price)
	{
		this.price=price;
	}
	public void setWeight(double weight)
	{
		this.weight=weight;
	}
	public void setAddress(String address)
	{
		this.address=address;
	}
	public void setHeight(double height)
	{
		this.height=height;
	}
	public void setPhNo(long phNo)
	{
		this.phNo=phNo;
	}
	public void setDeciease(String deciease)
	{
		this.deciease=deciease;
	}
	public void setAppointment(boolean appointment)
	{
		this.appointment=appointment;
	}
	public void setDoctorName(String doctorName)
	{
		this.doctorName=doctorName;
	}
	public void setDoctorFee(int doctoree)
	{
		this.doctorFee=doctorFee;
	}
	public String getName()
	{
		return name;
	}
	public String getAge()
	{
		return age;
	}
	public double getPrice()
	{
		return price;
	}
	public double getWeight()
	{
		return weight;
	}
	public String getAddress()
	{
		return address;
	}
	public double getHeight()
	{
		return height;
	}
	public long getPhNo()
	{
		return phNo;
	}
	public String getDeciease()
	{
		return deciease;
	}
	public boolean getAppointment()
	{
		return appointment;
	}
	public String getDoctorName()
	{
		return doctorName;
	}
	public int getDoctorFee()
	{
		return doctorFee;
	}
}
