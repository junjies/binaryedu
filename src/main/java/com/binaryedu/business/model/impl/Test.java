package com.binaryedu.business.model.impl;

import java.util.Calendar;
import java.util.List;

import com.binaryedu.business.model.IExam;
import com.binaryedu.business.model.ISection;
import com.binaryedu.business.model.ISubject;
import com.binaryedu.business.model.ITest;

/**
 * 
 * @author param
 */

public class Test implements ITest
{
	private long id;
	private String name;
	private List<ISection> sections;
	private List<ISubject> subjects;
	private List<IExam> exam;
	private boolean available;
	private String instructions;
	private Calendar creationDate;
	private String xmlText;
	private long duration;
	private float negative;
	private int numQuestions;
	private int marks;
	private String type;

	/**
	 * @return the id
	 */
	public long getId()
	{
		return id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(long id)
	{
		this.id = id;
	}

	/**
	 * @return the name
	 */
	public String getName()
	{
		return name;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name)
	{
		this.name = name;
	}

	/**
	 * @return the sections
	 */
	public List<ISection> getSections()
	{
		return sections;
	}

	/**
	 * @param sections
	 *            the sections to set
	 */
	public void setSections(List<ISection> sections)
	{
		this.sections = sections;
	}

	/**
	 * @return the subjects
	 */
	public List<ISubject> getSubjects()
	{
		return subjects;
	}

	/**
	 * @param subjects
	 *            the subjects to set
	 */
	public void setSubjects(List<ISubject> subjects)
	{
		this.subjects = subjects;
	}

	/**
	 * @return the exam
	 */
	public List<IExam> getExam()
	{
		return exam;
	}

	/**
	 * @param exam
	 *            the exam to set
	 */
	public void setExam(List<IExam> exam)
	{
		this.exam = exam;
	}

	/**
	 * @return the available
	 */
	public boolean isAvailable()
	{
		return available;
	}

	/**
	 * @param available
	 *            the available to set
	 */
	public void setAvailable(boolean available)
	{
		this.available = available;
	}
	/**
	 * @return the creationDate
	 */
	public Calendar getCreationDate()
	{
		return creationDate;
	}

	/**
	 * @param creationDate
	 *            the creationDate to set
	 */
	public void setCreationDate(Calendar creationDate)
	{
		this.creationDate = creationDate;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.binaryedu.business.model.ITest#getXmlText()
	 */
	public String getXmlText()
	{
		return xmlText;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.binaryedu.business.model.ITest#setXmlText()
	 */
	public void setXmlText(String xmlText)
	{
		this.xmlText = xmlText;
	}

	/**
	 * @return the duration
	 */
	public long getDuration()
	{
		return duration;
	}

	/**
	 * @param duration the duration to set
	 */
	public void setDuration(long duration)
	{
		this.duration = duration;
	}

	/**
	 * @return the negative
	 */
	public float getNegative()
	{
		return negative;
	}

	/**
	 * @param negative the negative to set
	 */
	public void setNegative(float negative)
	{
		this.negative = negative;
	}

	/**
	 * @return the numQuestions
	 */
	public int getNumQuestions()
	{
		return numQuestions;
	}

	/**
	 * @param numQuestions the numQuestions to set
	 */
	public void setNumQuestions(int numQuestions)
	{
		this.numQuestions = numQuestions;
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

	public String getInstructions()
	{
		return instructions;
	}

	public void setInstructions(String instructions)
	{
		this.instructions = instructions;
	}

	/**
	 * @return the type
	 */
	public String getType()
	{
		return type;
	}

	/**
	 * @param type the type to set
	 */
	public void setType(String type)
	{
		this.type = type;
	}

}
