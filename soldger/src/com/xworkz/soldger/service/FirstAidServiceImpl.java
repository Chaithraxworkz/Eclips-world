package com.xworkz.soldger.service;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.soldger.dto.FirstAidDTO;
import com.xworkz.soldger.repository.FirstAidRepo;

@Component
public class FirstAidServiceImpl implements FirstAidService
{
	@Autowired
	private Validator validator;
	private FirstAidRepo aidRepo;
	
	public FirstAidServiceImpl(FirstAidRepo aidRepo)
	{
		this.aidRepo=aidRepo;
		System.out.println("create the service repo");
	}

	
	@Override
	public boolean validateAndSave(FirstAidDTO dto) 
	{
		System.out.println("run the validate and save");
		System.out.println("dto" +dto);
	
		Set<ConstraintViolation<FirstAidDTO>> violations = this.validator.validate(dto);
		if(!violations.isEmpty())
		{
			violations.forEach(e -> System.out.println(e.getMessage()));
			return false;
		}
		else
		{
			System.out.println("data is valid");
			boolean saved=this.aidRepo.save(dto);
			System.out.println("saved" +saved);
			return saved;
		}
	}
}
