package com.xworkz.inheritance.boot;

import com.xworkz.inheritance.child.CentralJail;
import com.xworkz.inheritance.child.SubJail;
import com.xworkz.inheritance.child.Womens;
import com.xworkz.inheritance.thing.Jail;

public class JailRunner {

	public static void main(String[] args) 
	{
		Jail jail=new Jail();
		
		Jail jail1=new Womens();
		System.out.println(jail1.name);
		System.out.println(jail1.location);
		System.out.println(jail1.gender);
		
		Womens women=(Womens)jail1;
		System.out.println(women.name);
		System.out.println(women.cases);
		System.out.println(women.age);
		
		Jail jail2=new CentralJail();
		
		CentralJail central=(CentralJail)jail2;
		System.out.println(central.state);
		System.out.println(central.capacity);
		System.out.println(central.opened);
		
		Jail jail3=new SubJail();
		
		SubJail subjail=(SubJail)jail3;
		System.out.println(subjail.meetWeekDays);
		System.out.println(subjail.year);

	}

}
