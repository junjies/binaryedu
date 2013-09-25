package com.binaryedu.business.model.impl;

import java.util.List;

import com.binaryedu.business.model.IQuestion;
import com.binaryedu.business.model.ISection;

/**
 * 
 * @author param
 */

public class Section implements ISection
{
	int id;
	String name;
	String message;
	List<IQuestion> questions;

	/**
	 * @return the id
	 */
	public int getId()
	{
		return id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(int id)
	{
		this.id = id;
	}

	/**
	 * @return the name
	 */
	public String getName()
	{
		return name;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name)
	{
		this.name = name;
	}

	/**
	 * @return the message
	 */
	public String getMessage()
	{
		return message;
	}

	/**
	 * @param message
	 *            the message to set
	 */
	public void setMessage(String message)
	{
		this.message = message;
	}

	/**
	 * @return the questions
	 */
	public List<IQuestion> getQuestions()
	{
		return questions;
	}

	/**
	 * @param questions
	 *            the questions to set
	 */
	public void setQuestions(List<IQuestion> questions)
	{
		this.questions = questions;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.binaryedu.business.model.ISection#getNumQuestions()
	 */
	@Override
	public int getNumQuestions()
	{
		return questions.size();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.binaryedu.business.model.ISection#getTotalMarks()
	 */
	@Override
	public int getMarks()
	{
		int marks = 0;
		for (IQuestion question : questions)
		{
			marks += question.getMarks();
		}

		return marks;
	}

}
