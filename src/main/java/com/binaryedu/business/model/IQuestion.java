/**
 * 
 */
package com.binaryedu.business.model;

import java.util.List;

/**
 * @author param
 * 
 */
public interface IQuestion
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
	 * @return the questionXml
	 */
	public String getQuestionXml();

	/**
	 * @param questionXml
	 *            the questionXml to set
	 */
	public void setQuestionXml(String questionXml);

	/**
	 * @return the options
	 */
	public List<IOption> getOptions();

	/**
	 * @param options
	 *            the options to set
	 */
	public void setOptions(List<IOption> options);

	/**
	 * @return the marks
	 */
	public int getMarks();

	/**
	 * @param marks
	 *            the marks to set
	 */
	public void setMarks(int marks);

	/**
	 * @return the negativeMarks
	 */
	public int getNegativeMarks();

	/**
	 * @param negativeMarks
	 *            the negativeMarks to set
	 */
	public void setNegativeMarks(int negativeMarks);

	/**
	 * @return the duration
	 */
	public int getDuration();

	/**
	 * @param duration
	 *            the duration to set
	 */
	public void setDuration(int duration);

	/**
	 * @return the subjects;
	 */
	public List<ISubject> getSubjects();

	/**
	 * @param subjects
	 *            the subjects to set
	 */
	public void setSubjects(List<ISubject> subjects);

	/**
	 * @return the info
	 */
	public String getInfo();

	/**
	 * @param info
	 *            the info to set
	 */
	public void setInfo(String info);
}
