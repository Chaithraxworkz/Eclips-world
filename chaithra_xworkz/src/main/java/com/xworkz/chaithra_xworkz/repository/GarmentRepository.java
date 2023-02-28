package com.xworkz.chaithra_xworkz.repository;

import com.xworkz.chaithra_xworkz.entity.GarmentEntity;

public interface GarmentRepository 
{
	boolean save(GarmentEntity entity);
	
	default GarmentEntity findById(int id)
	{
		return null;
	}
}
