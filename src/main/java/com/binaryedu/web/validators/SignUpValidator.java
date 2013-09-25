package com.binaryedu.web.validators;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.binaryedu.util.StringUtils;
import com.binaryedu.web.formobjects.SignUpFormObject;

public class SignUpValidator implements Validator
{
	/** Logger for this class and subclasses. */
	protected final Log logger = LogFactory.getLog(this.getClass());
	
	private final int MIN_PASSWORD_LENGTH = 6;
	private final int MAX_PASSWORD_LENGTH = 32;
	
	public boolean supports(Class clazz)
	{
		return SignUpFormObject.class.equals(clazz);
	}
	
	public void validate(Object object, Errors errors)
	{
		SignUpFormObject form = (SignUpFormObject) object;
		if(form == null)
		{
			errors.rejectValue("name", "error.not-specified", new Object[] {"Name"}, "Name is required!");
		}
		else
		{
			// validate name
			if(StringUtils.isNullOrBlankString(form.getName()))
			{
				errors.rejectValue("name", "error.not-specified", new Object[] {"Name"}, "Name is required!");
			}
			
//			validate email
			if(StringUtils.isNullOrBlankString(form.getEmail()))
			{
				errors.rejectValue("email", "error.not-specified", new Object[] {"Email"}, "Email is required!");
			}
			else if(!StringUtils.isValidEmail(form.getEmail()))
			{
				errors.rejectValue("email", "error.invalid-email", null, "Invalid email address!");
			}
			
			
			if(StringUtils.isNullOrBlankString(form.getConfirmEmail()))
			{
				errors.rejectValue("confirmEmail", "error.not-specified", new Object[] {"Confirm Email"}, "Confirm Email is required!");
			}
			else if(!StringUtils.isValidEmail(form.getConfirmEmail()))
			{
				errors.rejectValue("confirmEmail", "error.invalid-email", null, "Invalid email address!");
			}
			else if(!form.getEmail().equals(form.getConfirmEmail()))
			{
				errors.rejectValue("confirmEmail", "error.does-not-match", new Object[] {"Email addresses"}, "Email addresses don't match!");
			}
			
			
			if(StringUtils.isNullOrBlankString(form.getPassword()))
			{
				errors.rejectValue("password", "error.not-specified", new Object[] {"Password"}, "Password is required!");
			}
			else if((form.getPassword().length() < MIN_PASSWORD_LENGTH) || form.getPassword().length() > MAX_PASSWORD_LENGTH)
			{
				errors.rejectValue("password", "error.length-not-within-range", 
						new Object[] {"Password", String.valueOf(MIN_PASSWORD_LENGTH), String.valueOf(MAX_PASSWORD_LENGTH)}, 
						"Not within range!");
			}
			
			
			
			if(StringUtils.isNullOrBlankString(form.getConfirmPassword()))
			{
				errors.rejectValue("confirmPassword", "error.not-specified", new Object[] {"Confirm Password"}, "Confirm Password is required!");
			}
			else if((form.getConfirmPassword().length() < MIN_PASSWORD_LENGTH) || form.getConfirmPassword().length() > MAX_PASSWORD_LENGTH)
			{
				errors.rejectValue("confirmPassword", "error.length-not-within-range", 
						new Object[] {"Confirm Password", String.valueOf(MIN_PASSWORD_LENGTH), String.valueOf(MAX_PASSWORD_LENGTH)}, 
						"Not within range!");
			}
			else if(!form.getPassword().equals(form.getConfirmPassword()))
			{
				errors.rejectValue("confirmPassword", "error.does-not-match", new Object[] {"Passwords"}, "Passwords don't match!");
			}
		}
	}
}
