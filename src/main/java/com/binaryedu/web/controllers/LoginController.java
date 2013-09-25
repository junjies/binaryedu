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
import com.binaryedu.business.transferobject.LoginTO;
import com.binaryedu.exceptions.BinaryException;
import com.binaryedu.exceptions.BinaryExceptionCodes;
import com.binaryedu.util.SessionUtil;
import com.binaryedu.web.formobjects.LoginFormObject;

public class LoginController extends SimpleFormController
{
	/** Logger for this class and subclasses. */
	protected final Log logger = LogFactory.getLog(this.getClass());
	
	public ModelAndView onSubmit(HttpServletRequest request, HttpServletResponse response, Object command, BindException errors)
	{
		LoginFormObject loginForm = (LoginFormObject) command;
		IUser user = null;
		
		LoginTO loginTO = new LoginTO();
		
		loginTO.setEmail(loginForm.getEmail());
		loginTO.setPassword(loginForm.getPassword());
		
		try
		{
			user = ServiceManager.getAccountService().login(loginTO);
		}
		catch (BinaryException e)
		{
			if(e.getExceptionCode() == BinaryExceptionCodes.USER_DOES_NOT_EXIST)
			{
				errors.rejectValue("email", "error.user-doesnot-exist");
			}
			else if(e.getExceptionCode() == BinaryExceptionCodes.USER_NOT_ACTIVE)
			{
				return new ModelAndView(new RedirectView("resendVerificationEmail.htm"));
			}
			else if(e.getExceptionCode() == BinaryExceptionCodes.PASSWORD_INCORRECT)
			{
				errors.rejectValue("password", "error.invalid-password");
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
		
		if(user != null)
		{
			SessionUtil.storeUserInSession(request.getSession(), user);
		}
		
		System.out.println("fwd = " + loginForm.getFwd());
		if(loginForm.getFwd() != null && !"".equals(loginForm.getFwd()))
		{
			return new ModelAndView(new RedirectView(loginForm.getFwd()));
		}
		else
		{
			return new ModelAndView(new RedirectView(getSuccessView()));
		}
		
	}
	
	protected Object formBackingObject(HttpServletRequest request) throws ServletException
	{
		LoginFormObject obj = new LoginFormObject();
		if(request.getParameter("fwd") != null)
		{
			obj.setFwd(request.getParameter("fwd"));
		}
		return obj;
	}

}
