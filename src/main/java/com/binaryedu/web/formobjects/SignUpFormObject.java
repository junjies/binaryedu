package com.binaryedu.web.formobjects;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class SignUpFormObject
{
	/** Logger for this class and subclasses. */
	protected final Log logger = LogFactory.getLog(this.getClass());
	
	private String name;
	private String email;
	private String confirmEmail;
	private String password;
	private String confirmPassword;
	
	public String getName()
	{
		return name;
	}
	
	public void setName(String name)
	{
		logger.info("name set to " + name);
		this.name = name;
	}
	
	public String getEmail()
	{
		return email;
	}
	
	public void setEmail(String email)
	{
		logger.info("email set to " + email);
		this.email = email;
	}
	
	public String getConfirmEmail()
	{
		return confirmEmail;
	}
	
	public void setConfirmEmail(String confirmEmail)
	{
		logger.info("confirmEmail set to " + confirmEmail);
		this.confirmEmail = confirmEmail;
	}
	
	public String getPassword()
	{
		return password;
	}
	
	public void setPassword(String password)
	{
		logger.info("password set to " + password);
		this.password = password;
	}
	
	public String getConfirmPassword()
	{
		return confirmPassword;
	}
	
	public void setConfirmPassword(String confirmPassword)
	{
		logger.info("confirmPassword set to " + confirmPassword);
		this.confirmPassword = confirmPassword;
	}
	
}
