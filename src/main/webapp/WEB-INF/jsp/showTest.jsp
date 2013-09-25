<%@ include file="/WEB-INF/jsp/include.jsp"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<c:set var="model" value="${requestScope['model']}"/>
<c:set var="test" value="${model.test}"/>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" 
	"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml" lang="en" xml:lang="en">
<head>
    <title>Binary Edu</title>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <link href="./css/style.css" rel="stylesheet" type="text/css" />
    <%@ include file="/WEB-INF/jsp/GA.jsp"%>
	<script type="text/javascript">
	// Popup window code
	var popupWindow = null;
	
	function newPopup(url) 
	{
		if(popupWindow == null || popupWindow.closed)
		{
			popupWindow = window.open(url,'BinaryEdu' + '<c:out value="${test.id}"/>','height=675,width=975,left=10,top=10,scrollbars=auto,toolbar=no,menubar=no,location=no,directories=no,status=no');
		}
		else
		{
			popupWindow.focus();
		}
	}
	</script>
</head>

<body>
<div id="container">
<jsp:include page="topPan.jsp" />
<jsp:include page="headerMenu.jsp">
	<jsp:param name="currentPage" value="tests" />
</jsp:include>

<div id="body">
<div id="left-sidebar">

</div>

<div id="content">

	

	<h1><c:out value="${test.name}"/></h1>
	
	<table>
	<tr><td><h2>Instructions</h2></td></tr>
	<tr><td><c:out value="${test.instructions}" escapeXml="false"/></td></tr>
	<tr><td align="center"><input type="button" value="Launch Test" onclick="newPopup('<c:url value="startTest.htm"><c:param name="testID" value="${test.id}" /></c:url>');" class="button"/></td></tr>
	</table>
	

</div>
<div id="right-sidebar">
</div>
</div>
<jsp:include page="footer.jsp" />
</div>

</body>
</html>
