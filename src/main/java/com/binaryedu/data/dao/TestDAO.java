/**
 * 
 */
package com.binaryedu.data.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import com.binaryedu.business.model.ITest;
import com.binaryedu.business.model.ITestResult;
import com.binaryedu.business.model.IUser;

/**
 * @author parsingh
 * 
 */
public class TestDAO extends AbstractDAO implements ITestDAO
{
	private Session currentSession;
	
	public TestDAO()
	{
		currentSession = HibernateUtil.getSession();
	}
	
	/*
	 * (non-Javadoc)
	 * 
	 * @see com.binaryedu.data.dao.ITestDAO#listAllTests()
	 */
	@Override
	public List<ITest> listAllTests(String type)
	{
		List<ITest> testList = null;

		try
		{
			Query query = currentSession.createQuery("from Test t where t.type = ?");
			query.setString(0, type);
			testList = (List<ITest>) query.list();
		}
		catch (Throwable e)
		{
			e.printStackTrace();
		}
		return testList;

	}

	@Override
	public ITest getTestByID(long id)
	{
		ITest test = null;

		try
		{
			Query query = currentSession.createQuery("from Test t where t.id = ?");
			query.setLong(0, id);
			test = (ITest) query.uniqueResult();
		}
		catch (Throwable e)
		{
			e.printStackTrace();
		}
		return test;
	}

	@Override
	public void storeAnsweredTest(ITestResult answeredTest)
	{
		try
		{
			currentSession.save(answeredTest);
		}
		catch (Throwable e)
		{
			e.printStackTrace();
		}
	}

	@Override
	public List<ITestResult> getUserAnsweredTests(IUser user)
	{
		List<ITestResult> testList = null;

		try
		{
			Query query = currentSession.createQuery("from TestResult t where t.user.id = ? order by t.dateCompleted desc");
			query.setLong(0, user.getId());
			testList = (List<ITestResult>) query.list();
		}
		catch (Throwable e)
		{
			e.printStackTrace();
		}
		return testList;
	}

	@Override
	public ITestResult getUserAnsweredTest(long resultID)
	{
		ITestResult testResult = null;

		try
		{
			Query query = currentSession.createQuery("from TestResult t where t.id = ?");
			query.setLong(0, resultID);
			testResult = (ITestResult) query.uniqueResult();
		}
		catch (Throwable e)
		{
			e.printStackTrace();
		}
		return testResult;
	}
}
