package com.binaryedu.test.ui.client;

import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;

/**
 * The client side stub for the RPC service.
 */
@RemoteServiceRelativePath("getTest")
public interface TestService extends RemoteService
{
	/**
	 * Gets the Test XML for a particular test.
	 * 
	 * @param testID ID of the test for which we need the XML
	 * @return Test XML as a string
	 */
	String getTestXML(String testID);
	
	/**
	 * Submit the XML with user's answers.
	 * 
	 * @param answersXML XML containing user's XML
	 */
	public void submitAnswersXML(String userID, String testID, String answersXML, int numQuestions, int numAttemptedQuestions, int numCorrectAnswers) throws BETestAppException;
}
