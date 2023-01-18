package com.xworkz.soldger.service;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import org.springframework.context.annotation.Configuration;

import com.xworkz.soldger.dto.SoldgerDTO;
import com.xworkz.soldger.repository.SoldgerRepo;

import io.quarkus.arc.runtime.BeanContainer.Factory;
import lombok.Setter;

public class SoldgerServiceImpl implements SoldgerService 
{
	private SoldgerRepo repo;

	public SoldgerServiceImpl()
	{
		System.out.println("created the SoldgerServiceImpl no-arg const");
	}
	public void setSoldgerRepo(SoldgerRepo repo)
	{
		this.repo = repo;
	}
	
	@Override
	public boolean validatedAndSave(SoldgerDTO dto) 
	{
		System.out.println("start the validatedAndSave");
		System.out.println("passed dto :" + dto);
		ValidatorFactory fact = Validation.buildDefaultValidatorFactory();
		Validator validtor = fact.getValidator();
		Set<ConstraintViolation<SoldgerDTO>> violations = validtor.validate(dto);
		if(!violations.isEmpty())
		{
			System.out.println("error of validate :");
			
			violations.forEach(c->  System.out.println(c.getMessage()));
			return false;
		}
		else
		{
			System.out.println("data is validte");
			boolean ref = repo.save(dto);
			return ref;
		}
		
	}
	

}
