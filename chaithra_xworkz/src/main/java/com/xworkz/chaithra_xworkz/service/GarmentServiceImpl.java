package com.xworkz.chaithra_xworkz.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xworkz.chaithra_xworkz.dto.GarmentDTO;
import com.xworkz.chaithra_xworkz.entity.GarmentEntity;
import com.xworkz.chaithra_xworkz.repository.GarmentRepository;

@Service
public class GarmentServiceImpl implements GarmentService 
{
	@Autowired
	private GarmentRepository repo;
	
	public GarmentServiceImpl() 
	{
		System.out.println("created" + this.getClass().getSimpleName());
	}
	
	@Override
	public Set<ConstraintViolation<GarmentDTO>> validateAndSave(GarmentDTO dto) 
	{
		System.out.println("running the serviceImplementation");
		ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
		Validator validtor = factory.getValidator();
		Set<ConstraintViolation<GarmentDTO>> violations = validtor.validate(dto);
		if(violations!=null && !violations.isEmpty())
		{
			System.err.println("violations in dto");
			return violations;
		}
		else
		{
			System.out.println("violations is not there,can save");
			GarmentEntity entity = new GarmentEntity();
			entity.setName(dto.getName());
			entity.setLocation(dto.getLocation());
			entity.setNoOfEmployees(dto.getNoOfEmployees());
			entity.setPhNo(dto.getPhNo());
			entity.setOwnerName(dto.getOwnerName());
			boolean saved = this.repo.save(entity);
			System.out.println(saved);
			return Collections.emptySet();
		}
	}
	@Override
	public GarmentDTO findById(int id)
	{
		if (id > 0)
		{
			GarmentEntity entity = this.repo.findById(id);
			if (entity != null) 
			{
				System.out.println("entity is found in service for id");
				GarmentDTO dto = new GarmentDTO();
				dto.setLocation(entity.getLocation());
				dto.setName(entity.getName());
				dto.setNoOfEmployees(entity.getNoOfEmployees());
				dto.setOwnerName(entity.getOwnerName());
				dto.setPhNo(entity.getPhNo());
				dto.setId(entity.getId());
				return dto;
			}

		}
		return GarmentService.super.findById(id);
	}
	@Override
	public List<GarmentDTO> findByName(String name)
	{
		System.out.println("Running findByName in service " + name);
		if (name != null && !name.isEmpty()) {
			System.out.println("Name is valid calling repo");
			List<GarmentEntity> entities = this.repo.findByName(name);
			List<GarmentDTO> listOfDTO = new ArrayList<GarmentDTO>();
			for (GarmentEntity entity : entities) 
			{
				GarmentDTO dto = new GarmentDTO();
				dto.setId(entity.getId());
				dto.setName(entity.getName());
				dto.setLocation(entity.getLocation());
				dto.setOwnerName(entity.getOwnerName());			
				dto.setNoOfEmployees(entity.getNoOfEmployees());
				dto.setPhNo(entity.getPhNo());
				listOfDTO.add(dto);
			}
			System.out.println("Size in dtos " + listOfDTO.size());
			System.out.println("size in entities " + entities.size());
			return listOfDTO;
		} else {
			System.err.println("Name is invalid");
		}
		return GarmentService.super.findByName(name);
	}		
	@Override
	public Set<ConstraintViolation<GarmentDTO>> validateAndUpdate(GarmentDTO dto) 
	{
		System.out.println("running the serviceImplementation");
		ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
		Validator validtor = factory.getValidator();
		Set<ConstraintViolation<GarmentDTO>> violations = validtor.validate(dto);
		if(violations!=null && !violations.isEmpty())
		{
			System.err.println("violations in DTO :" + dto);
			return violations;
		}
		else
		{
			System.out.println("violations is not there in dto and can save the data");
			GarmentEntity entity = new GarmentEntity();
			entity.setName(dto.getName());
			entity.setLocation(dto.getLocation());
			entity.setNoOfEmployees(dto.getNoOfEmployees());
			entity.setPhNo(dto.getPhNo());
			entity.setId(dto.getId());
			entity.setOwnerName(dto.getOwnerName());
			boolean saved = this.repo.update(entity);
			System.out.println(saved);
			return Collections.emptySet();
		}
	}
	@Override
	public boolean validateAndDelete(int id) 
	{
		System.out.println("Running the delete operation");
		if(id<0)
		{
			return false;
		}
		else
		{
			boolean deleted = this.repo.delete(id);
			System.out.println("Deleted :" + deleted);
			return deleted;
		}
		
	}
}

