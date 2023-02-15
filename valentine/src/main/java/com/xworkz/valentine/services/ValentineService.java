package com.xworkz.valentine.services;

import java.util.Set;

import javax.validation.ConstraintViolation;

import com.xworkz.valentine.dto.ValentineDTO;

public interface ValentineService 
{
	Set<ConstraintViolation<ValentineDTO>> validateAndSave(ValentineDTO dto);
}
