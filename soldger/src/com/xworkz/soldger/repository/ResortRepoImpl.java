package com.xworkz.soldger.repository;

import org.springframework.stereotype.Component;

import com.xworkz.soldger.dto.ResortDTO;

@Component
public class ResortRepoImpl implements ResortRepo
{

	@Override
	public boolean save(ResortDTO dto) 
	{
		System.out.println("running the save");
		System.out.println("resortDTO" +dto);
		return true;
	}

}
