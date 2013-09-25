package com.binaryedu.business.model;

import java.util.List;


public interface IAnsweredSection
{

	public abstract List<IAnsweredQuestion> getQuestions();

	public abstract void setQuestions(List<IAnsweredQuestion> questions);

	/**
	 * @return the name
	 */
	public abstract String getName();

	/**
	 * @param name the name to set
	 */
	public abstract void setName(String name);

}