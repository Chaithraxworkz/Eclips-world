package com.xworkz.collections.boot;

import java.sql.Ref;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;

public class PhoneRunner {

	public static void main(String[] args) 
	{
		String mobile1 = "Nokiya";
		String mobile2 = "Techno";
		String mobile3 = "Vivo";
		String mobile4 = "Opo";
		String mobile5 = "MobiStar";
		String mobile6 = "Samsung";
		
		Collection<String> mobile = new LinkedList<String>();
		mobile.add(mobile6);
		mobile.add(mobile5);
		mobile.add(mobile4);
		mobile.add(mobile3);
		mobile.add(mobile2);
		mobile.add(mobile1);
		mobile.add(null);
		System.out.println("List of Mobiles :" +mobile.size());
		System.out.println(mobile);
		for(String element : mobile)
		{
			System.out.println(element);
		}
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		Iterator<String> ref = mobile.iterator();
		while(ref.hasNext())
		{
			String element = ref.next();
			System.out.println(element);
		}
	}

}
