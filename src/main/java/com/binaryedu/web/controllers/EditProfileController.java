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
import com.binaryedu.util.SessionUtil;
import com.binaryedu.web.formobjects.ProfileFormObject;

public class EditProfileController extends SimpleFormController
{
	/** Logger for this class and subclasses. */
	protected final Log logger = LogFactory.getLog(this.getClass());
	
	public ModelAndView onSubmit(HttpServletRequest request, HttpServletResponse response, Object command, BindException errors)
	{
		if(!SessionUtil.isUserLoggedIn(request.getSession()))
		{
			return new ModelAndView(new RedirectView("login.htm?fwd=editProfile.htm"));
			
		}
		
		ProfileFormObject profileForm = (ProfileFormObject) command;
		IUser user = SessionUtil.getUserFromSession(request.getSession());
		user.setName(profileForm.getName());
		user.setGender(profileForm.getGender());
		user.setPhone(profileForm.getPhone());
		
		ServiceManager.getUserService().updateUser(user);
		
		return new ModelAndView(new RedirectView(getSuccessView()), "msg", "Your profile has been updated.");
	}
	
	protected Object formBackingObject(HttpServletRequest request) throws ServletException
	{
		ProfileFormObject formObject =  new ProfileFormObject();
		IUser user = SessionUtil.getUserFromSession(request.getSession());
		formObject.setName(user.getName());
		formObject.setEmail(user.getEmail());
		formObject.setPhone(user.getPhone());
		formObject.setGender(user.getGender());
		formObject.setDateOfBirth(user.getDateOfBirth());
		return formObject;
	}

}
