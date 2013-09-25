<%@page import="java.util.List"%>
<%@page import="com.binaryedu.business.model.IAnsweredTest"%>
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
	<c:set var="model" value="${requestScope['model']}"/>
	<c:set var="testResult" value="${model.testResult}"/>
	
	<c:if test="${testResult == null}">
		<h1>No such test!!!</h1>
		<p>It seems you have not saved any test results till now!</p>
	</c:if>
	
	<c:if test="${testResult != null}">
	
	<h1><c:out value="${testResult.test.name}"/></h1>
	<p>
	Test submitted on <b><fmt:formatDate value="${testResult.dateCompleted}"/></b>
	</p>
	<h3>Test Summary</h3>
	
	<i>Questions: <c:out value="${testResult.numQuestions}"/> | 
	Attempted: <c:out value="${testResult.numAttemptedQuestions}"/> | 
	Correct: <c:out value="${testResult.numCorrectAnswers}"/> | 
	Percentage: <fmt:formatNumber value="${testResult.percentage}" maxFractionDigits="0"/>%</i>
	
	<h3>Section-wise Results</h3>
	<table class="resultSummary">
	<tr>
	<th>Section</th>
	<th>Questions</th>
	<th>Attempted</th>
	<th>Correct</th>
	<th>Percentage</th>
	</tr>
	<c:forEach items="${model.testResult.sections}" var="section">
	<tr>
	<td><c:out value="${section.name}"/></td>
	<td><c:out value="${section.numQuestions}"/></td>
	<td><c:out value="${section.numAttemptedQuestions}"/></td>
	<td><c:out value="${section.numCorrectAnswers}"/></td>
	<td><fmt:formatNumber value="${section.percentage}" maxFractionDigits="0"/>%</td>
	</tr>
	</c:forEach>
	</table>
	<h2>Test Questions</h2>
	<c:set var="currentDirectionsStr" value=""/>
	
	<c:forEach items="${model.testResult.sections}" var="section">
		<h3><c:out value="${section.name}"/></h3>
		<c:forEach items="${section.questions}" var="question">
		<%--
		HashMap model = (HashMap)request.getAttribute("model");
		AnsweredTest test = (AnsweredTest)model.get("testResult");
		out.println(test.getSections().get(0).getQuestions().get(0).getQuestionText());
		--%>
			<p><b>Question <c:out value="${question.questionNumber}" escapeXml="false"/></b></p>
			
			<c:if test="${question.directions != currentDirectionsStr}">
				<c:set var="currentDirectionsStr" value="${question.directions}"/>			
				<p><i><c:out value="${question.directions}" escapeXml="false"/></i></p>	
			</c:if>
			
			<p><b><c:out value="${question.questionText}" escapeXml="false"/></b></p>
			<c:set var="i" value="1"/>
			
			<table width="100%">
			<tr>
			<td width="90%">
				<c:forEach items="${question.options}" var="option">
				<c:if test="${question.userOption == i}">
					<% out.println("<span class=\"wrongAnswer\">"); %>
				</c:if>
				<c:if test="${question.correctOption == i}">
					<% out.println("<span class=\"correctAnswer\"><b>");%>
				</c:if>
				<c:out value="${i}"/>.
				<c:out value="${option}" escapeXml="false"/><br/>
				<c:if test="${question.correctOption == i}">
					<% out.println("</b></span>");%>
				</c:if>
				<c:if test="${question.userOption == i}">
					<% out.println("</span>");%>
				</c:if>
				
				<c:set var="i" value="${i+1}"/>			
			</c:forEach>
			</td>
			<td width="10%" valign="bottom">
			
			<c:choose>
				<c:when test="${question.userOption == 0}">
					<img src="./images/ico-alert.png" alt="" width="48" height="48" />
				</c:when>
				<c:when test="${question.userOption == question.correctOption}">
					<img src="./images/ico-correct.png" alt="" width="48" height="48" />
				</c:when>
				<c:when test="${question.userOption != question.correctOption}">
					<img src="./images/ico-wrong.png" alt="" width="48" height="48" />
				</c:when>
			</c:choose>
			
			
			</td>
			</tr>
			</table>
			
			
			<c:if test="${question.userOption == 0}">
			<p><span class="wrongAnswer">You did not attempt this question.</span></p>
			</c:if>
			
			<c:if test="${question.solution != null}">
			<p><span class="correctAnswer">Solution: <br/><c:out value="${question.solution}" escapeXml="false"/></span></p>
			</c:if>
			<br/>
			<hr/>
			<br/>
		</c:forEach>
		
	</c:forEach>	
</c:if>
</div>
<div id="right-sidebar">
</div>
</div>
<jsp:include page="footer.jsp" />
</div>

</body>
</html>
