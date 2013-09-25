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

import com.binaryedu.business.model.IUser;
import com.binaryedu.business.service.ServiceManager;
import com.binaryedu.exceptions.BinaryException;
import com.binaryedu.util.SessionUtil;
import com.binaryedu.web.formobjects.PasswordFormObject;

public class EditPasswordController extends SimpleFormController
{
	/** Logger for this class and subclasses. */
	protected final Log logger = LogFactory.getLog(this.getClass());
	
	public ModelAndView onSubmit(HttpServletRequest request, HttpServletResponse response, Object command, BindException errors)
	{
		if(!SessionUtil.isUserLoggedIn(request.getSession()))
		{
			return new ModelAndView(new RedirectView("login.htm?fwd=editPassword.htm"));
			
		}
		
		PasswordFormObject passwordForm = (PasswordFormObject) command;
		
		IUser user = SessionUtil.getUserFromSession(request.getSession());
		
		try
		{
			ServiceManager.getAccountService().changePassword(user, passwordForm.getOldPassword(), passwordForm.getNewPassword());
		}
		catch (BinaryException e)
		{
			errors.rejectValue("oldPassword", "error.invalid-password");
			try
			{
				return showForm(request, response, errors);
			}
			catch (Exception e1)
			{
				// ignored
			}
		}
		
		return new ModelAndView(new RedirectView(getSuccessView()), "msg", "Your new password has been saved.");
	}
	
	protected Object formBackingObject(HttpServletRequest request) throws ServletException
	{
		return new PasswordFormObject();
	}

}
