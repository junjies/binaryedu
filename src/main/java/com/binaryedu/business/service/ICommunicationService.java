package com.binaryedu.business.service;

import com.binaryedu.business.transferobject.ResetPasswordTO;
import com.binaryedu.business.transferobject.UserAccountTO;
import com.binaryedu.exceptions.BinaryException;

/**
 * 
 * @author Param
 * 
 */
public interface ICommunicationService
{
	void sendVerificationEmail(UserAccountTO newUserTO) throws BinaryException;

	void sendResetPasswordEmail(ResetPasswordTO resetPasswordTO) throws BinaryException;
	
	void sendNewPassword(String email, String password) throws BinaryException;
}
