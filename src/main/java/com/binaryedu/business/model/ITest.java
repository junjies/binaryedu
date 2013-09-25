package com.binaryedu.business.model;

import java.util.Calendar;
import java.util.List;

/**
 * @author param
 * 
 */
public interface ITest
{
	/**
	 * @return the id
	 */
	public long getId();

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(long id);

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
	 * @return the sections
	 */
	public List<ISection> getSections();

	/**
	 * @param sections
	 *            the sections to set
	 */
	public void setSections(List<ISection> sections);

	/**
	 * @return the subjects
	 */
	public List<ISubject> getSubjects();

	/**
	 * @param subjects
	 *            the subjects to set
	 */
	public void setSubjects(List<ISubject> subjects);

	/**
	 * @return the exam
	 */
	public List<IExam> getExam();

	/**
	 * @param exam
	 *            the exam to set
	 */
	public void setExam(List<IExam> exam);

	/**
	 * @return the available
	 */
	public boolean isAvailable();

	/**
	 * @param available
	 *            the available to set
	 */
	public void setAvailable(boolean available);

	/**
	 * @return the message
	 */
	public String getInstructions();

	/**
	 * @param message
	 *            the message to set
	 */
	public void setInstructions(String instructions);

	/**
	 * @return the creationDate
	 */
	public Calendar getCreationDate();

	/**
	 * @param creationDate
	 *            the creationDate to set
	 */
	public void setCreationDate(Calendar creationDate);

	/**
	 * Returns the no. of questions in the test
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

	/**
	 * Returns the XML containing test data
	 * 
	 * @return the xmlText
	 */
	public String getXmlText();

	/**
	 * Sets the XML containing test data
	 * 
	 * @param xmlText
	 *            the xmlText to set
	 */
	public void setXmlText(String xmlText);
	
	public long getDuration();
	
	public float getNegative();
	
	public String getType();

	public void setType(String type);
}
