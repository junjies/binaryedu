/**
 * 
 */
package com.binaryedu.data.dao;

import java.util.List;

import com.binaryedu.business.model.ITestResult;
import com.binaryedu.business.model.ITest;
import com.binaryedu.business.model.IUser;

/**
 * @author parsingh
 * 
 */
public interface ITestDAO
{
	List<ITest> listAllTests(String type);

	ITest getTestByID(long id);

	void storeAnsweredTest(ITestResult answeredTest);
	
	List<ITestResult> getUserAnsweredTests(IUser user);
	
	ITestResult getUserAnsweredTest(long resultID);
}
