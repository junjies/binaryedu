/**
 *
 */
package com.binaryedu.business.model;

import java.util.Calendar;

/**
 * @author param
 * 
 */
public interface IUser
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
	 * @return the email
	 */
	public String getEmail();

	/**
	 * @param email
	 *            the email to set
	 */
	public void setEmail(String email);

	/**
	 * @return the phone
	 */
	public String getPhone();

	/**
	 * @param phone
	 *            the phone to set
	 */
	public void setPhone(String phone);

	/**
	 * @return the gender
	 */
	public String getGender();

	/**
	 * @param gender
	 *            the gender to set
	 */
	public void setGender(String gender);

	/**
	 * @return the dateOfBirth
	 */
	public Calendar getDateOfBirth();

	/**
	 * @param dateOfBirth
	 *            the dateOfBirth to set
	 */
	public void setDateOfBirth(Calendar dateOfBirth);
}
