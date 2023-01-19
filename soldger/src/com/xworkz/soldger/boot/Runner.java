package com.xworkz.soldger.boot;

import com.xworkz.soldger.dto.SoldgerDTO;
import com.xworkz.soldger.repository.SoldgerRepo;
import com.xworkz.soldger.repository.SoldgerRepoImpl;
import com.xworkz.soldger.service.SoldgerService;
import com.xworkz.soldger.service.SoldgerServiceImpl;

public class Runner {

	public static void main(String[] args) 
	{
		SoldgerDTO dtos = new SoldgerDTO("Hareesh",101,"topper","second","India");
		
		SoldgerServiceImpl impl = new SoldgerServiceImpl();
		SoldgerRepo repo = new SoldgerRepoImpl();
		impl.setSoldgerRepo(repo);
		impl.validatedAndSave(dtos);
		
		
		
	}

}
