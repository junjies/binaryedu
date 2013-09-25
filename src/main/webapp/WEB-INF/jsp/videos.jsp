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
	<jsp:param name="currentPage" value="videos" />
</jsp:include>

<div id="body">
<div id="left-sidebar">
	<table class="sidebar" style="margin-top: 25px;">
		<tr><th>Choose a Video</th></tr>
		<tr><td>
		<a href="videos.htm">Videos Home</a><br />
		<a href="videos.htm?id=1">- Sequence Series: Part 1</a><br />
		<a href="videos.htm?id=2">- Sequence Series: Part 2</a><br />
		<a href="videos.htm?id=3">- Remainder Theorem: Part 1</a><br />
		<a href="videos.htm?id=4">- Remainder Theorem: Part 2</a><br />
		<a href="videos.htm?id=5">- Geometry: Trigonometry</a><br />
		<a href="videos.htm?id=6">- Geometry: Polygons</a><br />
		<a href="videos.htm?id=7">- Probability</a><br />
		<a href="videos.htm?id=8">- Permutation/Combination 1</a><br />
		<a href="videos.htm?id=9">- Profit &amp; Loss: Part 1</a><br />
		<a href="videos.htm?id=10">- Profit &amp; Loss: Part 2</a><br />
		</td></tr>		
	</table>
	
	<table class="sidebarLight">
	<tr><th>Advertisements</th></tr>
	<tr><td>
	<script type="text/javascript"><!--
	google_ad_client = "pub-2043647560365912";
	/* 120x240, Handa */
	google_ad_slot = "0755957307";
	google_ad_width = 120;
	google_ad_height = 240;
	//-->
	</script>
	<script type="text/javascript"
	src="http://pagead2.googlesyndication.com/pagead/show_ads.js">
	</script>
	</td></tr>
	
	</table>
</div>

<div id="content">

	<h1>Video Tutorials</h1>
	
	<%
		String idString = request.getParameter("id");
		if(idString == null)
		{
			idString = "0";
		}
		int id = Integer.parseInt(idString);
		
		switch(id)
		{
			case 1:
			%>
				<h3>Sequence Series: Part 1</h3>
				<object width="500" height="405"><param name="movie" value="http://www.youtube.com/v/28p_u0q1fAw&hl=en&fs=1&rel=0&border=1"></param><param name="allowFullScreen" value="true"></param><param name="allowscriptaccess" value="always"></param><embed src="http://www.youtube.com/v/28p_u0q1fAw&hl=en&fs=1&rel=0&border=1" type="application/x-shockwave-flash" allowscriptaccess="always" allowfullscreen="true" width="500" height="405"></embed></object>
			<%
				break;
			case 2:
			%>
				<h3>Sequence Series: Part 2</h3>
				<object width="500" height="405"><param name="movie" value="http://www.youtube.com/v/IUkjEIW2qeI&hl=en&fs=1&rel=0&border=1"></param><param name="allowFullScreen" value="true"></param><param name="allowscriptaccess" value="always"></param><embed src="http://www.youtube.com/v/IUkjEIW2qeI&hl=en&fs=1&rel=0&border=1" type="application/x-shockwave-flash" allowscriptaccess="always" allowfullscreen="true" width="500" height="405"></embed></object>
			<%
				break;
			case 3:
			%>
				<h3>Remainder Theorem: Part 1</h3>
				<object width="500" height="405"><param name="movie" value="http://www.youtube.com/v/LUJxhi0uTaY&hl=en&fs=1&rel=0&border=1"></param><param name="allowFullScreen" value="true"></param><param name="allowscriptaccess" value="always"></param><embed src="http://www.youtube.com/v/LUJxhi0uTaY&hl=en&fs=1&rel=0&border=1" type="application/x-shockwave-flash" allowscriptaccess="always" allowfullscreen="true" width="500" height="405"></embed></object>
			<%
				break;
			case 4:
			%>
				<h3>Remainder Theorem: Part 2</h3>
				<object width="500" height="405"><param name="movie" value="http://www.youtube.com/v/x47zef-E5yE&hl=en&fs=1&rel=0&border=1"></param><param name="allowFullScreen" value="true"></param><param name="allowscriptaccess" value="always"></param><embed src="http://www.youtube.com/v/x47zef-E5yE&hl=en&fs=1&rel=0&border=1" type="application/x-shockwave-flash" allowscriptaccess="always" allowfullscreen="true" width="500" height="405"></embed></object>
			<%
				break;
			case 5:
			%>
				<h3>Geometry: Trigonometry</h3>
				<object width="500" height="405"><param name="movie" value="http://www.youtube.com/v/azPHvtCUhvM&hl=en&fs=1&rel=0&border=1"></param><param name="allowFullScreen" value="true"></param><param name="allowscriptaccess" value="always"></param><embed src="http://www.youtube.com/v/azPHvtCUhvM&hl=en&fs=1&rel=0&border=1" type="application/x-shockwave-flash" allowscriptaccess="always" allowfullscreen="true" width="500" height="405"></embed></object>
			<%
				break;
			case 6:
			%>
				<h3>Geometry: Polygons</h3>
				<object width="500" height="405"><param name="movie" value="http://www.youtube.com/v/WPm1x5li9vg&hl=en&fs=1&rel=0&border=1"></param><param name="allowFullScreen" value="true"></param><param name="allowscriptaccess" value="always"></param><embed src="http://www.youtube.com/v/WPm1x5li9vg&hl=en&fs=1&rel=0&border=1" type="application/x-shockwave-flash" allowscriptaccess="always" allowfullscreen="true" width="500" height="405"></embed></object>
			<%
				break;
			case 7:
			%>
				<h3>Probability</h3>
				<object width="500" height="405"><param name="movie" value="http://www.youtube.com/v/CC_ssPTwck0&hl=en&fs=1&rel=0&border=1"></param><param name="allowFullScreen" value="true"></param><param name="allowscriptaccess" value="always"></param><embed src="http://www.youtube.com/v/CC_ssPTwck0&hl=en&fs=1&rel=0&border=1" type="application/x-shockwave-flash" allowscriptaccess="always" allowfullscreen="true" width="500" height="405"></embed></object>
			<%
				break;
			case 8:
			%>
				<h3>Permutation/Combination 1</h3>
				<object width="500" height="405"><param name="movie" value="http://www.youtube.com/v/hVJzLnu3OjI&hl=en&fs=1&rel=0&border=1"></param><param name="allowFullScreen" value="true"></param><param name="allowscriptaccess" value="always"></param><embed src="http://www.youtube.com/v/hVJzLnu3OjI&hl=en&fs=1&rel=0&border=1" type="application/x-shockwave-flash" allowscriptaccess="always" allowfullscreen="true" width="500" height="405"></embed></object>
			<%
				break;
			case 9:
			%>
				<h3>Profit &amp; Loss: Part 1</h3>
				<object width="500" height="405"><param name="movie" value="http://www.youtube.com/v/DxnHUSjYEtE&hl=en&fs=1&rel=0&border=1"></param><param name="allowFullScreen" value="true"></param><param name="allowscriptaccess" value="always"></param><embed src="http://www.youtube.com/v/DxnHUSjYEtE&hl=en&fs=1&rel=0&border=1" type="application/x-shockwave-flash" allowscriptaccess="always" allowfullscreen="true" width="500" height="405"></embed></object>
			<%
				break;
			case 10:
			%>
				<h3>Profit &amp; Loss: Part 2</h3>
				<object width="500" height="405"><param name="movie" value="http://www.youtube.com/v/XBnlCmynpfI&hl=en&fs=1&rel=0&border=1"></param><param name="allowFullScreen" value="true"></param><param name="allowscriptaccess" value="always"></param><embed src="http://www.youtube.com/v/XBnlCmynpfI&hl=en&fs=1&rel=0&border=1" type="application/x-shockwave-flash" allowscriptaccess="always" allowfullscreen="true" width="500" height="405"></embed></object>
			<%
				break;
			default:
			%>
			<p>How many times you have missed an important concept during the class? How many times you have felt like 
			rewinding the lecture to grasp that concept?</p>

			<p>Here, we are with videos designed specially to cater to MBA aspirants who will be taking CAT 
			and similar examinations. These videos have been prepared by Ravi Handa of www.handakafunda.com.</p>

			<p>These videos are a good resource to revise those important concepts and to plug-in the loop holes in your preparation.</p>
			<table class="testList">
			<tr>
				<td width="50%"><a href="videos.htm?id=1">Sequence Series: Part 1</a></td>
				<td><a href="videos.htm?id=2">Sequence Series: Part 2</a></td>
			</tr>
			<tr><td><a href="videos.htm?id=3">Remainder Theorem: Part 1</a></td><td><a href="videos.htm?id=4">Remainder Theorem: Part 2</a></td></tr>	
			<tr><td><a href="videos.htm?id=5">Geometry: Trigonometry</a></td><td><a href="videos.htm?id=6">Geometry: Polygons</a></td></tr>
			<tr><td><a href="videos.htm?id=7">Probability</a></td><td><a href="videos.htm?id=8">Permutation/Combination 1</a></td></tr>
			<tr><td><a href="videos.htm?id=9">Profit &amp; Loss: Part 1</a></td><td><a href="videos.htm?id=10">Profit &amp; Loss: Part 2</a></td></tr>
		
			</table>
			
			<%
				break;
		}
	%>
	<br/>
	<table>
	<tr><td valign="top">Vidoes provided by </td><td valign="top"><a href="http://www.handakafunda.com" target="_blank"><img src="./images/hkf.jpg"/></a></td></tr>
	</table>
	
	<p>
			<script type="text/javascript"><!--
			google_ad_client = "pub-2043647560365912";
			/* 468x60, Handa */
			google_ad_slot = "5213184856";
			google_ad_width = 468;
			google_ad_height = 60;
			//-->
			</script>
			<script type="text/javascript"
			src="http://pagead2.googlesyndication.com/pagead/show_ads.js">
			</script>
			</p>
</div>
<div id="right-sidebar">
	<table class="sidebar" style="margin-top: 25px;">
		<tr><th>Free CAT Mock Tests</th></tr>
		<tr><td>
		Take our <a href="tests.htm">free mock tests</a> for CAT that are designed keeping in mind the new 
		computer based CAT examinations. There are three types of tests available: 
		<a href="tests.htm?type=QQ">Quick Quizzes</a> that are 10-15 min in duration, 
		<a href="tests.htm?type=ST">Section Tests</a> for RC, Quant and DI sections 
		and <a href="tests.htm?type=FLT">Full Length Mock Tests</a> that simulate the actual CAT exam. 
		</td></tr>
		
	</table>
	<table class="sidebarLight">
	<tr><th>Advertisements</th></tr>
	<tr><td>
	<script type="text/javascript"><!--
	google_ad_client = "pub-2043647560365912";
	/* 120x240, Handa */
	google_ad_slot = "0755957307";
	google_ad_width = 120;
	google_ad_height = 240;
	//-->
	</script>
	<script type="text/javascript"
	src="http://pagead2.googlesyndication.com/pagead/show_ads.js">
	</script>
	</td></tr>
	
	</table>
</div>
</div>
<jsp:include page="footer.jsp" />
</div>

</body>
</html>
