package com.binaryedu.web.validators;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.binaryedu.util.StringUtils;
import com.binaryedu.web.formobjects.PasswordFormObject;

public class EditPasswordValidator implements Validator
{
	/** Logger for this class and subclasses. */
	protected final Log logger = LogFactory.getLog(this.getClass());
	
	private final int MIN_PASSWORD_LENGTH = 6;
	private final int MAX_PASSWORD_LENGTH = 32;
	
	public boolean supports(Class clazz)
	{
		return PasswordFormObject.class.equals(clazz);
	}
	
	public void validate(Object object, Errors errors)
	{
		PasswordFormObject form = (PasswordFormObject) object;
		if(form == null)
		{
			errors.rejectValue("oldPassword", "error.not-specified", new Object[] {"Password"}, "Password is required!");
		}
		else
		{
			if(StringUtils.isNullOrBlankString(form.getOldPassword()))
			{
				errors.rejectValue("oldPassword", "error.not-specified", new Object[] {"Password"}, "Password is required!");
			}
			
			
			if(StringUtils.isNullOrBlankString(form.getNewPassword()))
			{
				errors.rejectValue("newPassword", "error.not-specified", new Object[] {"New Password"}, "New Password is required!");
			}
			else if((form.getNewPassword().length() < MIN_PASSWORD_LENGTH) || form.getNewPassword().length() > MAX_PASSWORD_LENGTH)
			{
				errors.rejectValue("newPassword", "error.length-not-within-range", 
						new Object[] {"New Password", String.valueOf(MIN_PASSWORD_LENGTH), String.valueOf(MAX_PASSWORD_LENGTH)}, 
						"Not within range!");
			}
			else if(!form.getNewPassword().equals(form.getConfirmNewPassword()))
			{
				errors.rejectValue("confirmNewPassword", "error.does-not-match", new Object[] {"Passwords"}, "Passwords don't match!");
			}
		}
	}
}
