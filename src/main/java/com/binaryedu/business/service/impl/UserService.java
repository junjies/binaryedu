package com.binaryedu.business.service.impl;

import com.binaryedu.business.model.IUser;
import com.binaryedu.business.service.IUserService;
import com.binaryedu.business.transferobject.LoginTO;
import com.binaryedu.data.dao.DAOFactory;

public class UserService implements IUserService
{
	private static final IUserService INSTANCE = new UserService();

	private UserService()
	{

	}

	public static IUserService getInstance()
	{
		return INSTANCE;
	}

	@Override
	public IUser getUserByEmail(String email)
	{
		return DAOFactory.getUserDAO().getUserByEmail(email);
	}

	@Override
	public IUser getUser(LoginTO data)
	{
		return getUserByEmail(data.getEmail());
	}

	@Override
	public void updateUser(IUser user)
	{
		DAOFactory.getUserDAO().updateUser(user);

	}
}
