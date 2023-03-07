package com.xworkz.chaithra_xworkz.repository;

import java.util.Collections;
import java.util.List;

import com.xworkz.chaithra_xworkz.entity.GarmentEntity;

public interface GarmentRepository 
{
	boolean save(GarmentEntity entity);
	
	boolean update(GarmentEntity entity);
	
	boolean delete(int id);


	default GarmentEntity findById(int id)
	{
		return null;
	}
	default List<GarmentEntity> findByName(String name)
	{
		return Collections.emptyList();
	}
}
