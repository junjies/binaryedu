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
<h1>Edit Profile</h1>
	<form:form method="post" commandName="editProfile">
	<table width="95%" border="0" cellspacing="0" cellpadding="5">
		
		<tr>
			<td align="left" width="10%">Name:</td>
			<td width="20%">
				<form:input path="name" size="25"/>
			</td>			
			<td>
				<form:errors path="name" cssClass="error"/>
			</td>
		</tr>
		<tr>
			<td align="left">Email:</td>
			<td>
				<form:input path="email" readonly="true" size="25"/>
			</td>			
			<td>
				<form:errors path="email" cssClass="error"/>
			</td>
		</tr>
		<tr>
			<td align="left">Phone:</td>
			<td>
				<form:input path="phone" size="25"/>
			</td>			
			<td>
				<form:errors path="phone" cssClass="error"/>
			</td>
		</tr>
		<tr>
			<td align="left">Gender:</td>
			<td><form:radiobutton path="gender" value="M"/>Male
       			<form:radiobutton path="gender" value="F"/>Female </td>
			
			<td>
				<form:errors path="gender" cssClass="error"/>
			</td>
		</tr>
		<tr>
		<td colspan="2" align="center">
		<input type="submit" value="Update" class="button"/>
		<input type="button" value="Cancel" onclick="window.location='profile.htm'" class="button"/>
		</td>
		</tr>
	</table>
</form:form>

</div>
<div id="right-sidebar">
</div>
</div>
<jsp:include page="footer.jsp" />
</div>

</body>
</html>
