package com.binaryedu.business.model.impl;

import java.util.ArrayList;
import java.util.List;

import com.binaryedu.business.model.IAnsweredQuestion;
import com.binaryedu.business.model.IAnsweredSection;

public class AnsweredSection implements IAnsweredSection
{
	private String name;
	private List<IAnsweredQuestion> questions = new ArrayList<IAnsweredQuestion>();
	
	
	/* (non-Javadoc)
	 * @see com.binaryedu.business.model.impl.IAnsweredSection#getQuestions()
	 */
	@Override
	public List<IAnsweredQuestion> getQuestions()
	{
		return questions;
	}

	/* (non-Javadoc)
	 * @see com.binaryedu.business.model.impl.IAnsweredSection#setQuestions(java.util.List)
	 */
	@Override
	public void setQuestions(List<IAnsweredQuestion> questions)
	{
		this.questions = questions;
	}

	/* (non-Javadoc)
	 * @see com.binaryedu.business.model.impl.IAnsweredSection#getName()
	 */
	public String getName()
	{
		return name;
	}

	/* (non-Javadoc)
	 * @see com.binaryedu.business.model.impl.IAnsweredSection#setName(java.lang.String)
	 */
	public void setName(String name)
	{
		this.name = name;
	}
	
	public int getNumQuestions()
	{
		return questions.size();
	}
	
	public int getNumAttemptedQuestions()
	{
		int numAttemptedQuestions = 0;
		
		for(IAnsweredQuestion q : questions)
		{
			if(q.getUserOption() != 0)
			{
				numAttemptedQuestions++;
			}
		}
		
		return numAttemptedQuestions;
	}
	
	public int getNumCorrectAnswers()
	{
		int num = 0;
		
		for(IAnsweredQuestion q : questions)
		{
			if(q.getUserOption() == q.getCorrectOption())
			{
				num++;
			}
		}
		
		return num;
	}
	
	public float getPercentage()
	{
		return getNumCorrectAnswers() * 100.0f / getNumQuestions();
	}

}
