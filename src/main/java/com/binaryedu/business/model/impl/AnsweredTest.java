package com.binaryedu.business.model.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.binaryedu.business.model.IAnsweredSection;
import com.binaryedu.business.model.IAnsweredTest;
import com.binaryedu.business.model.ITest;
import com.binaryedu.business.model.IUser;

public class AnsweredTest implements IAnsweredTest
{
	private long id;
	private IUser user;
	private ITest test;
	private Date dateCompleted;
	private int numQuestions;
	private int numAttemptedQuestions;
	private int numCorrectAnswers;
	private float percentage;
	List<IAnsweredSection> sections = new ArrayList<IAnsweredSection>();

	/* (non-Javadoc)
	 * @see com.binaryedu.business.model.impl.IAnsweredTest#getId()
	 */
	/* (non-Javadoc)
	 * @see com.binaryedu.business.model.impl.IAnsweredTest#getId()
	 */
	public long getId()
	{
		return id;
	}

	/* (non-Javadoc)
	 * @see com.binaryedu.business.model.impl.IAnsweredTest#setId(long)
	 */
	/* (non-Javadoc)
	 * @see com.binaryedu.business.model.impl.IAnsweredTest#setId(long)
	 */
	public void setId(long id)
	{
		this.id = id;
	}

	/* (non-Javadoc)
	 * @see com.binaryedu.business.model.impl.IAnsweredTest#getUser()
	 */
	/* (non-Javadoc)
	 * @see com.binaryedu.business.model.impl.IAnsweredTest#getUser()
	 */
	public IUser getUser()
	{
		return user;
	}

	/* (non-Javadoc)
	 * @see com.binaryedu.business.model.impl.IAnsweredTest#setUser(com.binaryedu.business.model.IUser)
	 */
	/* (non-Javadoc)
	 * @see com.binaryedu.business.model.impl.IAnsweredTest#setUser(com.binaryedu.business.model.IUser)
	 */
	public void setUser(IUser user)
	{
		this.user = user;
	}

	/* (non-Javadoc)
	 * @see com.binaryedu.business.model.impl.IAnsweredTest#getTest()
	 */
	/* (non-Javadoc)
	 * @see com.binaryedu.business.model.impl.IAnsweredTest#getTest()
	 */
	public ITest getTest()
	{
		return test;
	}

	/* (non-Javadoc)
	 * @see com.binaryedu.business.model.impl.IAnsweredTest#setTest(com.binaryedu.business.model.ITest)
	 */
	/* (non-Javadoc)
	 * @see com.binaryedu.business.model.impl.IAnsweredTest#setTest(com.binaryedu.business.model.ITest)
	 */
	public void setTest(ITest test)
	{
		this.test = test;
	}

	/* (non-Javadoc)
	 * @see com.binaryedu.business.model.impl.IAnsweredTest#getDateCompleted()
	 */
	/* (non-Javadoc)
	 * @see com.binaryedu.business.model.impl.IAnsweredTest#getDateCompleted()
	 */
	public Date getDateCompleted()
	{
		return dateCompleted;
	}

	/* (non-Javadoc)
	 * @see com.binaryedu.business.model.impl.IAnsweredTest#setDateCompleted(java.util.Date)
	 */
	/* (non-Javadoc)
	 * @see com.binaryedu.business.model.impl.IAnsweredTest#setDateCompleted(java.util.Date)
	 */
	public void setDateCompleted(Date dateCompleted)
	{
		this.dateCompleted = dateCompleted;
	}

	/* (non-Javadoc)
	 * @see com.binaryedu.business.model.impl.IAnsweredTest#getNumQuestions()
	 */
	/* (non-Javadoc)
	 * @see com.binaryedu.business.model.impl.IAnsweredTest#getNumQuestions()
	 */
	public int getNumQuestions()
	{
		return numQuestions;
	}

	/* (non-Javadoc)
	 * @see com.binaryedu.business.model.impl.IAnsweredTest#setNumQuestions(int)
	 */
	/* (non-Javadoc)
	 * @see com.binaryedu.business.model.impl.IAnsweredTest#setNumQuestions(int)
	 */
	public void setNumQuestions(int numQuestions)
	{
		this.numQuestions = numQuestions;
	}

	/* (non-Javadoc)
	 * @see com.binaryedu.business.model.impl.IAnsweredTest#getNumAttemptedQuestions()
	 */
	/* (non-Javadoc)
	 * @see com.binaryedu.business.model.impl.IAnsweredTest#getNumAttemptedQuestions()
	 */
	public int getNumAttemptedQuestions()
	{
		return numAttemptedQuestions;
	}

	/* (non-Javadoc)
	 * @see com.binaryedu.business.model.impl.IAnsweredTest#setNumAttemptedQuestions(int)
	 */
	/* (non-Javadoc)
	 * @see com.binaryedu.business.model.impl.IAnsweredTest#setNumAttemptedQuestions(int)
	 */
	public void setNumAttemptedQuestions(int numAttemptedQuestions)
	{
		this.numAttemptedQuestions = numAttemptedQuestions;
	}

	/* (non-Javadoc)
	 * @see com.binaryedu.business.model.impl.IAnsweredTest#getNumCorrectAnswers()
	 */
	/* (non-Javadoc)
	 * @see com.binaryedu.business.model.impl.IAnsweredTest#getNumCorrectAnswers()
	 */
	public int getNumCorrectAnswers()
	{
		return numCorrectAnswers;
	}

	/* (non-Javadoc)
	 * @see com.binaryedu.business.model.impl.IAnsweredTest#setNumCorrectAnswers(int)
	 */
	/* (non-Javadoc)
	 * @see com.binaryedu.business.model.impl.IAnsweredTest#setNumCorrectAnswers(int)
	 */
	public void setNumCorrectAnswers(int numCorrectAnswers)
	{
		this.numCorrectAnswers = numCorrectAnswers;
	}

	/* (non-Javadoc)
	 * @see com.binaryedu.business.model.impl.IAnsweredTest#getPercentage()
	 */
	/* (non-Javadoc)
	 * @see com.binaryedu.business.model.impl.IAnsweredTest#getPercentage()
	 */
	public float getPercentage()
	{
		return percentage;
	}

	/* (non-Javadoc)
	 * @see com.binaryedu.business.model.impl.IAnsweredTest#setPercentage(float)
	 */
	/* (non-Javadoc)
	 * @see com.binaryedu.business.model.impl.IAnsweredTest#setPercentage(float)
	 */
	public void setPercentage(float percentage)
	{
		this.percentage = percentage;
	}

	/**
	 * @return the sections
	 */
	public List<IAnsweredSection> getSections()
	{
		return sections;
	}

	/**
	 * @param sections the sections to set
	 */
	public void setSections(List<IAnsweredSection> sections)
	{
		this.sections = sections;
	}
	
	public IAnsweredSection getSectionByName(String sectionName)
	{
		for(IAnsweredSection section : sections)
		{
			if(section.getName().equals(sectionName))
			{
				return section;
			}
		}
		
		// if we reach here, it means there's no section yet of this name
		// so create a new one and return it
		AnsweredSection as = new AnsweredSection();
		as.setName(sectionName);
		sections.add(as);
		return as;
	}
}
