package com.binaryedu.test.ui.client;

import java.io.Serializable;

public class BETestAppException extends Exception implements Serializable
{
	private static final long serialVersionUID = -999037309577401473L;
	
	private String msg;
	
	public BETestAppException()
	{
		super();
	}
	
	public BETestAppException(String msg)
	{
		super(msg);
		this.msg = msg;
	}

	public String getMessage()
	{
		return msg;
	}

	public void setMessage(String msg)
	{
		this.msg = msg;
	}
	
}
