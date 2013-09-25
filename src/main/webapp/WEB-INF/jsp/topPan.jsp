<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page import="com.binaryedu.util.SessionUtil"%>
<%@page import="com.binaryedu.business.model.IUser"%>
<div id="topNav">
	<ul id="navlist">
	<%
		String ua = request.getHeader( "User-Agent" );
		boolean isChrome = ( ua != null && ua.toLowerCase().indexOf( "chrome/" ) != -1 );
		String msg = isChrome ? "Google Chrome doesn't display this site properly. Please try another browser" : "";
		
		if(isChrome){
	%>
		<li><span class="warning" style="font-weight: bold;"><%= msg %></span></li>
		|
	<%	}
		if(!SessionUtil.isUserLoggedIn(session))
		{%>
		<li><a href="signup.htm">Sign Up</a></li>
		<%	
		}
		else
		{
		IUser user = SessionUtil.getUserFromSession(session);
		%>
		<li>Logged in as <%=user.getEmail() %></li>
		<%	
		}%>
		
	|
	
	<li>
		<%	if(!SessionUtil.isUserLoggedIn(session))
		{%>
		<a href="<c:url value="login.htm"/>">Log In</a>
		<%	
		}
		else
		{%>
		<a href="<c:url value="logout.htm"/>">Log Out</a>
		<%	
		}%>
		</li>
		
	</ul>
</div>