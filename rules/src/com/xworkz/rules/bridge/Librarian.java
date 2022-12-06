package com.xworkz.rules.bridge;

import com.xworkz.rules.things.LibraryRules;

public class Librarian 
{
	private LibraryRules libraryRules;
	
	public Librarian(LibraryRules libraryRules)
	{
		this.libraryRules=libraryRules;
	}
	
	public void libraryCheck()
	{
		if(this.libraryRules!=null)
		{
			boolean silence=this.libraryRules.maintainSilence();
			boolean read=this.libraryRules.readBooksOrPaper();
			if(silence==true && read==false)
			{
				System.out.println("reader isfollowing the rule");
			}
			else
			{
				System.out.println("reader is not folloing the rule");
			}
		}
	}
}
