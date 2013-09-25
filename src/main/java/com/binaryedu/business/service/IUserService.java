package com.binaryedu.business.service;

import com.binaryedu.business.model.IUser;
import com.binaryedu.business.transferobject.LoginTO;

public interface IUserService
{
	IUser getUser(LoginTO data);

	IUser getUserByEmail(String email);

	void updateUser(IUser user);
}