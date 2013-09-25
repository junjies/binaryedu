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

	<h1>Verify Your Email</h1>
	<form:form method="post" commandName="resendVerificationEmail">
	<table width="95%" bgcolor="F8F8FF" border="0" cellspacing="0" cellpadding="5">
		<tr>
			<td align="left" colspan="3">
			It seems you have not verified your email. Please click on the link in the verification
			email that we had sent when you registered with us. If you haven't received the email till
			now, or lost it, enter your email address below and we'll send it to you again.<br/><br/>
			</td>
		</tr>
		<tr>
			<td align="left" width="10%">Email:</td>
			<td width="20%">
				<form:input path="email" size="25"/>
			</td>			
			<td>
				<form:errors path="email" cssClass="error"/>
			</td>
		</tr>
		<tr>
		<td colspan="2" align="center" width="100%"><input type="submit"
				align="middle" value="Submit"  class="button"/></td>
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
