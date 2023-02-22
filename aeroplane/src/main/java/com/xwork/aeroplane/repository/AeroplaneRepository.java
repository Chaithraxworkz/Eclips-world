package com.xwork.aeroplane.repository;

import com.xwork.aeroplane.entity.AeroplaneEntity;

public interface AeroplaneRepository 
{
	boolean save(AeroplaneEntity entity);

	default AeroplaneEntity findById(int id) 
	{
		return null;
	}
}
