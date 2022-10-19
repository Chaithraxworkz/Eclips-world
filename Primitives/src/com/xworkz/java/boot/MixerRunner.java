package com.xworkz.java.boot;

import com.xworkz.java.Mixer;

public class MixerRunner {

	public static void main(String[] args) 
	{
		System.out.println("Enter the ain method");
		int[] noOfJars= {1,2,3,4};
		String[] jarTypes= {"Grinding Jar","Chutney Jar","Juice Jar"};
		String[] colors= {"Silver","red","Black","Marron"};
		boolean[] stainlessSteel= {true};
		String[] shops= {"Reliance degital","flipcart","Amezon"};
		
		Mixer mixee=new Mixer("Mixii",400,"Bajaj",3,2500,noOfJars,jarTypes,colors,stainlessSteel,shops);
		mixee.display();
	}

}
