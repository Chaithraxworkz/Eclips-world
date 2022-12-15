package com.xworks.crud.service;

import com.xworks.crud.constant.PizzaSize;
import com.xworks.crud.dto.PizzaDTO;

public class PizzaServiceImpl implements PizzaService {

	@Override
	public boolean validateandsave(PizzaDTO dto)
	{
		System.out.println("running validateAndSave"+ dto);
		
		boolean validname = true;
		boolean validprice = false;
		if( dto.getName().length()>=4 && dto.getName().length()<=20)
		{
			System.out.println("running validateAndSave"+ dto);
			System.out.println("valid pizza name" +dto.getName());
			validname=true;
		}
		else
		{
			System.err.println("invalid pizza name" +dto.getName());
		}
		if(dto.getPrice()>=50 && dto.getPrice()<=2000)
		{
			System.out.println("running validateAndSave"+ dto);
			System.out.println("valid price" + dto.getPrice());
			validprice=true;
		}
		else
		{
			System.out.println("invaalid price" + dto.getPrice());
		}
		if( dto.getCompany().length()>=4 && dto.getCompany().length()<=20)
		{
			System.out.println("running validateAndSave"+ dto);
			System.out.println("valid company" +dto.getCompany());
			boolean validcompany = true;
		}
		else
		{
			System.out.println("invalid company" +dto.getCompany());
		}
		
		if(  dto.getFlavour().length()>=3 && dto.getFlavour().length()<=20)
		{
			System.out.println("running validateAndSave"+ dto);
			System.out.println("valid flavour" +dto.getFlavour());
			boolean validflavour = true;
		}
		else
		{
			System.out.println("invalid flavour" +dto.getFlavour());
		}
		if( dto.getType()=="veg" && dto.getType()=="Nonveg")
		{
			System.out.println("running validateAndSave"+ dto);
			System.out.println("valid type " +dto.getType());
			boolean validtype = true;
		}
		else
		{
			System.out.println("invalid type"+ dto.getType());
		}
		return false;
	}
	

}
