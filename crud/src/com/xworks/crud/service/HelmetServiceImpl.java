package com.xworks.crud.service;

import com.xworks.crud.constant.Color;
import com.xworks.crud.constant.HelmetType;
import com.xworks.crud.dto.HelmetDTO;
import com.xworks.crud.repository.HelmetRepository;
import com.xworks.crud.repository.HelmetRepositoryImpl;

public class HelmetServiceImpl implements HelmetService 
{
	private HelmetRepository helmetRepository;
	
	public HelmetServiceImpl( HelmetRepository helmetRepository)
	{
		this.helmetRepository=helmetRepository;
	}

	

	@Override
	public boolean validateAndSave(HelmetDTO dto) 
	{
		System.out.println("running the validateandsave");
		String brand=dto.getBrand();
		HelmetType Type = dto.getType();
		Double price=dto.getPrice();
		Color color=dto.getColor();
		
		boolean validateBrand = false;
		boolean validateType  = false;
		boolean validatePrice = false;
		boolean validatecolor = false;
		if(brand!=null && brand.length()>=3 && brand.length()<=10)
		{
			System.out.println("valid brand");
			 validateBrand = true;
		}
		else
		{
			System.out.println("invalid brand" +brand);
		}
		if(Type!=null)
		{
			System.out.println("valid type");
			 validateType = true;
		}
		else
		{
			System.out.println("invalid type" +Type);
		}
		if(price!=null && price >=700 && price <=10000)
		{
			System.out.println("valid price");
			 validatePrice = true;
		}
		else
		{
			System.out.println("invalid price" +price);
		}
		if(color!=null) 
		{
			System.out.println("valid color");
			 validatecolor = true;
		}
		else
		{
			System.out.println("invalid color" +color);
		}
		
		if(validatecolor&&validateType&&validatePrice&&validateBrand)
		{
			System.out.println("It is valid , can save it");
			boolean saved=this.helmetRepository.save(dto);
			System.out.println("It is saved"+saved);
			return saved;
		}
		System.out.println("data is not saved");
		return false;
	}
	
	
	

}
