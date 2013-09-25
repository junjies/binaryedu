/**
 * 
 */
package com.binaryedu.data.dao;

import com.binaryedu.business.model.IUser;

/**
 * @author parsingh
 * 
 */
public interface IUserDAO
{
	IUser getUserByEmail(String email);

	void updateUser(IUser user);
}
