package com.binaryedu.business.model.impl;

import java.util.List;

import com.binaryedu.business.model.IOption;
import com.binaryedu.business.model.IQuestion;
import com.binaryedu.business.model.ISubject;

/**
 * 
 * @author param
 */

public class Question implements IQuestion
{
	int id;
	String questionXml;
	List<IOption> options;
	int marks;
	int negativeMarks;
	int duration;
	List<ISubject> subjects;
	String info;
	
	/**
	 * @return the id
	 */
	public int getId()
	{
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id)
	{
		this.id = id;
	}
	/**
	 * @return the questionXml
	 */
	public String getQuestionXml()
	{
		return questionXml;
	}
	/**
	 * @param questionXml the questionXml to set
	 */
	public void setQuestionXml(String questionXml)
	{
		this.questionXml = questionXml;
	}
	/**
	 * @return the options
	 */
	public List<IOption> getOptions()
	{
		return options;
	}
	/**
	 * @param options the options to set
	 */
	public void setOptions(List<IOption> options)
	{
		this.options = options;
	}
	/**
	 * @return the marks
	 */
	public int getMarks()
	{
		return marks;
	}
	/**
	 * @param marks the marks to set
	 */
	public void setMarks(int marks)
	{
		this.marks = marks;
	}
	/**
	 * @return the negativeMarks
	 */
	public int getNegativeMarks()
	{
		return negativeMarks;
	}
	/**
	 * @param negativeMarks the negativeMarks to set
	 */
	public void setNegativeMarks(int negativeMarks)
	{
		this.negativeMarks = negativeMarks;
	}
	/**
	 * @return the duration
	 */
	public int getDuration()
	{
		return duration;
	}
	/**
	 * @param duration the duration to set
	 */
	public void setDuration(int duration)
	{
		this.duration = duration;
	}
	/**
	 * @return the subjects
	 */
	public List<ISubject> getSubjects()
	{
		return subjects;
	}
	/**
	 * @param subjects the subjects to set
	 */
	public void setSubjects(List<ISubject> subjects)
	{
		this.subjects = subjects;
	}
	/**
	 * @return the info
	 */
	public String getInfo()
	{
		return info;
	}
	/**
	 * @param info the info to set
	 */
	public void setInfo(String info)
	{
		this.info = info;
	}
}
