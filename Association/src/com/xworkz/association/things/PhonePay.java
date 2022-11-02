package com.xworkz.association.things;

public class PhonePay
{
	public String ownerName;
	public long accNo;
	public String dob;
	public String address;
	public long phoneno;
	String ifsc;
	String bank;
	public boolean online;
	public String location;
	public String state;
	public double creditAmount;
	
	public PhonePay(String ownerName, long accNo, String address, long phoneno, String bank, boolean online,String state, double creditAmount) {
		super();
		this.ownerName = ownerName;
		this.accNo = accNo;
		this.address = address;
		this.phoneno = phoneno;
		this.bank = bank;
		this.online = online;
		this.state = state;
		this.creditAmount = creditAmount;
	}
	public void setIFSC(String ifsc)
	{
		this.ifsc=ifsc;
	}
	public void setLocation(String location)
	{
		this.location=location;
	}
	public void setDOB(String dob)
	{
		this.dob=dob;
	}
	public String getIFSC()
	{
		return ifsc;
	}
	public String getDOB()
	{
		return dob;
	}
	public String getLocation()
	{
		return location;
	}
}
