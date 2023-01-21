package com.xworks.crud.repository;

import com.xworks.crud.dto.BakeryDTO;
import com.xworks.crud.exceptions.StorageFullException;

public class BakeryRepositoryImpl implements BakeryRepository 
{
	private BakeryDTO[] dtos=new BakeryDTO[5];
	private int currentIndex=0;

	@Override
	public boolean store(BakeryDTO dto) 
	{
		System.out.println("running the save");
		if(this.currentIndex<=this.dtos.length)
		{
			System.out.println("cannot add more bakery");
			throw new StorageFullException("name is invalid");
		}
		this.dtos[this.currentIndex]=dto;
		System.out.println("saved the data"+currentIndex);
		this.currentIndex++;
		return false;
	}

}
