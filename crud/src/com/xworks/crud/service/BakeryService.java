package com.xworks.crud.service;

import com.xworks.crud.dto.BakeryDTO;
import com.xworks.crud.exceptions.InvalidBakeryDataException;

public interface BakeryService 
{
	boolean validAndSave(BakeryDTO dto)throws InvalidBakeryDataException;
}
