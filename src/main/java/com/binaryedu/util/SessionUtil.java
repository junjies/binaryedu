package com.binaryedu.util;

import javax.servlet.http.HttpSession;

import com.binaryedu.business.model.IUser;

public class SessionUtil
{
	public static void storeUserInSession(HttpSession session, IUser user)
	{
		if(user != null)
		{
			session.setAttribute("user", user);
		}
	}
	
	public static void deleteUserFromSession(HttpSession session)
	{
		session.setAttribute("user", null);
	}
	
	public static IUser getUserFromSession(HttpSession session)
	{
		return (IUser)session.getAttribute("user");
	}
	
	public static boolean isUserLoggedIn(HttpSession session)
	{
		return (session.getAttribute("user") != null);
	}
}
