/**
 * 
 */
package com.binaryedu.data.dao;

import org.hibernate.Query;
import org.hibernate.Session;

import com.binaryedu.business.model.IUser;

/**
 * @author parsingh
 * 
 */
public class UserDAO extends AbstractDAO implements IUserDAO
{
	private Session currentSession;
	
	public UserDAO()
	{
		currentSession = HibernateUtil.getSession();
	}
	
	@Override
	public IUser getUserByEmail(String email)
	{
		IUser user = null;

		try
		{
			Query query = currentSession.createQuery("from User where email = ?");
			query.setString(0, email);
			// query.setParameter(0, email, Hibernate.STRING);
			user = (IUser) query.uniqueResult();
		}
		catch (Throwable e)
		{
			e.printStackTrace();
		}
		return user;
	}

	@Override
	public void updateUser(IUser user)
	{
		try
		{
			currentSession.update(user);
		}
		catch (Throwable e)
		{
			e.printStackTrace();
		}
	}

}
