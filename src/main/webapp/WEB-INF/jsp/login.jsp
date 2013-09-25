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
<h1>Login</h1>
<form:form method="post" commandName="login" action="login.htm">
	<table width="95%" border="0" cellspacing="5" cellpadding="5">
		<tr>
			<td align="left" width="15%">Email:</td>
			<td width="20%" align="left"><form:input path="email" size="25"/></td>
			<td align="left"><form:errors path="email" cssClass="error" /></td>
		</tr>
		<tr>
			<td align="left">Password:</td>
			<td><form:password path="password" size="25" maxlength="32"/></td>
			<td><form:errors path="password" cssClass="error" /></td>
		</tr>
		<tr>
			<td align="left"></td>
			<td><form:hidden path="fwd"/></td>
			<td></td>
		</tr>
		<tr>
			<td colspan="2" align="center" width="100%"><input type="submit"
				align="middle" value="Login"  class="button"/></td>
		</tr>
		<tr>
			<td colspan="2" align="left" width="100%">
			<a href="signup.htm">New to Binary Edu? Create an account</a>
			</td>
		</tr>
		<tr>
			<td colspan="2" align="left" width="100%"><a
				href="forgotPassword.htm" class="more">Forgot Your Password?</a></td>
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
