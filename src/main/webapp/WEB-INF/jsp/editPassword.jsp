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
<h1>Change Password</h1>
	<form:form method="post" commandName="editPassword">
	<table width="95%" border="0" cellspacing="5" cellpadding="5">
		
		<tr>
			<td align="left" width="30%">Current Password:</td>
			<td width="20%">
				<form:password path="oldPassword" size="25"/>
			</td>			
			<td>
				<form:errors path="oldPassword" cssClass="error"/>
			</td>
		</tr>
		<tr>
			<td align="left">New Password:</td>
			<td>
				<form:password path="newPassword" size="25"/>
			</td>			
			<td>
				<form:errors path="newPassword" cssClass="error"/>
			</td>
		</tr>
		<tr>
			<td align="left">Confirm New Password:</td>
			<td>
				<form:password path="confirmNewPassword" size="25"/>
			</td>			
			<td>
				<form:errors path="confirmNewPassword" cssClass="error"/>
			</td>
		</tr>
		<tr>
			<td colspan="2" align="center" width="100%">
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
