/**
 * 
 */
package com.binaryedu.business.model.impl;

import java.util.Date;

import com.binaryedu.business.model.ITestResult;
import com.binaryedu.business.model.ITest;
import com.binaryedu.business.model.IUser;

/**
 * @author parsingh
 * 
 */
public class TestResult implements ITestResult
{
	private long id;
	private IUser user;
	private ITest test;
	private Date dateCompleted;
	private int numQuestions;
	private int numAttemptedQuestions;
	private int numCorrectAnswers;
	private float percentage;
	private float percentile;
	private String answerXML;
	
	/**
	 * @return the id
	 */
	public long getId()
	{
		return id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(long id)
	{
		this.id = id;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.binaryedu.business.model.impl.IAnsweredTest#getUser()
	 */
	public IUser getUser()
	{
		return user;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.binaryedu.business.model.impl.IAnsweredTest#setUser(com.binaryedu
	 * .business.model.IUser)
	 */
	public void setUser(IUser user)
	{
		this.user = user;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.binaryedu.business.model.impl.IAnsweredTest#getTest()
	 */
	public ITest getTest()
	{
		return test;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.binaryedu.business.model.impl.IAnsweredTest#setTest(com.binaryedu
	 * .business.model.ITest)
	 */
	public void setTest(ITest test)
	{
		this.test = test;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.binaryedu.business.model.impl.IAnsweredTest#getDateCompleted()
	 */
	public Date getDateCompleted()
	{
		return dateCompleted;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.binaryedu.business.model.impl.IAnsweredTest#setDateCompleted(java
	 * .util.Date)
	 */
	public void setDateCompleted(Date dateCompleted)
	{
		this.dateCompleted = dateCompleted;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.binaryedu.business.model.impl.IAnsweredTest#getPercentile()
	 */
	public float getPercentile()
	{
		return percentile;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.binaryedu.business.model.impl.IAnsweredTest#setPercentile(float)
	 */
	public void setPercentile(float percentile)
	{
		this.percentile = percentile;
	}

	public String getAnswerXML()
	{
		return answerXML;
	}

	public void setAnswerXML(String answerXML)
	{
		this.answerXML = answerXML;
	}

	/**
	 * @return the numQuestions
	 */
	public int getNumQuestions()
	{
		return numQuestions;
	}

	/**
	 * @param numQuestions the numQuestions to set
	 */
	public void setNumQuestions(int numQuestions)
	{
		this.numQuestions = numQuestions;
	}

	/**
	 * @return the numAttemptedQuestions
	 */
	public int getNumAttemptedQuestions()
	{
		return numAttemptedQuestions;
	}

	/**
	 * @param numAttemptedQuestions the numAttemptedQuestions to set
	 */
	public void setNumAttemptedQuestions(int numAttemptedQuestions)
	{
		this.numAttemptedQuestions = numAttemptedQuestions;
	}

	/**
	 * @return the numCorrectAnswers
	 */
	public int getNumCorrectAnswers()
	{
		return numCorrectAnswers;
	}

	/**
	 * @param numCorrectAnswers the numCorrectAnswers to set
	 */
	public void setNumCorrectAnswers(int numCorrectAnswers)
	{
		this.numCorrectAnswers = numCorrectAnswers;
	}

	/**
	 * @return the percentage
	 */
	public float getPercentage()
	{
		return percentage;
	}

	/**
	 * @param percentage the percentage to set
	 */
	public void setPercentage(float percentage)
	{
		this.percentage = percentage;
	}
}
