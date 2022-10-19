package com.xworkz.java;

public class Students 
{
	public String name;
	public String reg_No;
	public String phone_No;
	public int id;
	public boolean clean;
	public String[] subjects;
	public long[] fees;
	public String[] taluk;
	public boolean[] scholarShip;
	public String[] type;
	public int[] sl_No;
	
	public Students(String name,String reg_No,String phone_No,int id,boolean clean,String[] subjects,long[] fees,String[] taluk,boolean[] scholarship,String[] type,int[] sl_No)
	{
		this.name=name;
		this.reg_No=reg_No;
		this.phone_No=phone_No;
		this.id=id;
		this.clean=clean;
		this.subjects=subjects;
		this.fees=fees;
		this.taluk=taluk;
		this.scholarShip=scholarship;
		this.type=type;
		this.sl_No=sl_No;
	}
	public void display()
	{
		System.out.println(this.name);
		System.out.println(this.reg_No);
		System.out.println(this.phone_No);
		System.out.println(this.id);
		System.out.println(this.clean);
		System.out.println("to display the school details");
		for (int i = 0; i < this.subjects.length; i++) 
		{
			String obj1 = this.subjects[i];
			System.out.println(obj1);
		}
		for (int i = 0; i < this.fees.length; i++) 
		{
			long obj2 = this.fees[i];
			System.out.println(obj2);
		}
		for (int i = 0; i < this.taluk.length; i++) 
		{
			String obj3 = this.taluk[i];
			System.out.println(obj3);
		}
		for (int i = 0; i < this.scholarShip.length; i++) 
		{
			boolean obj4 = this.scholarShip[i];
			System.out.println(obj4);
		}
		for (int i = 0; i < this.type.length; i++) 
		{
			String obj5 = this.type[i];
			System.out.println(obj5);
		}
		for (int i = 0; i < this.sl_No.length; i++) 
		{
			int obj6 = this.sl_No[i];
			System.out.println(obj6);
			
		}
	}
}
