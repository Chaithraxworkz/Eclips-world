package com.xworks.crud.repository;

import com.xworks.crud.dto.HelmetDTO;

public class HelmetRepositoryImpl implements HelmetRepository
{
	private  HelmetDTO[] dtos = new HelmetDTO[10];
	private int currentIndex=0;
			

	@Override
	public boolean save(HelmetDTO dto) 
	{
		System.out.println("runnng the dtos");
		if(this.currentIndex>=this.dtos.length)
		{
			System.out.println("It is full");
			return false;
		}
		this.dtos[this.currentIndex]=dto;
		System.out.println("data saved"+ dto + "in index " +this.currentIndex);
		this.currentIndex++;
		return true;
	}

}
