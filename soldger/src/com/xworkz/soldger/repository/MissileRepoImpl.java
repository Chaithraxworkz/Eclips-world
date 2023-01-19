package com.xworkz.soldger.repository;

import org.springframework.stereotype.Component;

import com.xworkz.soldger.dto.MissileDTO;

@Component
public class MissileRepoImpl implements MissileRepo
{

	@Override
	public boolean save(MissileDTO dto) 
	{
		System.out.println("running the save method");
		System.out.println("missilDTO" +dto);
		return true;
	}

}
