/**
 * 
 */
package com.binaryedu.business.service;

import java.util.List;

import com.binaryedu.business.model.IAnsweredTest;
import com.binaryedu.business.model.ITestResult;
import com.binaryedu.business.model.ITest;
import com.binaryedu.business.model.IUser;

/**
 * @author param
 * 
 */
public interface ITestService
{
	List<ITest> getAllTests(String type);

	ITest getTestByID(long id);

	void storeTestResults(ITestResult answeredTest);
	
	List<ITestResult> getUserAnsweredTests(IUser user);
	
	IAnsweredTest getDetailedResult(IUser user, long resultID);
}
