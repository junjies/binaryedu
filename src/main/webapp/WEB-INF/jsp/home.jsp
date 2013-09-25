<%@ include file="/WEB-INF/jsp/include.jsp"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" 
	"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">

<%@page import="com.binaryedu.util.SessionUtil"%><html xmlns="http://www.w3.org/1999/xhtml" lang="en" xml:lang="en">
<head>
    <title>Binary Edu</title>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <link href="./css/style.css" rel="stylesheet" type="text/css" />
    <link href="./css/bubbles.css" rel="stylesheet" type="text/css" />
    <%@ include file="/WEB-INF/jsp/GA.jsp"%>
</head>

<body>

<div id="container">
<jsp:include page="topPan.jsp" />
<jsp:include page="headerMenu.jsp">
	<jsp:param name="currentPage" value="home" />
</jsp:include>

<div id="body">
<div id="left-sidebar">
	<table class="sidebar">
		<tr><th>Practice for CAT'09</th></tr>
		<tr><td>
		<b>Quick Quizzes</b><br/>
		10-15 min quizzes containing 4-5 questions<br/><br/>
		<b>Section Tests</b><br/>
		45 min test containing questions from a single topic<br/><br/>
		<b>Full Length Tests</b><br/>
		2h 15min test containing 70 questions corresponding to actual CAT pattern.<br/><br/>
		<a href="tests.htm">Go to Tests Area</a>
		</td></tr>
		
		</table>
		
</div>
<!-- Left sidebar end -->
<div id="content">
	<div class="banner">
	      <div class="banner_content">
	         Free Online Tests for CAT 2009
	      </div>
	</div>
	
	<div class="box">
		<div class="boxHeading">Join Binary Edu</div>
		
		<table cellspacing="5" cellpadding="3">
		<tr><td width="40" valign="top" align="center"><img src="./images/ico-copy.png" width="24" height="24"/></td><td>Adapt Yourself to the Computer-based CAT Examination</td></tr>
		<tr><td valign="top" align="center"><img src="./images/ico-copy.png" width="24" height="24"/></td><td>Get 5 Free simulated tests for CAT '09</td></tr>
		<tr><td valign="top" align="center"><img src="./images/ico-copy.png" width="24" height="24"/></td><td>Develop your own strategy to 'BELL THE CAT' by knowing the strategies followed by previous years 99 percentilers</td></tr>
		<tr><td valign="top" align="center"><img src="./images/ico-copy.png" width="24" height="24"/></td><td>Practice with a variety of tests to help you face any challenge CAT may throw at you!</td></tr>
		</table>
	</div>
	
	<h2>Strategies of Previous CAT Crackers</h2>
	
	<div class="homeBubble">
		<div class="bubble">
			<blockquote>
				<p>Get fundamentals crystal clear. Work hard and don't be 'afraid' of any problem. 
				Learn to leave problems for simpler ones and not get stuck to them.</p>
			</blockquote>
			<cite><strong>Arpit Bhandari (IIMC) - 99.3 Percentile <a href="strategies.htm?id=2">[More]</a></strong></cite>
		</div>
		<div class="bubble">
			<blockquote>
				<p>RC is all about reading more and more, be it newspapers, novels or internet articles 
				to make yourself familiar with various styles of writing and to improve your reading speed 
				without compromising on comprehension. </p>
			</blockquote>
			<cite><strong>Ashutosh Kumar Jha (IIML) - 98.8 Percentile <a href="strategies.htm?id=3">[More]</a></strong></cite>
		</div>
		
	</div>
	
</div>
	<!-- Right sidebar start -->
	<div id="right-sidebar">
	<% if(!SessionUtil.isUserLoggedIn(session)){%>
		<div class="signup">
		      <div class="signup_content">
		         <a href="signup.htm">Sign Up</a>
		      </div>
		</div>
		<div class="login">
		      <div class="login_content">
		         <a href="login.htm">Login</a>
		      </div>
		</div>
		<p></p>
		<%} %>
		<table class="sidebar">
		<tr><th>Free SMS Updates</th></tr>
		<tr><td>
		Get free updates on your mobile including news, word of the day and tips for CAT!
			 <a href="http://labs.google.co.in/smschannels/subscribe/BinaryEdu" target="_blank">Click here</a> to subscribe.
		</td></tr>
		</table>
		<table class="sidebar">
		<tr><th>Follow Us</th></tr>
		<tr><td>
		<p style="margin: 0px 0px 5px 0px;">Click on any of the following to find us on the social network of your choice!</p>
		<a href="http://www.facebook.com/profile.php?success=1&id=1720278480" target="_blank">Facebook</a><br/>
		<a href="http://twitter.com/binaryedu" target="_blank">Twitter</a><br/>
		<a href="http://www.orkut.co.in/Main#Profile.aspx?origin=is&uid=3522498695010783549" target="_blank">Orkut</a><br/>
		<a href="http://labs.google.co.in/smschannels/subscribe/BinaryEdu" target="_blank">Google Channels</a>
		</td></tr>
		
		</table>
	</div>
	<!-- Right sidebar end -->
</div>
<jsp:include page="footer.jsp" />
</div>

</body>
</html>
    
