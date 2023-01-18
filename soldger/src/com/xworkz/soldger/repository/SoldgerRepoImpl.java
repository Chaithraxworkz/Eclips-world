package com.xworkz.soldger.repository;

import com.xworkz.soldger.dto.SoldgerDTO;

public class SoldgerRepoImpl implements SoldgerRepo
{
	public SoldgerRepoImpl() 
	{
		System.out.println("created the SoldgerRepoImpl no-arg const");
	}
	@Override
	public boolean save(SoldgerDTO dto) 
	{
		System.out.println("running the save");
		System.out.println("dto is :" +dto);
		return false;
		
	}
}
