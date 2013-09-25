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
	<jsp:param name="currentPage" value="profile" />
</jsp:include>

<div id="body">
<div id="left-sidebar">

</div>

<div id="content">
<h1>Profile</h1>
<c:set var="user" value="${requestScope['user']}" />
<table cellpadding="3" cellspacing="5">
	<%if(request.getParameter("msg") != null){ %>
	<tr>
		<td colspan="2" align="left" width="100%">
		<i><span class="info"><%=request.getParameter("msg") %></span></i>
		</td>
	</tr>
	<%} %>
	<tr>
		<td>Name:</td>
		<td><c:out value="${user.name}" /></td>
	</tr>
	<tr>
		<td>Email:</td>
		<td><c:out value="${user.email}" /></td>
	</tr>
	<tr>
		<td>Phone:</td>
		<td><c:out value="${user.phone}" /></td>
	</tr>
	<tr>
		<td>Gender:</td>
		<td><c:choose>
			<c:when test='${user.gender == "M"}'>
	            Male
	        </c:when>
			<c:when test='${user.gender == "F"}'>
	            Female
	       	</c:when>
		</c:choose></td>
	</tr>
	<tr>
		<td colspan="2" align="left" width="100%">
		<a href="editProfile.htm">Edit Profile</a> |
		<a href="editPassword.htm">Change Password</a>
		</td>
	</tr>
	
</table>
</div>
<div id="right-sidebar">
</div>
</div>
<jsp:include page="footer.jsp" />
</div>

</body>
</html>
