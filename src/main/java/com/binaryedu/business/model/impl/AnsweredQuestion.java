package com.binaryedu.business.model.impl;

import java.util.ArrayList;

import com.binaryedu.business.model.IAnsweredQuestion;

public class AnsweredQuestion implements IAnsweredQuestion
{
	private int questionNumber;
	private String directions;
	private String questionText;
	private ArrayList<String> options = new ArrayList<String>();
	private int correctOption;
	private int userOption;
	private String solution;
	private String section;

	/* (non-Javadoc)
	 * @see com.binaryedu.business.model.impl.IAnsweredQuestion#getQuestionNumber()
	 */
	/* (non-Javadoc)
	 * @see com.binaryedu.business.model.impl.IAnsweredQuestion#getQuestionNumber()
	 */
	public int getQuestionNumber()
	{
		return questionNumber;
	}

	/* (non-Javadoc)
	 * @see com.binaryedu.business.model.impl.IAnsweredQuestion#setQuestionNumber(int)
	 */
	/* (non-Javadoc)
	 * @see com.binaryedu.business.model.impl.IAnsweredQuestion#setQuestionNumber(int)
	 */
	public void setQuestionNumber(int questionNumber)
	{
		this.questionNumber = questionNumber;
	}

	/* (non-Javadoc)
	 * @see com.binaryedu.business.model.impl.IAnsweredQuestion#getDirections()
	 */
	/* (non-Javadoc)
	 * @see com.binaryedu.business.model.impl.IAnsweredQuestion#getDirections()
	 */
	public String getDirections()
	{
		return directions;
	}

	/* (non-Javadoc)
	 * @see com.binaryedu.business.model.impl.IAnsweredQuestion#setDirections(java.lang.String)
	 */
	/* (non-Javadoc)
	 * @see com.binaryedu.business.model.impl.IAnsweredQuestion#setDirections(java.lang.String)
	 */
	public void setDirections(String directions)
	{
		this.directions = directions;
	}

	/* (non-Javadoc)
	 * @see com.binaryedu.business.model.impl.IAnsweredQuestion#getQuestionText()
	 */
	/* (non-Javadoc)
	 * @see com.binaryedu.business.model.impl.IAnsweredQuestion#getQuestionText()
	 */
	public String getQuestionText()
	{
		return questionText;
	}

	/* (non-Javadoc)
	 * @see com.binaryedu.business.model.impl.IAnsweredQuestion#setQuestionText(java.lang.String)
	 */
	/* (non-Javadoc)
	 * @see com.binaryedu.business.model.impl.IAnsweredQuestion#setQuestionText(java.lang.String)
	 */
	public void setQuestionText(String questionText)
	{
		this.questionText = questionText;
	}

	/* (non-Javadoc)
	 * @see com.binaryedu.business.model.impl.IAnsweredQuestion#getOptions()
	 */
	/* (non-Javadoc)
	 * @see com.binaryedu.business.model.impl.IAnsweredQuestion#getOptions()
	 */
	public ArrayList<String> getOptions()
	{
		return options;
	}

	/* (non-Javadoc)
	 * @see com.binaryedu.business.model.impl.IAnsweredQuestion#setOptions(java.util.ArrayList)
	 */
	/* (non-Javadoc)
	 * @see com.binaryedu.business.model.impl.IAnsweredQuestion#setOptions(java.util.ArrayList)
	 */
	public void setOptions(ArrayList<String> options)
	{
		this.options = options;
	}

	/* (non-Javadoc)
	 * @see com.binaryedu.business.model.impl.IAnsweredQuestion#getCorrectOption()
	 */
	/* (non-Javadoc)
	 * @see com.binaryedu.business.model.impl.IAnsweredQuestion#getCorrectOption()
	 */
	public int getCorrectOption()
	{
		return correctOption;
	}

	/* (non-Javadoc)
	 * @see com.binaryedu.business.model.impl.IAnsweredQuestion#setCorrectOption(int)
	 */
	/* (non-Javadoc)
	 * @see com.binaryedu.business.model.impl.IAnsweredQuestion#setCorrectOption(int)
	 */
	public void setCorrectOption(int correctOption)
	{
		this.correctOption = correctOption;
	}

	/* (non-Javadoc)
	 * @see com.binaryedu.business.model.impl.IAnsweredQuestion#getSection()
	 */
	/* (non-Javadoc)
	 * @see com.binaryedu.business.model.impl.IAnsweredQuestion#getSection()
	 */
	public String getSection()
	{
		return section;
	}

	/* (non-Javadoc)
	 * @see com.binaryedu.business.model.impl.IAnsweredQuestion#setSection(java.lang.String)
	 */
	/* (non-Javadoc)
	 * @see com.binaryedu.business.model.impl.IAnsweredQuestion#setSection(java.lang.String)
	 */
	public void setSection(String section)
	{
		this.section = section;
	}

	/* (non-Javadoc)
	 * @see com.binaryedu.business.model.impl.IAnsweredQuestion#getUserOption()
	 */
	public int getUserOption()
	{
		return userOption;
	}

	/* (non-Javadoc)
	 * @see com.binaryedu.business.model.impl.IAnsweredQuestion#setUserOption(int)
	 */
	public void setUserOption(int userOption)
	{
		this.userOption = userOption;
	}

	/**
	 * @return the solution
	 */
	public String getSolution() {
		return solution;
	}

	/**
	 * @param solution the solution to set
	 */
	public void setSolution(String solution) {
		this.solution = solution;
	}
}
