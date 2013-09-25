<%@page import="java.util.List"%>
<%@page import="com.binaryedu.business.model.ITest"%>
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
    <link href="./css/menu_style.css" rel="stylesheet" type="text/css" />
    <%@ include file="/WEB-INF/jsp/GA.jsp"%>
</head>

<body>
<div id="container">
<jsp:include page="topPan.jsp" />
<jsp:include page="headerMenu.jsp">
	<jsp:param name="currentPage" value="tests" />
</jsp:include>

<c:set var="model" value="${requestScope['model']}"/>
<c:set var="testList" value="${model.testList}"/>
<c:set var="type" value="${model.type}"/>

<div id="body">
<div id="left-sidebar">
	<table class="sidebar" style="margin-top: 25px;">
		<tr><th>Type of Tests</th></tr>
		<tr><td>
		<b>Quick Quizzes</b><br/>
		10-15 min quizzes containing 4-5 questions<br/><br/>
		<b>Section Tests</b><br/>
		45 min test containing questions from a single topic<br/><br/>
		<b>Full Length Tests</b><br/>
		2h 15min test containing 70 questions corresponding to actual CAT pattern.
		
		</td></tr>
		
	</table>
</div>

<div id="content">

	<h1 style="margin-bottom: 5px;">Tests</h1>
	
	<div id="navcontainer2">
		<ul id="navlist2">
		<c:choose>
			<c:when test="${type eq 'QQ'}">
				<li><a href="tests.htm?type=QQ" id="current">Quick Quizzes</a></li>
			</c:when>
			<c:otherwise>
				<li><a href="tests.htm?type=QQ">Quick Quizzes</a></li>
			</c:otherwise>
		</c:choose>
		<c:choose>
			<c:when test="${type eq 'ST'}">
				<li><a href="tests.htm?type=ST" id="current">Section Tests</a></li>
			</c:when>
			<c:otherwise>
				<li><a href="tests.htm?type=ST">Section Tests</a></li>
			</c:otherwise>
		</c:choose>
		<c:choose>
			<c:when test="${type eq 'FLT'}">
				<li><a href="tests.htm?type=FLT" id="current">Full Length Tests</a></li>
			</c:when>
			<c:otherwise>
				<li><a href="tests.htm?type=FLT">Full Length Tests</a></li>
			</c:otherwise>
		</c:choose>
		
		</ul>
	</div>
	
	
	<table  class="testList">
	<tr>
	<th>Test Name</th>
	<th>Questions</th>
	<th>Duration</th>
	<th>Marks</th>
<!--	<th>Negative Marking</th>-->
	</tr>
	<c:forEach items="${testList}" var="test">
	<tr>
	<td><b><a href="<c:url value="showTest.htm"><c:param name="testID" value="${test.id}" /></c:url>"><c:out value="${test.name}"/></a></b></td>
	<td><c:out value="${test.numQuestions}"/></td>
	<td><c:out value="${test.duration}"/> min</td>
	<td><c:out value="${test.marks}"/></td>
<!--	<td>-->
<!--	<c:if test="${test.negative < 0.0001}">-->
<!--		None<br/>-->
<!--	</c:if>-->
<!--	<c:if test="${test.negative > 0.0001}">-->
<!--		<fmt:formatNumber value="${test.negative * 100}" maxFractionDigits="0"/>%<br/>-->
<!--	</c:if>-->
<!--	</td>-->
	</tr>
	</c:forEach>	
	</table>
</div>
<div id="right-sidebar">
	
</div>
</div>
<jsp:include page="footer.jsp" />
</div>

</body>
</html>
