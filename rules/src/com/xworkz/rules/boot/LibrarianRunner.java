package com.xworkz.rules.boot;

import com.xworkz.rules.bridge.Librarian;
import com.xworkz.rules.bridge.Reader;

public class LibrarianRunner {

	public static void main(String[] args)
	{
		Reader read=new Reader();
		Librarian library=new Librarian(read);
		library.libraryCheck();
	}

}
