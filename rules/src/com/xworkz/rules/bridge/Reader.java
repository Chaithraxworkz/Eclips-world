package com.xworkz.rules.bridge;

import com.xworkz.rules.things.LibraryRules;

public class Reader implements LibraryRules
{

	@Override
	public boolean maintainSilence() 
	{
		System.out.println("running maintainSilence");
		return false;
	}

	@Override
	public boolean readBooksOrPaper() 
	{
		System.out.println("running readBooksOrPaper");
		return false;
	}

}
