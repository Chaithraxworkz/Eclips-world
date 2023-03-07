package com.xworkz.chaithra_xworkz.repository;

import java.util.List;

import javax.persistence.EntityManager;

import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

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
	@Override
	public List<GarmentEntity> findByName(String name)
	{
		EntityManager manager = this.entityManagerFactory.createEntityManager();
		try
		{
			Query query = manager.createNamedQuery("findByName");
			query.setParameter("nam",name);
			System.out.println("query : " +query);
			List<GarmentEntity> list = query.getResultList();
			System.out.println("Total list found in repo" +list.size());
			return list;
		}
		finally
		{
			manager.close();
			System.out.println("Released the connection");
		}
	}
	@Override
	public boolean update(GarmentEntity entity)
	{
		System.out.println("running the update in entity");
		EntityManager manager = this.entityManagerFactory.createEntityManager();
		try
		{
			EntityTransaction ts = manager.getTransaction();
			ts.begin();
			manager.merge(entity);
			ts.commit();
			return true;
		}
		finally
		{
			manager.close();
		}
	}
	@Override
	public boolean delete(int id)
	{
		System.out.println("Running the Delete");
		EntityManager manager = this.entityManagerFactory.createEntityManager();
		try
		{
			EntityTransaction ts = manager.getTransaction();
			GarmentEntity delete = manager.find(GarmentEntity.class, id);
			ts.begin();
			manager.remove(delete);
			ts.commit();
			return true;
		}
		finally
		{
			manager.close();
		}
	}
}
