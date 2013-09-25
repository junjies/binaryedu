package com.binaryedu.web.validators;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.binaryedu.util.StringUtils;
import com.binaryedu.web.formobjects.ProfileFormObject;

public class EditProfileValidator implements Validator
{
	/** Logger for this class and subclasses. */
	protected final Log logger = LogFactory.getLog(this.getClass());
	
	public boolean supports(Class clazz)
	{
		return ProfileFormObject.class.equals(clazz);
	}
	
	public void validate(Object object, Errors errors)
	{
		ProfileFormObject form = (ProfileFormObject) object;
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
			
			/*if(StringUtils.isNullOrBlankString(form.getGender()))
			{
				errors.rejectValue("gender", "error.not-specified", new Object[] {"Gender"}, "Gender is required!");
			}
			
			if(StringUtils.isNullOrBlankString(form.getPhone()))
			{
				errors.rejectValue("phone", "error.not-specified", new Object[] {"Phone"}, "Phone is required!");
			}*/
		}
	}
}
