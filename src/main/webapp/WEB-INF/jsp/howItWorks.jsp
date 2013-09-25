<%@ include file="/WEB-INF/jsp/include.jsp"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" 
	"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml" lang="en" xml:lang="en">
<head>
    <title>Binary Edu</title>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <link href="./css/style.css" rel="stylesheet" type="text/css" />
    <%@ include file="/WEB-INF/jsp/GA.jsp"%>
</head>

<body>
<div id="container">
<jsp:include page="topPan.jsp" />
<jsp:include page="headerMenu.jsp" />

<div id="body">
<div id="left-sidebar">

</div>

<div id="content">

	<h1>How it Works</h1>
	<p>Binary Education is currently offering online Mock Tests for CAT '09 to help you face any challenges that CAT may throw at you.
	Our robust test application is aimed at providing before hand experience of <b>Computer Based Tests</b> to aspirants preparing for CAT-2009.
	This section provides step by step details on how to use this web site and the test application.</p>
	
	<h3>Sign Up and Account Activation</h3> 
	<p><u>Step 1:</u> Sign up easily within 30 seconds by providing bare minimum details. Once you sign up with us, we will send you an activation email.
	This is to prevent someone else from using your email id.
	</p>
	
	<p><img src="./images/screenshots/signup.PNG" border="1"/></p>
	
	<p><u>Step 2:</u> Activate your account by click on the link provided in the email or by pasting the link in the web browser.
	Once your account is activated, you would be able to access the Free CAT tests.</p>
	
	<h3>Working on the Test Application</h3>
	<p><u>Step 1:</u> Start a test by clicking on the <b><i>Tests</i></b> page and then clicking on the test that you may wish to take. Click on 
	the <b><i>Launch Test</i></b> button &amp; it will open the Test Application in a new window.</p>
	
	<p><img src="./images/screenshots/testapp.PNG" border="1"/></p>
	
	<p><u>Step 2:</u> Proceed with the test by answering the questions. The test screen consists of the following parts:</p>
	
	<ol>
	<li>Directions: This area contains the directions for the questions.</li>
	<li>Questions: This area contains the questions text and the options for the question. You may 
	select the desired option by clicking on the radio button corresponding to the option.</li>
	<li>Navigation Pane: You can navigate to <b>Next</b> and <b>Previous</b> questions using the Navigation pane. Navigation pane 
	also contains the <b>Finish</b> button. Using the Finish button you can end the test.</li>
	<li>Answer Sheet: As you click the desired options for the questions that you attempt, 
	this answer sheet is updated. Once you answer a question, it is highlighted in GREEN to indicate that the question has 
	been attempted. You may click on the FLAG option to mark the question for review before you 'Finish' the test. Once 
	you flag a question, it is highlighted in RED to indicate that the question has been marked for review.</li>
	<li>Clock: Shows the remaining time for the test</li>
	</ol> 
	
	<p>Step 3: Click the <b>Finish</b> button to end the test.</p>


	<p>After clicking the Finish button you would be provided an overview of your performance in the test. Click on the <b>Save Test Results</b> 
	button to save the test results to your profile.  

	Please note that if you don't save the results, you will not be able to see the detailed analysis of the test.
	</p>
	
	<h3>Viewing your Results</h3>
	<p>Step 1: Click on the Results tab to view a list of results for the tests you have taken.</p> 

	<p><img src="./images/screenshots/results.PNG" border="1"/></p>

	<p>Step 2: Click on any test result and you can see a result summary, section wise scores and a detailed result with all the 
	questions, their correct answer and the option that you had selected in the test.</p>
	<p><img src="./images/screenshots/detailedResult1.PNG" border="1"/></p>
	<p><img src="./images/screenshots/detailedResult2.PNG" border="1"/></p>
</div>
<div id="right-sidebar">
</div>
</div>
<jsp:include page="footer.jsp" />
</div>

</body>
</html>
