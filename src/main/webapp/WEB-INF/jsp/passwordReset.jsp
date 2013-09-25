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
	
	<%if(request.getAttribute("error") != null){ %>
	<h1>Error!!!</h1>
	<p><span class="error"><%=request.getAttribute("error") %></span></p>
	<%}
	else if("true".equals(request.getAttribute("wrongUser"))){ %>
	<h1>Error!!!</h1>
	<p><span class="error">Email is incorrect</span></p>
	<%}
	else if("true".equals(request.getAttribute("wrongKey"))){
	%>
	<h1>Error!!!</h1>
	<p><span class="error">Activation key is incorrect</span></p>
<%	}
	else
	{
	%>
	<h1>Password Reset</h1>
	<p>We've generated a new password for you and emailed you the same. Please use the new
	password to log in to the Binary Edu web site. You may change the password from the 
	profile page once you've successfully logged in.</p>
<%	}
	%>

</div>
<div id="right-sidebar">
</div>
</div>
<jsp:include page="footer.jsp" />
</div>

</body>
</html>
