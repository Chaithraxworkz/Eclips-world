package com.xworkz.association.boot;
import com.xworkz.association.thing.*;


public class PillarRunner {

	public static void main(String[] args) 
	{
		System.out.println("Main start aytu....");
		
		Pillar obj=new Pillar(21436439030L,"Bangalore",Shapes.POLYGONAL,7.5,"Iron");
		obj.showOff();
		obj.office.showOff();
	}

}
