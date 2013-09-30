package com.binaryedu.test.ui.server;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import com.binaryedu.business.model.ITestResult;
import com.binaryedu.business.model.ITest;
import com.binaryedu.business.model.IUser;
import com.binaryedu.business.model.impl.TestResult;
import com.binaryedu.business.service.ServiceManager;
import com.binaryedu.test.ui.client.BETestAppException;
import com.binaryedu.test.ui.client.TestService;
import com.binaryedu.util.SessionUtil;
import com.google.gwt.user.server.rpc.RemoteServiceServlet;

/**
 * The server side implementation of the RPC service.
 */
public class TestServiceImpl extends RemoteServiceServlet implements TestService
{
	private final static Logger logger = LoggerFactory.getLogger(TestServiceImpl.class);
	
	/* (non-Javadoc)
	 * @see com.binaryedu.test.ui.client.TestService#getTestXML(java.lang.String)
	 */
	@Override
	public String getTestXML(String testID)
	{
//		String xml = "";
//		try
//		{
//			// Open the file that is the first
//			// command line parameter
//			FileInputStream fstream = new FileInputStream("/Users/parambir.singh/Downloads/Test15/CAT_Free_Test_07.xml");
//			// Get the object of DataInputStream
//			DataInputStream in = new DataInputStream(fstream);
//			BufferedReader br = new BufferedReader(new InputStreamReader(in));
//			String strLine;
//			// Read File Line By Line
//			while ((strLine = br.readLine()) != null)
//			{
//				// Print the content on the console
//				xml += strLine;
//			}
//			// Close the input stream
//			in.close();
//		}
//		catch (Exception e)
//		{
//			// Catch exception if any
//			System.err.println("Error: " + e.getMessage());
//		}
//		logger.error("XML: \n" + xml);
//		return xml;
		
		ITest test = ServiceManager.getTestService().getTestByID(Long.parseLong(testID));
		logger.info("Test: \n" + test);
		return test.getXmlText();
	}

	/* (non-Javadoc)
	 * @see com.binaryedu.test.ui.client.TestService#submitAnswersXML(java.lang.String)
	 */
	@Override
	public void submitAnswersXML(String userID, String testID, String answersXML, int numQuestions, int numAttemptedQuestions, int numCorrectAnswers) throws BETestAppException
	{
		if(!SessionUtil.isUserLoggedIn(getThreadLocalRequest().getSession()))
		{
			throw new BETestAppException("You aren't logged into the web site. Please log in before saving test results.");
		}
		
		ITest test = ServiceManager.getTestService().getTestByID(Long.parseLong(testID));
		IUser user = SessionUtil.getUserFromSession(getThreadLocalRequest().getSession());
		
		if(user.getId() != Long.parseLong(userID))
		{
			throw new BETestAppException("A different user is logged into the web site. Please log in before saving test results.");
		}
		
		ITestResult answeredTest = new TestResult();
		answeredTest.setUser(user);
		answeredTest.setTest(test);
		answeredTest.setDateCompleted(new Date());
		answeredTest.setNumQuestions(numQuestions);
		answeredTest.setNumAttemptedQuestions(numAttemptedQuestions);
		answeredTest.setNumCorrectAnswers(numCorrectAnswers);
		answeredTest.setPercentage(numCorrectAnswers * 100.0f / numQuestions);
		answeredTest.setAnswerXML(answersXML);
		
		ServiceManager.getTestService().storeTestResults(answeredTest);
	}
}
