<%@page import="java.util.List"%>
<%@page import="com.binaryedu.business.model.ITestResult"%>
<%@page import="java.util.HashMap"%>

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
<jsp:include page="headerMenu.jsp">
	<jsp:param name="currentPage" value="results" />
</jsp:include>

<div id="body">
<div id="left-sidebar">

</div>

<div id="content">

	<h1>Results</h1>
	<p>
	Here's a list of tests you have taken (click on any test for detailed result):
	</p>
	<c:set var="model" value="${requestScope['model']}"/>
	<c:set var="testList" value="${model.testList}"/>
	<c:forEach items="${testList}" var="test">
	
	<p>
	<b><a href="<c:url value="detailedResult.htm"><c:param name="resultID" value="${test.id}" /></c:url>"><c:out value="${test.test.name}"/></a></b><br/>
	Submitted on: <fmt:formatDate value="${test.dateCompleted}"/><br/>
	<i>Questions: <c:out value="${test.numQuestions}"/> | 
	Attempted: <c:out value="${test.numAttemptedQuestions}"/> | 
	Correct: <c:out value="${test.numCorrectAnswers}"/> | 
	Percentage: <fmt:formatNumber value="${test.percentage}" maxFractionDigits="0"/>%</i>
	</p>
	</c:forEach>	

</div>
<div id="right-sidebar">
</div>
</div>
<jsp:include page="footer.jsp" />
</div>

</body>
</html>
