package com.binaryedu.web.controllers;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class LogoutController implements Controller
{
	protected final Log logger = LogFactory.getLog(this.getClass());

	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		logger.info("Returning Logout View");

		// get current session, and don't create one if it doesn't exist
		HttpSession theSession = request.getSession(false);

		// destroy the session
		if (theSession != null)
		{
			synchronized (theSession)
			{
				theSession.invalidate();
			}
		}

		return new ModelAndView("logoutSuccess");
	}

}
