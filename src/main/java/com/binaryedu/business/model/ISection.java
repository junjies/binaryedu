/**
 * 
 */
package com.binaryedu.business.model;

import java.util.List;

/**
 * @author param
 * 
 */
public interface ISection
{
	/**
	 * @return the id
	 */
	public int getId();

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(int id);

	/**
	 * @return the name
	 */
	public String getName();

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name);

	/**
	 * @return the message
	 */
	public String getMessage();

	/**
	 * @param message
	 *            the message to set
	 */
	public void setMessage(String message);

	/**
	 * @return the questions
	 */
	public List<IQuestion> getQuestions();

	/**
	 * @param questions
	 *            the questions to set
	 */
	public void setQuestions(List<IQuestion> questions);

	/**
	 * Returns the no. of questions in the section
	 * 
	 * @return
	 */
	public int getNumQuestions();

	/**
	 * Returns the total marks of the section
	 * 
	 * @return
	 */
	public int getMarks();

}
