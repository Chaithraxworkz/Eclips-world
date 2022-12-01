package com.xworkz.rules.boot;

import com.xworkz.rules.bridge.MahalakshmiPg;

public class PgRunner {

	public static void main(String[] args)
	{
		MahalakshmiPg pg=new MahalakshmiPg();
		pg.closeTimings();
		pg.outSidersNotAllowed();
		pg.noOfPeoples();
	
	}

}
