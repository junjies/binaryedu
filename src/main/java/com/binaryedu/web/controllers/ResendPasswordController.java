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
import com.binaryedu.exceptions.BinaryException;
import com.binaryedu.exceptions.BinaryExceptionCodes;
import com.binaryedu.web.formobjects.EmailFormObject;

public class ResendPasswordController extends SimpleFormController
{
	/** Logger for this class and subclasses. */
	protected final Log logger = LogFactory.getLog(this.getClass());
	
	public ModelAndView onSubmit(HttpServletRequest request, HttpServletResponse response, Object command, BindException errors)
	{
		EmailFormObject emailForm = (EmailFormObject) command;
		
		try
		{
			ServiceManager.getAccountService().sendResetPasswordEmail(emailForm.getEmail());
		}
		catch (BinaryException e)
		{
			if(e.getExceptionCode() == BinaryExceptionCodes.USER_DOES_NOT_EXIST)
			{
				errors.rejectValue("email", "error.user-doesnot-exist");
			}
			else if(e.getExceptionCode() == BinaryExceptionCodes.UNABLE_TO_SEND_EMAIL)
			{
				errors.rejectValue("email", "error.unable-to-send-email");
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
		
		
		return new ModelAndView(new RedirectView(getSuccessView()));
	}
	
	protected Object formBackingObject(HttpServletRequest request) throws ServletException
	{
		return new EmailFormObject();
	}

}
