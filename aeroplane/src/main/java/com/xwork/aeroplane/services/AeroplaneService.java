package com.xwork.aeroplane.services;

import java.util.Set;

import javax.validation.ConstraintViolation;

import com.xwork.aeroplane.dto.AeroplaneDTO;

public interface AeroplaneService 
{
	Set<ConstraintViolation<AeroplaneDTO>> validateAndSave(AeroplaneDTO dto);

	default AeroplaneDTO findById(int id) 
	{
		return null;
	}
}
