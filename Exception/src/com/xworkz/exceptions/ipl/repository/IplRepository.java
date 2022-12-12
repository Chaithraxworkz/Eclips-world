package com.xworkz.exceptions.ipl.repository;

import com.xworkz.exceptions.ipl.dto.IplDTO;

public interface IplRepository 
{
	boolean create(IplDTO dto);
	
	default int total()
	{
		return 0;
	}
}
