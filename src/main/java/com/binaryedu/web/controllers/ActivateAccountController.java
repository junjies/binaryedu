package com.binaryedu.web.controllers;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.SimpleFormController;

import com.binaryedu.business.service.ServiceManager;
import com.binaryedu.business.transferobject.VerifyAccountTO;
import com.binaryedu.exceptions.BinaryException;
import com.binaryedu.exceptions.BinaryExceptionCodes;
import com.binaryedu.util.StringUtils;

public class ActivateAccountController extends SimpleFormController
{
	/** Logger for this class and subclasses. */
	protected final Log logger = LogFactory.getLog(this.getClass());
	
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		logger.info("Returning account activated View");
		String email = request.getParameter("email");
		
		if(StringUtils.isNullOrBlankString(email))
		{
			return new ModelAndView("accountActivated", "wrongUser", "true");
		}
		
		String key = request.getParameter("key");
		
		if(StringUtils.isNullOrBlankString(key))
		{
			return new ModelAndView("accountActivated", "wrongKey", "true");
		}
		
		VerifyAccountTO verifyAccountTO = new VerifyAccountTO();
		verifyAccountTO.setEmail(email);
		verifyAccountTO.setActivationKey(key);
		
		try
		{
			ServiceManager.getAccountService().verifyAccount(verifyAccountTO);
		}
		catch (BinaryException e)
		{
			if(e.getExceptionCode() == BinaryExceptionCodes.USER_DOES_NOT_EXIST)
			{
				return new ModelAndView("accountActivated", "wrongUser", "true");
			}
			
			else if(e.getExceptionCode() == BinaryExceptionCodes.ACTIVATION_KEY_INCORRECT)
			{
				return new ModelAndView("accountActivated", "wrongKey", "true");
			}
		}
		return new ModelAndView("accountActivated");
	}
}
