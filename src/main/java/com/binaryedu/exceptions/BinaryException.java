/**
 * 
 */
package com.binaryedu.exceptions;

/**
 * @author Param
 *
 */
public class BinaryException extends Exception
{
	private BinaryExceptionCodes exceptionCode;
	
	public BinaryException(BinaryExceptionCodes exceptionCode)
	{
		super();
		this.exceptionCode = exceptionCode;
	}

	public BinaryExceptionCodes getExceptionCode()
	{
		return exceptionCode;
	}
}
