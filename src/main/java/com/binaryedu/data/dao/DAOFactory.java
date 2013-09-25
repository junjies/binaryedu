package com.binaryedu.data.dao;

public class DAOFactory
{
	public static IAccountDAO getAccountDAO()
	{
		return new AccountDAO();
	}

	public static ITestDAO getTestDAO()
	{
		return new TestDAO();
	}

	public static IUserDAO getUserDAO()
	{
		return new UserDAO();
	}
}
