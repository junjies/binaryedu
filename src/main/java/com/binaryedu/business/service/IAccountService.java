package com.binaryedu.business.service;

import com.binaryedu.business.model.IUser;
import com.binaryedu.business.transferobject.LoginTO;
import com.binaryedu.business.transferobject.ResetPasswordTO;
import com.binaryedu.business.transferobject.UserAccountTO;
import com.binaryedu.business.transferobject.VerifyAccountTO;
import com.binaryedu.exceptions.BinaryException;

/**
 * 
 * @author param
 * 
 */
public interface IAccountService
{
	IUser login(LoginTO loginTO) throws BinaryException;

	void addAccount(UserAccountTO newUserTO) throws BinaryException;

	void verifyAccount(VerifyAccountTO verifyAccountTO) throws BinaryException;

	void resendVerificationEmail(String email) throws BinaryException;
	
	void sendResetPasswordEmail(String email) throws BinaryException;

	void changePassword(IUser user, String oldPassword, String newPassword) throws BinaryException;

	boolean accountExists(String email);
	
	void resetPassword(ResetPasswordTO resetPasswordTO) throws BinaryException;

}
