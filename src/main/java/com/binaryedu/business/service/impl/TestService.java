/**
 * 
 */
package com.binaryedu.business.service.impl;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import com.binaryedu.business.model.IAnsweredSection;
import com.binaryedu.business.model.IAnsweredTest;
import com.binaryedu.business.model.ITest;
import com.binaryedu.business.model.ITestResult;
import com.binaryedu.business.model.IUser;
import com.binaryedu.business.model.impl.AnsweredQuestion;
import com.binaryedu.business.model.impl.AnsweredTest;
import com.binaryedu.business.service.ITestService;
import com.binaryedu.data.dao.DAOFactory;

/**
 * @author parsingh
 * 
 */
public class TestService implements ITestService
{
	protected final Log logger = LogFactory.getLog(this.getClass());
	private static final ITestService INSTANCE = new TestService();

	private TestService()
	{

	}

	public static ITestService getInstance()
	{
		return INSTANCE;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.binaryedu.business.service.ITestService#getAllTests()
	 */
	@Override
	public List<ITest> getAllTests(String type)
	{
		return DAOFactory.getTestDAO().listAllTests(type);
	}

	@Override
	public ITest getTestByID(long id)
	{
		ITest test = DAOFactory.getTestDAO().getTestByID(id);
		logger.info("test: \n" + test);
		return test;
	}

	@Override
	public void storeTestResults(ITestResult answeredTest)
	{
		DAOFactory.getTestDAO().storeAnsweredTest(answeredTest);

	}

	@Override
	public List<ITestResult> getUserAnsweredTests(IUser user)
	{
		return DAOFactory.getTestDAO().getUserAnsweredTests(user);
	}

	@Override
	public IAnsweredTest getDetailedResult(IUser user, long resultID)
	{
		//TODO: check if this user has infact taken this test
		return createDetailedResult(DAOFactory.getTestDAO().getUserAnsweredTest(resultID));
	}
	
	private IAnsweredTest createDetailedResult(ITestResult result)
	{
		IAnsweredTest answeredTest = new AnsweredTest();
		answeredTest.setUser(result.getUser());
		answeredTest.setTest(result.getTest());
		answeredTest.setDateCompleted(result.getDateCompleted());
		answeredTest.setNumAttemptedQuestions(result.getNumAttemptedQuestions());
		answeredTest.setNumCorrectAnswers(result.getNumCorrectAnswers());
		answeredTest.setNumQuestions(result.getNumQuestions());
		answeredTest.setPercentage(result.getPercentage());
		
		// parse XML and populate sections and questions
		try
		{
			DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
			DocumentBuilder db = dbf.newDocumentBuilder();
			String testXML = result.getTest().getXmlText();
			Document testDoc = db.parse(new ByteArrayInputStream(testXML.getBytes("UTF-8")));
//			doc.getDocumentElement().normalize();
			NodeList nodeList = testDoc.getDocumentElement().getElementsByTagName("question");
			
			Document answerDoc = db.parse(new ByteArrayInputStream(result.getAnswerXML().getBytes("UTF-8")));
			NodeList answerNodeList = answerDoc.getDocumentElement().getElementsByTagName("userOption");
			
			for(int i = 0; i < nodeList.getLength(); i++)
			{
				Node node = nodeList.item(i);
				if(node.getNodeType() == Node.ELEMENT_NODE)
				{
					AnsweredQuestion aq = new AnsweredQuestion();
					Element element = (Element)node;
					
					// set question number
					aq.setQuestionNumber(i+1);
					
					// set question text
					String questionText = element.getElementsByTagName("QuestionText").item(0).getFirstChild().getNodeValue();
					aq.setQuestionText(questionText);
					
					// set directions
					String directions = element.getElementsByTagName("Directions").item(0).getFirstChild().getNodeValue();
					aq.setDirections(directions);
					
					// set options
					NodeList optionsList = element.getElementsByTagName("option");
					for(int j = 0; j < optionsList.getLength(); j++)
					{
						String option = optionsList.item(j).getFirstChild().getNodeValue();
						aq.getOptions().add(option);
					}
					
					// set correct option
					String correctOption = element.getElementsByTagName("CorrectOption").item(0).getFirstChild().getNodeValue();
					aq.setCorrectOption(Integer.parseInt(correctOption));
					
					// set solution
					if(element.getElementsByTagName("Solution").item(0) != null)	// handle cases where solution may not be there
					{
						String solution = element.getElementsByTagName("Solution").item(0).getFirstChild().getNodeValue();
						aq.setSolution(solution);
					}
					
					
					// set user option
					String userOption = answerNodeList.item(i).getFirstChild().getNodeValue();
					aq.setUserOption(Integer.parseInt(userOption));
					
					// add to appropriate section
					String sectionName = element.getElementsByTagName("Section").item(0).getFirstChild().getNodeValue();
					IAnsweredSection as = answeredTest.getSectionByName(sectionName);
					
					as.getQuestions().add(aq);
				}
			}
		}
		catch (ParserConfigurationException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch (SAXException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch (IOException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return answeredTest;
	}
}
