package com.service;

import javax.persistence.*;
import com.entity.*;
import java.util.*;


public class AccountDataService 
{
	public int saveData(AccountEntity entity)
	{
		int result=0;
		EntityManagerFactory emf=null;
		try
		{
			emf=Persistence.createEntityManagerFactory("AccountServices");
			EntityManager em = emf.createEntityManager();
			EntityTransaction et = em.getTransaction();
			et.begin();
			em.persist(entity);
			et.commit();
			System.out.println("Persisted");
			System.out.println(entity.getAccountNumer());
			result = entity.getAccountNumer();
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		finally
		{
			if(emf != null)
			{
				emf.close();
			}
		}
		return result;
	}
	
	
	@SuppressWarnings("unchecked")
	public List<AccountTypeEntity> getAcccountType() throws Exception
	{
		List<AccountTypeEntity> rs = null;
		EntityManagerFactory emf=null;
		try
		{
			emf=Persistence.createEntityManagerFactory("AccountServices");
			EntityManager em = emf.createEntityManager();
			EntityTransaction et = em.getTransaction();
			et.begin();
			Query q = em.createQuery("select at from AccountTypeEntity at");
			rs = q.getResultList();
			et.commit();
			if(rs.isEmpty())
			{
				throw new Exception();
			}
			else
			{
				System.out.println("List Populated");
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			if(emf != null)
			{
				emf.close();
			}
		}
		return rs;
	}
}
