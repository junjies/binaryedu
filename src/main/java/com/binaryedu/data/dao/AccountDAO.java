/**
 * 
 */
package com.binaryedu.data.dao;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.exception.ConstraintViolationException;

import com.binaryedu.business.transferobject.ResetPasswordTO;
import com.binaryedu.business.transferobject.UserAccountTO;
import com.binaryedu.exceptions.BinaryException;
import com.binaryedu.exceptions.BinaryExceptionCodes;

/**
 * @author parsingh
 * 
 */
public class AccountDAO extends AbstractDAO implements IAccountDAO
{
	private Session currentSession;
	
	public AccountDAO()
	{
		currentSession = HibernateUtil.getSession();
	}
	
	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.binaryedu.data.dao.IAccountDAO#addAccount(com.binaryedu.business.
	 * transferobject.CreateAccountTO)
	 */
	@Override
	public void addAccount(UserAccountTO newUserTO) throws BinaryException
	{
		try
		{
			currentSession.saveOrUpdate(newUserTO);
		}
		catch (ConstraintViolationException cve)
		{
			currentSession.getTransaction().rollback();
			throw new BinaryException(BinaryExceptionCodes.USER_ALREADY_EXISTS);
		}
		catch (Throwable e)
		{
			e.printStackTrace();
		}
	}

	@Override
	public void updateAccount(UserAccountTO newUserTO)
	{
		try
		{
			currentSession.update(newUserTO);
		}
		catch (Throwable e)
		{
			e.printStackTrace();
		}
	}

	@Override
	public UserAccountTO getAccountByEmail(String email)
	{
		UserAccountTO userTO = null;

		try
		{
			Query query = currentSession.createQuery("from UserAccountTO where email = ?");
			query.setString(0, email);
			// query.setParameter(0, email, Hibernate.STRING);
			userTO = (UserAccountTO) query.uniqueResult();
		}
		catch (Throwable e)
		{
			e.printStackTrace();
		}
		return userTO;
	}
	
	@Override
	public void addResetPasswordRow(ResetPasswordTO resetPasswordTO)
	{
		try
		{
			Query query = currentSession.createQuery("from ResetPasswordTO where email = ?");
			query.setString(0, resetPasswordTO.getEmail());
			// query.setParameter(0, email, Hibernate.STRING);
			ResetPasswordTO obj = (ResetPasswordTO) query.uniqueResult();
			if(obj == null)
			{
				currentSession.saveOrUpdate(resetPasswordTO);
			}
			else
			{
				obj.setKey(resetPasswordTO.getKey());
				currentSession.saveOrUpdate(obj);
			}
		}
		catch (Throwable e)
		{
			e.printStackTrace();
		}
	}
	
	@Override
	public void deleteResetPasswordRow(ResetPasswordTO resetPasswordTO)
	{
		try
		{
			currentSession.delete(resetPasswordTO);
		}
		catch (Throwable e)
		{
			e.printStackTrace();
		}
	}
	
	@Override
	public ResetPasswordTO getResetPasswordRow(String email)
	{
		ResetPasswordTO obj = null;
		try
		{
			Query query = currentSession.createQuery("from ResetPasswordTO where email = ?");
			query.setString(0, email);
			// query.setParameter(0, email, Hibernate.STRING);
			obj = (ResetPasswordTO) query.uniqueResult();
		}
		catch (Throwable e)
		{
			e.printStackTrace();
		}
		
		return obj;
	}
}
