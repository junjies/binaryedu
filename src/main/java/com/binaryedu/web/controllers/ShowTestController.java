package com.binaryedu.web.controllers;

import java.io.IOException;
import java.util.HashMap;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.SimpleFormController;
import org.springframework.web.servlet.view.RedirectView;

import com.binaryedu.business.model.ITest;
import com.binaryedu.business.service.ServiceManager;
import com.binaryedu.util.SessionUtil;

public class ShowTestController extends SimpleFormController
{
	/** Logger for this class and subclasses. */
	protected final Log logger = LogFactory.getLog(this.getClass());
	
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		logger.info("Returning show test View");
		
		if(!SessionUtil.isUserLoggedIn(request.getSession()))
		{
			return new ModelAndView(new RedirectView("login.htm?fwd=showTest.htm?" + request.getQueryString()));
			
		}
		
		long testID = Long.parseLong(request.getParameter("testID"));
		ITest test = ServiceManager.getTestService().getTestByID(testID);
		
		HashMap<String, Object> model = new HashMap<String, Object>();
		model.put("test", test);
		return new ModelAndView("showTest", "model", model);
	}
}
