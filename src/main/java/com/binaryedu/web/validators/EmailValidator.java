package com.binaryedu.web.validators;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.binaryedu.util.StringUtils;
import com.binaryedu.web.formobjects.EmailFormObject;

public class EmailValidator implements Validator
{
	/** Logger for this class and subclasses. */
	protected final Log logger = LogFactory.getLog(this.getClass());
	
	public boolean supports(Class clazz)
	{
		return EmailFormObject.class.equals(clazz);
	}
	
	public void validate(Object object, Errors errors)
	{
		EmailFormObject form = (EmailFormObject) object;
		if(form == null)
		{
			errors.rejectValue("email", "error.not-specified");
		}
		else
		{
			// validate email
			if(StringUtils.isNullOrBlankString(form.getEmail()))
			{
				errors.rejectValue("email", "error.not-specified", new Object[] {"Email"}, "Email is required!");
			}
			else if(!StringUtils.isValidEmail(form.getEmail()))
			{
				errors.rejectValue("email", "error.invalid-email", null, "Invalid email address!");
			}
		}
	}
}
