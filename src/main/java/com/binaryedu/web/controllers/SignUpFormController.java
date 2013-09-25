package com.binaryedu.web.controllers;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.validation.BindException;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.SimpleFormController;
import org.springframework.web.servlet.view.RedirectView;

import com.binaryedu.business.service.ServiceManager;
import com.binaryedu.business.transferobject.UserAccountTO;
import com.binaryedu.exceptions.BinaryException;
import com.binaryedu.exceptions.BinaryExceptionCodes;
import com.binaryedu.web.formobjects.SignUpFormObject;

public class SignUpFormController extends SimpleFormController
{
	/** Logger for this class and subclasses. */
	protected final Log logger = LogFactory.getLog(this.getClass());
	
	public ModelAndView onSubmit(HttpServletRequest request, HttpServletResponse response, Object command, BindException errors)
	{
		SignUpFormObject signUpForm = (SignUpFormObject)command;
		
		UserAccountTO newUserTO = new UserAccountTO();
		newUserTO.setEmail(signUpForm.getEmail());
		newUserTO.setPassword(signUpForm.getPassword());
		newUserTO.setFullName(signUpForm.getName());
		try
		{
			ServiceManager.getAccountService().addAccount(newUserTO);
		}
		catch (BinaryException e)
		{
			if(e.getExceptionCode() == BinaryExceptionCodes.USER_ALREADY_EXISTS)
			{
				logger.error("User already exists, going back to " + getFormView());
				errors.rejectValue("email", "error.user-already-exists", null, "A user with this email already exists!");
			}
			else if(e.getExceptionCode() == BinaryExceptionCodes.UNABLE_TO_SEND_EMAIL)
			{
				logger.error("Unable to send email, returning to " + getSuccessView());
				return new ModelAndView(new RedirectView(getSuccessView()), "failedEmail", "true");
			}
			else
			{
				logger.error("Unknown error, going back to " + getFormView());
				errors.rejectValue("email", "error.user-already-exists", null, "A user with this email already exists!");
			}
			
			try
			{
				return showForm(request, response, errors);
			}
			catch (Exception e1)
			{
				// ignored
			}
		}
		
		logger.info("Account added, going to " + getSuccessView());
		return new ModelAndView(new RedirectView(getSuccessView()));
	}
	
	protected Object formBackingObject(HttpServletRequest request) throws ServletException
	{
		return new SignUpFormObject();
	}

}
