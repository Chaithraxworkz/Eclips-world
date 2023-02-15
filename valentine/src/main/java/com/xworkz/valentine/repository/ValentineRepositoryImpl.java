package com.xworkz.valentine.repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.xworkz.valentine.entity.ValentineEntity;

@Repository
public class ValentineRepositoryImpl implements ValentineRepository
{
	@Autowired
	private EntityManagerFactory entityManagerFactory;
	
	public ValentineRepositoryImpl() 
	{
		System.out.println("created" + this.getClass().getSimpleName());
	}

	@Override
	public boolean save(ValentineEntity entity) 
	{
		System.out.println("run the violation of the save method");
		EntityManager manager = this.entityManagerFactory.createEntityManager();
		EntityTransaction trans = manager.getTransaction();
		trans.begin();
		manager.persist(entity);
		trans.commit();
		manager.close();
		return true;
	}

}
