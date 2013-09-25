package com.binaryedu.web.controllers;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;
import org.springframework.web.servlet.view.RedirectView;

import com.binaryedu.business.model.IUser;
import com.binaryedu.util.SessionUtil;

public class ProfileController implements Controller
{
	protected final Log logger = LogFactory.getLog(this.getClass());
	
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		logger.info("Returning Profile View");
		
		if(SessionUtil.isUserLoggedIn(request.getSession()))
		{
			IUser user = SessionUtil.getUserFromSession(request.getSession());
			return new ModelAndView("profile", "user", user);
		}
		else
		{
			return new ModelAndView(new RedirectView("login.htm?fwd=profile.htm"));
		}
	}
	
}
