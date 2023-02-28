package com.xworkz.chaithra_xworkz.service;

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
}
