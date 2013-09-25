package com.binaryedu.business.model.impl;

import com.binaryedu.business.model.ISubject;

/**
 * 
 * @author param
 */

public class Subject implements ISubject
{
	int id;
	String level1;
	String level2;
	String level3;
	String level4;
	String level5;

	/**
	 * @return the id
	 */
	public int getId()
	{
		return id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(int id)
	{
		this.id = id;
	}

	/**
	 * @return the level1
	 */
	public String getLevel1()
	{
		return level1;
	}

	/**
	 * @param level1
	 *            the level1 to set
	 */
	public void setLevel1(String level1)
	{
		this.level1 = level1;
	}

	/**
	 * @return the level2
	 */
	public String getLevel2()
	{
		return level2;
	}

	/**
	 * @param level2
	 *            the level2 to set
	 */
	public void setLevel2(String level2)
	{
		this.level2 = level2;
	}

	/**
	 * @return the level3
	 */
	public String getLevel3()
	{
		return level3;
	}

	/**
	 * @param level3
	 *            the level3 to set
	 */
	public void setLevel3(String level3)
	{
		this.level3 = level3;
	}

	/**
	 * @return the level4
	 */
	public String getLevel4()
	{
		return level4;
	}

	/**
	 * @param level4
	 *            the level4 to set
	 */
	public void setLevel4(String level4)
	{
		this.level4 = level4;
	}

	/**
	 * @return the level5
	 */
	public String getLevel5()
	{
		return level5;
	}

	/**
	 * @param level5
	 *            the level5 to set
	 */
	public void setLevel5(String level5)
	{
		this.level5 = level5;
	}

}
