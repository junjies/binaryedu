<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page import="com.binaryedu.util.SessionUtil"%>

<c:set var="currentPage" value="${param.currentPage}"/>

<div id="header">
	<img src="./images/logo.png"/>
	<ul class="menu1">
		<c:choose>
			<c:when test="${currentPage eq 'home'}">
				<li class="current"><a href="<c:url value="home.htm"/>"><b>Home</b></a></li>
			</c:when>
			<c:otherwise>
				<li><a href="<c:url value="home.htm"/>"><b>Home</b></a></li>
			</c:otherwise>
		</c:choose>
		
		<c:choose>
			<c:when test="${currentPage eq 'tests'}">
				<li class="current"><a href="<c:url value="tests.htm"/>"><b>Tests</b></a></li>
			</c:when>
			<c:otherwise>
				<li><a href="<c:url value="tests.htm"/>"><b>Tests</b></a></li>
			</c:otherwise>
		</c:choose>
		
		<c:choose>
			<c:when test="${currentPage eq 'results'}">
				<li class="current"><a href="<c:url value="results.htm"/>"><b>Results</b></a></li>
			</c:when>
			<c:otherwise>
				<li><a href="<c:url value="results.htm"/>"><b>Results</b></a></li>
			</c:otherwise>
		</c:choose>	
		
		<c:choose>
			<c:when test="${currentPage eq 'profile'}">
				<li class="current"><a href="<c:url value="profile.htm"/>"><b>Profile</b></a></li>
			</c:when>
			<c:otherwise>
				<li><a href="<c:url value="profile.htm"/>"><b>Profile</b></a></li>
			</c:otherwise>
		</c:choose>
		
		<c:choose>
			<c:when test="${currentPage eq 'strategies'}">
				<li class="current"><a href="<c:url value="strategies.htm"/>"><b>CAT Crackers</b></a></li>
			</c:when>
			<c:otherwise>
				<li><a href="<c:url value="strategies.htm"/>"><b>CAT Crackers</b></a></li>
			</c:otherwise>
		</c:choose>	
		
		<c:choose>
			<c:when test="${currentPage eq 'videos'}">
				<li class="current"><a href="<c:url value="videos.htm"/>"><b>Videos<sup>New!</sup></b></a></li>
			</c:when>
			<c:otherwise>
				<li><a href="<c:url value="videos.htm"/>"><b>Videos<sup>New!</sup></b></a></li>
			</c:otherwise>
		</c:choose>
			
		<li><a href="http://binaryedu.wordpress.com" target="_blank"><b>Blog</b></a></li>
	</ul>

</div>