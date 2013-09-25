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

import com.binaryedu.business.model.ITest;
import com.binaryedu.business.service.ServiceManager;
import com.binaryedu.util.SessionUtil;

public class TestsController implements Controller
{
	protected final Log logger = LogFactory.getLog(this.getClass());
	
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		logger.info("Returning Tests View");
		if(!SessionUtil.isUserLoggedIn(request.getSession()))
		{
			return new ModelAndView(new RedirectView("login.htm?fwd=tests.htm"));
			
		}
		
		String type = request.getParameter("type");
		if(type == null)
		{
			type = "QQ";
		}
		
		// user is logged in so get a list of tests
		List<ITest> list = ServiceManager.getTestService().getAllTests(type);
		
		HashMap<String, Object> model = new HashMap<String, Object>();
		model.put("testList", list);
		model.put("type", type);
		return new ModelAndView("tests", "model", model);
	}
	
}
