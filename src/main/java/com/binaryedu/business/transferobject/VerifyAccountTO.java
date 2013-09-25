/**
 * 
 */
package com.binaryedu.business.transferobject;

/**
 * @author Param
 * 
 */
public class VerifyAccountTO
{
	private String email;
	private String activationKey;

	/**
	 * @return the email
	 */
	public String getEmail()
	{
		return email;
	}

	/**
	 * @param email
	 *            the email to set
	 */
	public void setEmail(String email)
	{
		this.email = email;
	}

	/**
	 * @return the activationKey
	 */
	public String getActivationKey()
	{
		return activationKey;
	}

	/**
	 * @param activationKey
	 *            the activationKey to set
	 */
	public void setActivationKey(String activationKey)
	{
		this.activationKey = activationKey;
	}
}
