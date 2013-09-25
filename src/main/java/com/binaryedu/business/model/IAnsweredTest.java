package com.binaryedu.business.model;

import java.util.Date;
import java.util.List;


public interface IAnsweredTest
{

	/* (non-Javadoc)
	 * @see com.binaryedu.business.model.impl.IAnsweredTest#getId()
	 */
	public abstract long getId();

	/* (non-Javadoc)
	 * @see com.binaryedu.business.model.impl.IAnsweredTest#setId(long)
	 */
	public abstract void setId(long id);

	/* (non-Javadoc)
	 * @see com.binaryedu.business.model.impl.IAnsweredTest#getUser()
	 */
	public abstract IUser getUser();

	/* (non-Javadoc)
	 * @see com.binaryedu.business.model.impl.IAnsweredTest#setUser(com.binaryedu.business.model.IUser)
	 */
	public abstract void setUser(IUser user);

	/* (non-Javadoc)
	 * @see com.binaryedu.business.model.impl.IAnsweredTest#getTest()
	 */
	public abstract ITest getTest();

	/* (non-Javadoc)
	 * @see com.binaryedu.business.model.impl.IAnsweredTest#setTest(com.binaryedu.business.model.ITest)
	 */
	public abstract void setTest(ITest test);

	/* (non-Javadoc)
	 * @see com.binaryedu.business.model.impl.IAnsweredTest#getDateCompleted()
	 */
	public abstract Date getDateCompleted();

	/* (non-Javadoc)
	 * @see com.binaryedu.business.model.impl.IAnsweredTest#setDateCompleted(java.util.Date)
	 */
	public abstract void setDateCompleted(Date dateCompleted);

	/* (non-Javadoc)
	 * @see com.binaryedu.business.model.impl.IAnsweredTest#getNumQuestions()
	 */
	public abstract int getNumQuestions();

	/* (non-Javadoc)
	 * @see com.binaryedu.business.model.impl.IAnsweredTest#setNumQuestions(int)
	 */
	public abstract void setNumQuestions(int numQuestions);

	/* (non-Javadoc)
	 * @see com.binaryedu.business.model.impl.IAnsweredTest#getNumAttemptedQuestions()
	 */
	public abstract int getNumAttemptedQuestions();

	/* (non-Javadoc)
	 * @see com.binaryedu.business.model.impl.IAnsweredTest#setNumAttemptedQuestions(int)
	 */
	public abstract void setNumAttemptedQuestions(int numAttemptedQuestions);

	/* (non-Javadoc)
	 * @see com.binaryedu.business.model.impl.IAnsweredTest#getNumCorrectAnswers()
	 */
	public abstract int getNumCorrectAnswers();

	/* (non-Javadoc)
	 * @see com.binaryedu.business.model.impl.IAnsweredTest#setNumCorrectAnswers(int)
	 */
	public abstract void setNumCorrectAnswers(int numCorrectAnswers);

	/* (non-Javadoc)
	 * @see com.binaryedu.business.model.impl.IAnsweredTest#getPercentage()
	 */
	public abstract float getPercentage();

	/* (non-Javadoc)
	 * @see com.binaryedu.business.model.impl.IAnsweredTest#setPercentage(float)
	 */
	public abstract void setPercentage(float percentage);

	/**
	 * @return the sections
	 */
	public abstract List<IAnsweredSection> getSections();

	/**
	 * @param sections the sections to set
	 */
	public abstract void setSections(List<IAnsweredSection> sections);
	
	public IAnsweredSection getSectionByName(String sectionName);

}