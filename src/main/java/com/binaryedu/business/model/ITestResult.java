package com.binaryedu.business.model;

import java.util.Date;


public interface ITestResult
{

	public long getId();
	
	public void setId(long id);
	
	/*
	 * (non-Javadoc)
	 * 
	 * @see com.binaryedu.business.model.impl.IAnsweredTest#getUser()
	 */
	public abstract IUser getUser();

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.binaryedu.business.model.impl.IAnsweredTest#setUser(com.binaryedu
	 * .business.model.IUser)
	 */
	public abstract void setUser(IUser user);

	/**
	 * @return the test
	 */
	public abstract ITest getTest();

	/**
	 * @param test
	 *            the test to set
	 */
	public abstract void setTest(ITest test);

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.binaryedu.business.model.impl.IAnsweredTest#getDateCompleted()
	 */
	public abstract Date getDateCompleted();

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.binaryedu.business.model.impl.IAnsweredTest#setDateCompleted(java
	 * .util.Date)
	 */
	public abstract void setDateCompleted(Date dateCompleted);

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.binaryedu.business.model.impl.IAnsweredTest#getPercentile()
	 */
	public abstract float getPercentile();

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.binaryedu.business.model.impl.IAnsweredTest#setPercentile(float)
	 */
	public abstract void setPercentile(float percentile);
	
	/**
	 * @return
	 */
	public String getAnswerXML();

	/**
	 * @param answerXML
	 */
	public void setAnswerXML(String answerXML);
	
	/**
	 * @return the numQuestions
	 */
	public int getNumQuestions();

	/**
	 * @param numQuestions the numQuestions to set
	 */
	public void setNumQuestions(int numQuestions);

	/**
	 * @return the numAttemptedQuestions
	 */
	public int getNumAttemptedQuestions();

	/**
	 * @param numAttemptedQuestions the numAttemptedQuestions to set
	 */
	public void setNumAttemptedQuestions(int numAttemptedQuestions);

	/**
	 * @return the numCorrectAnswers
	 */
	public int getNumCorrectAnswers();

	/**
	 * @param numCorrectAnswers the numCorrectAnswers to set
	 */
	public void setNumCorrectAnswers(int numCorrectAnswers);
	
	/**
	 * @return the percentage
	 */
	public float getPercentage();

	/**
	 * @param percentage the percentage to set
	 */
	public void setPercentage(float percentage);

}