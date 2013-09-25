/**
 * 
 */
package com.binaryedu.data.dao;

import com.binaryedu.business.transferobject.ResetPasswordTO;
import com.binaryedu.business.transferobject.UserAccountTO;
import com.binaryedu.exceptions.BinaryException;

/**
 * @author parsingh
 * 
 */
public interface IAccountDAO
{
	void addAccount(UserAccountTO newUserTO) throws BinaryException;

	UserAccountTO getAccountByEmail(String email);

	void updateAccount(UserAccountTO newUserTO);
	
	public void addResetPasswordRow(ResetPasswordTO resetPasswordTO);
	public void deleteResetPasswordRow(ResetPasswordTO resetPasswordTO);
	public ResetPasswordTO getResetPasswordRow(String email);
}
