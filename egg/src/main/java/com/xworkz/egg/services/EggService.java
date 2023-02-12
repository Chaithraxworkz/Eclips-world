package com.xworkz.egg.services;

import com.xworkz.egg.dto.EggDTO;

public interface EggService 
{
	boolean validateAndSave(EggDTO dto);
}
