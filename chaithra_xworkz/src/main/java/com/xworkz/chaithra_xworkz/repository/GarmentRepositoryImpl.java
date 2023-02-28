package com.xworkz.chaithra_xworkz.repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.xworkz.chaithra_xworkz.entity.GarmentEntity;


@Repository
public class GarmentRepositoryImpl implements GarmentRepository 
{
	@Autowired
	private EntityManagerFactory entityManagerFactory;
	
	public GarmentRepositoryImpl() 
	{
		System.out.println("created" + this.getClass().getSimpleName());
	}
	@Override
	public boolean save(GarmentEntity entity)
	{
		System.out.println("running the garmentRepoImpl" + entity);
		EntityManager manager = this.entityManagerFactory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		manager.persist(entity);
		transaction.commit();
		manager.close();
		return true;
	}
	@Override
	public GarmentEntity findById(int id) {
		System.out.println("Find by Id in repoImpl" + id);
		EntityManager entityManager = this.entityManagerFactory.createEntityManager();
		GarmentEntity entity = entityManager.find(GarmentEntity.class, id);
		entityManager.close();
		return entity;
	}

}
