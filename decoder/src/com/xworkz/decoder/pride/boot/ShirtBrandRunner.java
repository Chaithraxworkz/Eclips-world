package com.xworkz.decoder.pride.boot;
import com.xworkz.decoder.pride.ShirtBrand;

public class ShirtBrandRunner {

	public static void main(String[] args) 
	{
		System.out.println("Main start aytu......");
		ShirtBrand brand=new ShirtBrand("Black");
		brand.setprice(599);
		brand.size="small";
		brand.display();
	}

}
