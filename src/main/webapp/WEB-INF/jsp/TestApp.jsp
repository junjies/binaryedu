<%@ include file="/WEB-INF/jsp/include.jsp"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<!-- The HTML 4.01 Transitional DOCTYPE declaration-->
<!-- above set at the top of the file will set     -->
<!-- the browser's rendering engine into           -->
<!-- "Quirks Mode". Replacing this declaration     -->
<!-- with a "Standards Mode" doctype is supported, -->
<!-- but may lead to some differences in layout.   -->
<c:set var="model" value="${requestScope['model']}"/>
<c:set var="test" value="${model.test}"/>

<html>
  <head>
    <meta http-equiv="content-type" content="text/html; charset=UTF-8">

    <!--                                                               -->
    <!-- Consider inlining CSS to reduce the number of requested files -->
    <!--                                                               -->
    <link type="text/css" rel="stylesheet" href="./css/TestApp.css">

    <!--                                           -->
    <!-- Any title is fine                         -->
    <!--                                           -->
    <title>Binary Edu</title>
    
    <!--                                           -->
    <!-- This script loads your compiled module.   -->
    <!-- If you add any GWT meta tags, they must   -->
    <!-- be added before this line.                -->
    <!--                                           -->
    <script type="text/javascript" language="javascript" src="./testapp/testapp.nocache.js"></script>
    <%@ include file="/WEB-INF/jsp/GA.jsp"%>
  </head>

  <!--                                           -->
  <!-- The body can have arbitrary html, or      -->
  <!-- you can leave the body empty if you want  -->
  <!-- to create a completely dynamic UI.        -->
  <!--                                           -->
  <body>

    <!-- OPTIONAL: include this if you want history support -->
    <iframe src="javascript:''" id="__gwt_historyFrame" tabIndex='-1' style="position:absolute;width:0;height:0;border:0"></iframe>
	
	<div id="testAppContainer" class="testAppContainer"></div>
	<div id="testIDDiv" style="visibility: hidden" title="<c:out value="${test.id}"/>"></div>
	<div id="userIDDiv" style="visibility: hidden" title="<c:out value="${user.id}"/>"></div>
	<div id="timerDiv" style="visibility: hidden" title="<c:out value="${test.duration * 60}"/>"></div>
	<div id="negative" style="visibility: hidden" title="<c:out value="${test.negative}"/>"></div>
  </body>
</html>
