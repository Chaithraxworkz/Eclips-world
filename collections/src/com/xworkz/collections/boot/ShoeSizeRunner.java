package com.xworkz.collections.boot;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;

public class ShoeSizeRunner {

	public static void main(String[] args) 
	{
		int size1 = 3;
		int size2 = 4;
		int size3 = 5;
		int size4 = 6;
		int size5 = 7;
		int size6 = 8;
		int size7 = 9;
		int size8 = 10;
		int size9 = 11;
		int size10 = 12;
		int size11 = 13;
		int size12 = 14;
		int size13 = 15;
		int size14 = 16;
		int size15 = 17;
		
		Collection<Integer> size = new LinkedList<Integer>();
		size.add(null);
		size.add(size1);
		size.add(size2);
		size.add(size3);
		size.add(size4);
		size.add(size5);
		size.add(size6);
		size.add(size7);
		size.add(size8);
		size.add(size9);
		size.add(size10);
		size.add(size11);
		size.add(size12);
		size.add(size13);
		size.add(size14);
		size.add(size15);
		
	System.out.println("shoe sizes :" +size.size());
	System.out.println(size);
	for(Integer element : size)
	{
		System.out.println(element);
	}
	System.out.println("-----------------------------------------------------------");
	Iterator<Integer> element = size.iterator();
	while(element.hasNext())
	{
		Integer ref = element.next();
		System.out.println(ref);
	}
		
	}

}
