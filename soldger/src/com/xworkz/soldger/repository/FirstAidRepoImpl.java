package com.xworkz.soldger.repository;

import org.springframework.stereotype.Component;

import com.xworkz.soldger.dto.FirstAidDTO;

import lombok.NoArgsConstructor;
@NoArgsConstructor
@Component
public class FirstAidRepoImpl implements FirstAidRepo
{

	@Override
	public boolean save(FirstAidDTO dto) 
	{
		System.out.println("saved in the repo");
		System.out.println("dto" + dto);
		return false;
	}

}
