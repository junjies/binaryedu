package com.binaryedu.web.formobjects;

public class LoginFormObject
{
	private String email;
	private String password;
	private String fwd;

	public String getEmail()
	{
		return email;
	}

	public void setEmail(String email)
	{
		this.email = email;
	}

	public String getPassword()
	{
		return password;
	}

	public void setPassword(String password)
	{
		this.password = password;
	}

	/**
	 * @return the fwd
	 */
	public String getFwd()
	{
		return fwd;
	}

	/**
	 * @param fwd the fwd to set
	 */
	public void setFwd(String fwd)
	{
		this.fwd = fwd;
	}
}
