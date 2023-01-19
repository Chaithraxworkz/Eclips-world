package com.xworkz.soldger.service;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.soldger.dto.ResortDTO;
import com.xworkz.soldger.repository.ResortRepo;

@Component
public class ResortServiceimpl implements ResortService
{
	@Autowired
	private Validator validator;
	private ResortRepo resortRepo;
	
	public ResortServiceimpl(ResortRepo resortRepo) 
	{
		this.resortRepo=resortRepo;
	}

	@Override
	public boolean validateAndSave(ResortDTO dto)
	{
		System.out.println("running the validate and save");
		System.out.println("restorentDTO" +dto);
		
		Set<ConstraintViolation<ResortDTO>> violations = this.validator.validate(dto);
		if(!violations.isEmpty())
		{
			System.out.println("invalid data");
			violations.forEach(r -> System.err.println(r.getMessage()));
			return false;
		}
		else
		{
			System.out.println("valid data");
			boolean saved = resortRepo.save(dto);
			System.out.println("saved" +saved);
			return saved;
		}
		
	}

}
