package com.xworks.crud.service;

import com.xworks.crud.dto.BakeryDTO;
import com.xworks.crud.exceptions.InvalidBakeryDataException;

public class BakeryServiceImpl implements BakeryService 
{

	@Override
	public boolean validAndSave(BakeryDTO dto) throws InvalidBakeryDataException 
	{
		System.out.println("running bakeryDto");
		String name = dto.getName();
		String ownerName=dto.getOwnerName();
		String location=dto.getLocation();
		long phoneNo=dto.getPhoneNo();
		boolean validName = false;
		boolean validOwnerName=false;
		boolean validLocation = false;
		boolean validPhoneNo = false;
		
		if(name!=null && name.length()>=3 && name.length()<=30)
		{
			System.out.println("valid name");
		}
		else
		{
			System.out.println("invalid name"+ name);
		}
		
		if(validName)
		{
			
		}
		return false;
	}

}
