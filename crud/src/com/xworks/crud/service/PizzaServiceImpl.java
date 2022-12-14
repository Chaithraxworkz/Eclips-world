package com.xworks.crud.service;

import com.xworks.crud.constant.PizzaSize;
import com.xworks.crud.dto.PizzaDTO;

public class PizzaServiceImpl implements PizzaService {

	@Override
	public boolean validateandsave(PizzaDTO dto)
	{
		System.out.println("running validateAndSave"+ dto);
		String name=dto.getName();
		String company=dto.getCompany();
		PizzaSize size=dto.getSize();
		double price=dto.getPrice();
		String flavour=dto.getFlavour();
		String type=dto.getType();
		boolean cheese=dto.isCheese();
		
		boolean validname = true;
		boolean validprice = false;
		if(name!=null && name.length()>=4 && name.length()<=20)
		{
			System.out.println("valid pizza name" +name);
			validname=true;
		}
		else
		{
			System.out.println("invalid pizza name" +name);
		}
		if(price>=50 && price<=2000)
		{
			System.out.println("valid price" + price);
			validprice=true;
		}
		else
		{
			System.out.println("invaalid price" +price);
		}
		if(company!=null && company.length()>=4 && company.length()<=20)
		{
			System.out.println("valid company" +company);
			boolean validcompany = true;
		}
		else
		{
			System.out.println("invalid company" +company);
		}
		
		if(flavour!=null && flavour.length()>=3 && flavour.length()<=20)
		{
			System.out.println("valid flavour" +flavour);
			boolean validflavour = true;
		}
		else
		{
			System.out.println("invalid flavour" +flavour);
		}
		if(type!=null && type=="veg" && type=="Nonveg")
		{
			System.out.println("valid type " +type);
			boolean validtype = true;
		}
		else
		{
			System.out.println("invalid type"+ type);
		}
		return false;
	}
	

}
