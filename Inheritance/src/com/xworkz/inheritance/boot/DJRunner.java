package com.xworkz.inheritance.boot;

import com.xworkz.inheritance.child.WeddingDJ;
import com.xworkz.inheritance.component.Languags;
import com.xworkz.inheritance.thing.DJ;

public class DJRunner {

	public static void main(String[] args) 
	{
		DJ dj=new WeddingDJ("wedding",Languags.KANNADA,15-06-2021);
		System.out.println(dj.name);
		System.out.println(dj.language);
		System.out.println(dj.released);
	}

}
