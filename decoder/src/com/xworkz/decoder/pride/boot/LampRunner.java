package com.xworkz.decoder.pride.boot;
import com.xworkz.decoder.pride.Lamp;
import com.xworkz.decoder.pride.Lights;

public class LampRunner {

	public static void main(String[] args) 
	{
		System.out.println("Main start aytu.....");
		Lamp light=new Lamp("Table Lamp");
		light.voltage=21;
		light.display();
		
	}

}
