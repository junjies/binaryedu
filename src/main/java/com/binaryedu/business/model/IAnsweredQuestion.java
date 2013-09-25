package com.binaryedu.business.model;

import java.util.ArrayList;

public interface IAnsweredQuestion
{

	/* (non-Javadoc)
	 * @see com.binaryedu.business.model.impl.IAnsweredQuestion#getQuestionNumber()
	 */
	public abstract int getQuestionNumber();

	/* (non-Javadoc)
	 * @see com.binaryedu.business.model.impl.IAnsweredQuestion#setQuestionNumber(int)
	 */
	public abstract void setQuestionNumber(int questionNumber);

	/* (non-Javadoc)
	 * @see com.binaryedu.business.model.impl.IAnsweredQuestion#getDirections()
	 */
	public abstract String getDirections();

	/* (non-Javadoc)
	 * @see com.binaryedu.business.model.impl.IAnsweredQuestion#setDirections(java.lang.String)
	 */
	public abstract void setDirections(String directions);

	/* (non-Javadoc)
	 * @see com.binaryedu.business.model.impl.IAnsweredQuestion#getQuestionText()
	 */
	public abstract String getQuestionText();

	/* (non-Javadoc)
	 * @see com.binaryedu.business.model.impl.IAnsweredQuestion#setQuestionText(java.lang.String)
	 */
	public abstract void setQuestionText(String questionText);

	/* (non-Javadoc)
	 * @see com.binaryedu.business.model.impl.IAnsweredQuestion#getOptions()
	 */
	public abstract ArrayList<String> getOptions();

	/* (non-Javadoc)
	 * @see com.binaryedu.business.model.impl.IAnsweredQuestion#setOptions(java.util.ArrayList)
	 */
	public abstract void setOptions(ArrayList<String> options);

	/* (non-Javadoc)
	 * @see com.binaryedu.business.model.impl.IAnsweredQuestion#getCorrectOption()
	 */
	public abstract int getCorrectOption();

	/* (non-Javadoc)
	 * @see com.binaryedu.business.model.impl.IAnsweredQuestion#setCorrectOption(int)
	 */
	public abstract void setCorrectOption(int correctOption);

	/* (non-Javadoc)
	 * @see com.binaryedu.business.model.impl.IAnsweredQuestion#getSection()
	 */
	public abstract String getSection();

	/* (non-Javadoc)
	 * @see com.binaryedu.business.model.impl.IAnsweredQuestion#setSection(java.lang.String)
	 */
	public abstract void setSection(String section);

	/**
	 * @return the userOption
	 */
	public abstract int getUserOption();

	/**
	 * @param userOption the userOption to set
	 */
	public abstract void setUserOption(int userOption);
	
	/**
	 * @return the solution
	 */
	public String getSolution();

	/**
	 * @param solution the solution to set
	 */
	public void setSolution(String solution);

}