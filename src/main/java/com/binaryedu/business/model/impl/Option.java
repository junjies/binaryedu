package com.binaryedu.business.model.impl;

import com.binaryedu.business.model.IOption;

/**
 * 
 * @author param
 */
public class Option implements IOption
{
	String optionString;
	boolean correct;
	
	/**
	 * @return the optionString
	 */
	public String getOptionString()
	{
		return optionString;
	}
	/**
	 * @param optionString the optionString to set
	 */
	public void setOptionString(String optionString)
	{
		this.optionString = optionString;
	}
	/**
	 * @return the correct
	 */
	public boolean isCorrect()
	{
		return correct;
	}
	/**
	 * @param correct the correct to set
	 */
	public void setCorrect(boolean correct)
	{
		this.correct = correct;
	}
}
