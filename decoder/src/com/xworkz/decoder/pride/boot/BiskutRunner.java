package com.xworkz.decoder.pride.boot;
import com.xworkz.decoder.pride.*;

public class BiskutRunner {

	public static void main(String[] args) 
	{
		System.out.println("Enter the main");
		System.out.println(Biskut.b);
		Biskut biskut=new Biskut("Gudde", 20, "01-06-2022", 25);
		biskut.showoff();
	}

}
