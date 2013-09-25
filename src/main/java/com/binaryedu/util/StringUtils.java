package com.binaryedu.util;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.commons.codec.digest.DigestUtils;

public class StringUtils
{
	public static boolean isNullOrBlankString(String str)
	{
		if ((str == null) || ("".equals(str.trim())))
		{
			return true;
		}
		return false;
	}

	public static boolean isValidEmail(String str)
	{
		Pattern p = Pattern.compile(".+@.+\\.[a-z]+");
		Matcher m = p.matcher(str);
		boolean matchFound = m.matches();

		return matchFound;
	}

	public static String getMD5String(String data, String salt)
	{
		// salt is email, so get only the part before '@'
		salt = salt.substring(0, salt.indexOf("@"));
		
		// add salt to the string
		data = data + salt;
		
		return	DigestUtils.md5Hex(data);

	}
}
