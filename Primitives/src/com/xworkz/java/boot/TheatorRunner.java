package com.xworkz.java.boot;

import com.xworkz.java.SeatType;
import com.xworkz.java.Theator;

public class TheatorRunner {

	public static void main(String[] args)
	{
		System.out.println("Enter the main mothods");
		String[] timings= {"10.30AM","1.30PM","4.30PM"};
		long[] queue= {100,60,70};
		
		Theator picture=new Theator("Balaji","Channapatana",150,"Mall",timings,SeatType.SECOND_CLASS,queue);
		picture.display();
				
	}

}
