package com.xworkz.soldger.service;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.soldger.dto.MissileDTO;
import com.xworkz.soldger.repository.MissileRepo;

@Component
public class MissileServiceImpl implements MissileService
{
	@Autowired
	private Validator validator;
	private MissileRepo repo;
	
	public MissileServiceImpl(MissileRepo repo) 
	{
		this.repo=repo;
	}
	

	@Override
	public boolean validateAndSave(MissileDTO dto) 
	{
		System.out.println("running the validate and save");
		System.out.println("missileDTO" +dto);
		
		Set<ConstraintViolation<MissileDTO>> violations = this.validator.validate(dto);
		if(!violations.isEmpty())
		{
			System.out.println("violation error");
			violations.forEach(m -> System.err.println(m.getMessage()));
			return false;
		}
		else
		{
			System.out.println("valid data");
			boolean saved = repo.save(dto);
			System.out.println("saved" +saved);
			return saved;
		}
		
	}

}
