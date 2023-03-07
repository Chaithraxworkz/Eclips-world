package com.xworkz.chaithra_xworkz.service;

import java.util.Collections;
import java.util.List;
import java.util.Set;


import javax.validation.ConstraintViolation;

import com.xworkz.chaithra_xworkz.dto.GarmentDTO;

public interface GarmentService
{
	Set<ConstraintViolation<GarmentDTO>> validateAndSave(GarmentDTO dto);
	
	default GarmentDTO findById(int id)
	{
		return null;
	}
	default List<GarmentDTO> findByName(String name)
	{
		return Collections.emptyList();
	}
	Set<ConstraintViolation<GarmentDTO>> validateAndUpdate(GarmentDTO dto);

	default boolean validateAndDelete(int id) 
	{
		return false;
	}

	

}
