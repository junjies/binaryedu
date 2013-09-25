package com.binaryedu.web.controllers;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;
import org.springframework.web.servlet.view.RedirectView;

import com.binaryedu.business.model.ITestResult;
import com.binaryedu.business.model.IUser;
import com.binaryedu.business.service.ServiceManager;
import com.binaryedu.util.SessionUtil;

public class ResultsController implements Controller
{
	protected final Log logger = LogFactory.getLog(this.getClass());
	
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		logger.info("Returning Results View");
		if(!SessionUtil.isUserLoggedIn(request.getSession()))
		{
			return new ModelAndView(new RedirectView("login.htm?fwd=results.htm"));
			
		}
		
		// user is logged in so get a list of tests
		IUser user = SessionUtil.getUserFromSession(request.getSession());
		List<ITestResult> list = ServiceManager.getTestService().getUserAnsweredTests(user);
		
		HashMap<String, Object> model = new HashMap<String, Object>();
		model.put("testList", list);
		return new ModelAndView("results", "model", model);
	}
	
}
