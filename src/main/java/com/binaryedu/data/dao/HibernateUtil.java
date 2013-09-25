package com.binaryedu.data.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil
{
	private static SessionFactory factory;
	
	public static Session getSession()
	{
		return getSessionFactory().getCurrentSession();
	}
	
	public static SessionFactory getSessionFactory()
	{
		if(factory == null)
		{
			factory = new Configuration().configure().buildSessionFactory();
		}
		return factory;
	}
}
