/**
 * 
 */
package com.binaryedu.business.model;

/**
 * @author param
 * 
 */
public interface IOption
{
	/**
	 * @return the optionString
	 */
	public String getOptionString();

	/**
	 * @param optionString
	 *            the optionString to set
	 */
	public void setOptionString(String optionString);

	/**
	 * @return the correct
	 */
	public boolean isCorrect();

	/**
	 * @param correct
	 *            the correct to set
	 */
	public void setCorrect(boolean correct);
}
