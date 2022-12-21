package com.xworkz.collections.boot;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class WatchRunner {

	public static void main(String[] args) 
	{
		String watch1 = "FastRack";
		String watch2 = "HMT";
		String watch3 = "Sonata";
		String watch4 = "Tyton";
		String watch5 = "Rolex";
		
		Collection<String> watch = new ArrayList<String>();
		watch.add(watch5);
		watch.add(watch3);
		watch.add(watch2);
		watch.add(watch4);
		watch.add(watch1);
		watch.add(null);
		System.out.println("Adding watch :"+watch.size());
		System.out.println(watch);
		
		for(String element : watch)
		{
			System.out.println(element);
		}
		Iterator<String> ref = watch.iterator();
		while(ref.hasNext())
		{
			String element =ref.next();
			System.out.println(element);
		}
	}

}
