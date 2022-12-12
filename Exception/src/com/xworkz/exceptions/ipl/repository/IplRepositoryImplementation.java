package com.xworkz.exceptions.ipl.repository;

import com.xworkz.exceptions.ipl.dto.IplDTO;

public class IplRepositoryImplementation implements IplRepository
{
	private IplDTO[] iplDtos=new IplDTO[10];
	private int currentindex=0;

	@Override
	public boolean create(IplDTO dto) 
	{
		//reference of dto is ToStrings()
		System.out.println("running of IplDTO" +dto);
		if(this.currentindex>=this.iplDtos.length)
		{
			System.out.println("size exceeded cannot add more teams");
			return false;
		}
		this.iplDtos[this.currentindex]=dto;
		System.out.println("saved" + dto + "in index" + this.currentindex);
		this.currentindex++;
		return true;
	}

}
