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
	<jsp:param name="currentPage" value="strategies" />
</jsp:include>

<div id="body">
<div id="left-sidebar">
	<table class="sidebarLight" style="margin-top: 25px;">
		<tr><th>Advertisements</th></tr>
		<tr><td>
		<script type="text/javascript"><!--
		google_ad_client = "pub-2043647560365912";
		/* 120x600, skyscraper */
		google_ad_slot = "3227391044";
		google_ad_width = 120;
		google_ad_height = 600;
		//-->
		</script>
		<script type="text/javascript"
		src="http://pagead2.googlesyndication.com/pagead/show_ads.js">
		</script>
		</td></tr>
		
	</table>
</div>

<div id="content">

	<h1>CAT Crackers</h1>
	
	<%
		String idString = request.getParameter("id");
		if(idString == null)
		{
			idString = "0";
		}
		int id = Integer.parseInt(idString);
		
		if(id < 0 || id > 4)
		{
			id = 0;
		}
		
		switch(id)
		{
			case 0:
			case 1:
				%>
				<table width="100%"><tr><td align="left" width="100%">
				 <a href="strategies.htm?id=4">Previous</a> |
				 <a href="strategies.htm?id=2">Next</a>
				 </td></tr></table>
				<h3>V Amaresh Subramaniam</h3>
				
				<table class="strategies">
				<tr><td>Institute</td><td>IIM Indore</td></tr>
				<tr><td>Year of Graduation</td><td>2008</td></tr>
				<tr><td>Percentile</td><td>99.06 (CAT 2005)</td></tr>
				<tr><td>Current Position</td><td>Branch Manager, Olam International</td></tr>
				</table>
				<p><b>1.	What does it take to crack the CAT?</b></p>

				<p class="strategies">A bad job helps. Confidence. Good English, knowing easy from tough, knowing limitations.</p>

				<p><b>2.	What was my strategy for CAT?</b></p>

				<p class="strategies">Skip what you don't know. If you're struggling, so is everyone else.</p>

				<p><b>3.	Tips for Various Sections:</b></p>
				<p class="strategies"><i>a.	Reading Comprehension</i><br/><br/>
				Read a good newspaper (or three) every morning, cover to cover. Don't skip business and politics to reach
				sports after you've read page 3. Read and write letters.<br/><br/>

				b.<i>	Logical Reasoning</i><br/><br/>
				Play minesweeper.<br/><br/>

				c.<i>	Data Interpretation</i><br/><br/>
				Learning to skip is important in this section.<br/></p>

				<p><b>4.	CAT Course / Books that I followed</b></p>
				<p>Mock CATs from TIME.</p>
				<table width="100%"><tr><td align="right" width="100%">
				 <a href="strategies.htm?id=4">Previous</a> |
				 <a href="strategies.htm?id=2">Next</a>
				 </td></tr></table>
				<%
				break;
			case 2:
				%>
				<table width="100%"><tr><td align="left" width="100%">
				 <a href="strategies.htm?id=1">Previous</a> |
				 <a href="strategies.htm?id=3">Next</a>
				 </td></tr></table>
				<h3>Arpit Bhandari</h3>
				<table class="strategies">
				<tr><td>Institute</td><td>IIM Calcutta</td></tr>
				<tr><td>Year of Graduation</td><td>2010 (expected)</td></tr>
				<tr><td>Percentile</td><td>99.3 (CAT 2007)</td></tr>
				</table>
				
				<p><b>1.	What does it take to crack the CAT?</b></p>
				<p class="strategies">Hard work, tenacity, and a good temperament are needed to crack the CAT. I could not clear Verbal 
				cutoff when I took my first CAT in 2005. I got final admission from FMS, but then chose to accept a campus 
				job offer to try for CAT again. Next year too, I was preparing well and was scoring under 100 ranks in mock CATs, 
				but DI took a beating on the final day. Attributing 'luck factor' to the exam, 
				I decided not to prepare for CAT anymore and to go for MS, for which I appeared for GRE/TOEFL. 
				Still I filled up the CAT form, and took the exam without even an hour of preparation, and got calls from CLIK.</p> 
				<p class="strategies">Looking back, I feel that I did my hard work for first 2 years and then also was in touch with verbal 
				(through GRE preparation) - but was lacking the temperament for final day assault. On my 3rd attempt, 
				when I went into the test center with zilch preparation and a feeling of having-nothing-to-lose, I could perform to my potential.</p>
				<p class="strategies">Many students can work hard and score well  on normal days, but I have experienced that it is only 
				the temperament of final day which counts.</p>
				<p><b>2.	What was my strategy for CAT?</b></p>

				<p class="strategies">Since Verbal was my weakest section, I always started with it. Also, due to poor accuracy, I tried to attempt
				 the whole section giving it 1+ hour. I followed it by some Quant questions just to 'warm-up' myself with calculations.
				 Leaving Quant mid-way, I jumped to DI and finished the section (up to a comfortable level of clearing cut-offs) 
				 to return back to Quant for the remaining time. I did this as I didn't want to be left 'reading' a problem set of DI midway.</p>
				<p class="strategies">Also, for Quant and DI, I used to choose problem sets haphazardly - never in a set pattern (a lesson learnt in mock 
				CATs that problems in the middle/end are many a times simpler!) </p>
				<p><b>3.	Tips for Various Sections:</b></p>
				<p class="strategies">
				<i>a.	Reading Comprehension</i><br/><br/>
				Good vocabulary matters! The RC becomes a smooth ride when you don't stop at a new word and 
				try to make out its meaning from the given context.<br/><br/>

				<i>b.	Logical Reasoning</i><br/><br/>
				Practice and practice. Given time, you can solve any LR problem. But since time is precious 
				during CAT, your brain should hit the ground running. <br/><br/>

				<i>c.	Data Interpretation</i><br/><br/>
				Even if you read the problem and don't have the confidence to solve it, move on to the next one. 
				The time 'wasted' while reading it, and not solving it, is justified if you can solve the other set 
				properly. Don't end the test with this section. <br/><br/>

				<i>d.	Quant</i><br/><br/>
				Get fundamentals crystal clear. Work hard and don't be 'afraid' of any problem. Learn to leave 
				problems for simpler ones and not get stuck to them.<br/><br/>
				
				</p>
				<p><b>4.	CAT Course / Books that I followed</b></p>
				<p class="strategies">I followed study material of Roots Education in the first two years of my preparation.
				 I also enrolled myself to TIME test series during last two attempts. Also, I did Barron's 
				 word list for my GRE exam which helped a lot.</p>
				 <table width="100%"><tr><td align="right" width="100%">
				 <a href="strategies.htm?id=1">Previous</a> |
				 <a href="strategies.htm?id=3">Next</a>
				 </td></tr></table>
				<%
				break;
			case 3:
				%>
				<table width="100%"><tr><td align="left" width="100%">
				 <a href="strategies.htm?id=2">Previous</a> |
				 <a href="strategies.htm?id=4">Next</a>
				 </td></tr></table>
				<h3>Ashutosh Kumar Jha</h3>
				<table class="strategies">
				<tr><td>Institute</td><td>IIM Lucknow</td></tr>
				<tr><td>Year of Graduation</td><td>2010 (expected)</td></tr>
				<tr><td>Percentile</td><td>98.8</td></tr>
				</table>
				
				<p><b>1.	What does it take to crack the CAT?</b></p>
				<p class="strategies">The first and most important requirement to crack the CAT is aptitude. If you don't have it, 
				it's very difficult to get a good CAT score. Aptitude is one thing that cannot be acquired or built 
				up by practice. But don't think that this fact undermines the importance of practice in the course of CAT 
				preparation. While you may have the right aptitude, you may falter on the D-day just because you don't have 
				the right temperament and attitude to face the situation. The pressure on the day is immense and, unless you 
				have built the confidence to face it by practising under simulated environment and doing a detailed analysis 
				of your performance throughout the preparation period, you can very well have a bad day when it matters.</p>
				<p class="strategies"> While
				 aptitude determines the zone in which your CAT score may finally lie, practice reduces the variability of that 
				 score and tends to push your score towards the ceiling of your zone. Practice does not mean taking numerous mock 
				 tests to get familiar with the kind of questions that may be asked or to optimise your time distribution for the 
				 various sections of the paper. The more important part entails that you analyse each and every paper you take to 
				 identify the kinds of problems you are good at and the types of mistakes you make. After identifying your strengths 
				 and weaknesses you need to take subsequent papers with the aim of improving your knack of picking the problems you
				  can solve easily (and also in quick time, as an easy problem which takes a lot of time is no good). Moreover, you 
				  need to work on your weaknesses too, because you never know what will be the exact pattern of the paper and you may 
				  run out of easy problems to solve. But before all this you need to develop the platform for making your practice 
				  sessions more effective. This can be done by revising the theoretical concepts thoroughly so that you don't make 
				  blunders at later stages. So, the right mix of aptitude, theory, practice and analysis will help you sail through 
				  one of the most competitive exams in the world!</p>
				<p><b>2.	What was my strategy for CAT?</b></p>

				<p class="strategies">My strategy for CAT was simple. As I said you cannot acquire aptitude by any means, I thought it was no 
				point worrying about something I do not have control upon. If I had the ability it will be evident in the result, 
				otherwise it will make me a wiser person in terms of understanding my weaknesses. So, I just concentrated on building up 
				my confidence of taking the paper in a pressure situation and worked on my temperament throughout the period. For this, 
				I first brushed up the concepts and then started the practice sessions, coming back to the concepts whenever I felt the need. 
				I did not take too many tests, a blunder many people do during CAT preparation, but focussed on analysing each and every paper 
				thoroughly. I also took self administered previous years' CAT papers and followed them up with analysis. This helped in steadying 
				my performance towards the end of the preparation period when I was able to get more or less similar scores in most of the tests I
				 took. I was also pretty confident of myself in the real CAT and was sure I could handle any kind of variation they might put in 
				 the paper.</p>
				<p><b>3.	Tips for Various Sections:</b></p>
				<p class="strategies">
				<i>a.	Reading Comprehension</i><br/><br/>
				RC is all about reading more and more, be it newspapers, 
				novels or internet articles to make yourself familiar with various styles 
				of writing and to improve your reading speed without compromising on comprehension. 
				Apart from that attempting the RC passages in the mocks you take and analysing your answers 
				to understand why your viewpoint differed from the actual answer is also important. Even if 
				you are not able to cover all the passages within the time limit for the mock, you should attempt 
				them later keeping appropriate time constraints. <br/><br/>
				
				<i>b. Verbal Ability</i><br/><br/>
				The VA part tests your foundation of grammar as well as vocabulary. Vocabulary can be improved by 
				doing a lot of reading, which may be combined with RC practice. But the important thing is to be on the 
				lookout for unfamiliar words and understanding their meaning as well as the various contexts in which 
				the word can be used. This is necessary because the same word can have different meanings in different 
				contexts. Your grammar can be tested directly in sentence correction/completion or in questions like 
				parajumbles, etc. For this you need to brush up the basics and identify the subtle variations that may 
				confuse you. This should be followed up with a lot of practice to build an instinctive ability to sense 
				anything wrong in a sentence. <br/><br/>

				<i>c.	Logical Reasoning</i><br/><br/>
				You can improve your logical reasoning ability by getting familiar with all the types of questions possible,
				 though there is a limit to the improvement. Search for some good books on logical reasoning and practice 
				 hard. Also cover all the questions in the mocks and previous CAT papers. <br/><br/>

				<i>d.	Data Interpretation</i><br/><br/>
				DI requires you to be good with numbers, in terms of interpretation ability as well as quick calculations. 
				So, improve upon these two qualities by solving sufficient number of problems and practising the various 
				shortcut techniques available for calculations. If you are not comfortable with the techniques, u may make 
				blunders in the CAT or may have to fall back upon the time taking regular calculation methods. <br/><br/>

				<i>e.	Quant</i><br/><br/>
				The first thing to do for quant is to be thorough with your concepts, as this is one section where your concepts 
				are really tested. Then you should improve your ability to apply the concepts by practising a lot. Fast calculation 
				ability will also come in handy for this section. <br/><br/>
				
				</p>
				<p><b>4.	CAT Course / Books that I followed</b></p>
				<p>Mainly Career Launcher and Time study material. </p>
				 <table width="100%"><tr><td align="right" width="100%">
				 <a href="strategies.htm?id=2">Previous</a> |
				 <a href="strategies.htm?id=4">Next</a>
				 </td></tr></table>
				<%
				break;
			case 4:
				%>
				<table width="100%"><tr><td align="left" width="100%">
				 <a href="strategies.htm?id=3">Previous</a> |
				 <a href="strategies.htm?id=1">Next</a>
				 </td></tr></table>
				<h3>Somesh Vajpayee</h3>
				<table class="strategies">
				<tr><td>Institute</td><td>IIM Indore</td></tr>
				<tr><td>Year of Graduation</td><td>2008</td></tr>
				<tr><td>Percentile</td><td>99.82</td></tr>
				</table>
				
				<p><b>1.	What does it take to crack the CAT?</b></p>
				<p class="strategies">Smart work. Nothing comes out of blindly studying for 10 hrs a day without sitting back and 
				thinking what you achieved in those hours and where you stand. Play by your strengths. Know your weaknesses. 
				If you cannot do a particular type of question then leave it. Remember you don't have to score 99% but 99 percentile. 
				Strong English is a must. Read as much as you can. If you cannot cultivate a reading habit then maybe CAT is not for you.</p>
				<p><b>2.	What was my strategy for CAT?</b></p>

				<p class="strategies">My quant was weak so worked hard enough on it to know I can clear the cut off. I was strong in English and DI so I made sure 
				I dint loose a single mark I could get there. I always kept in mind that the scoring is relative. If I am not able to do something 
				chances are most of the others are struggling.</p>
				<p><b>3.	Tips for Various Sections:</b></p>
				<p class="strategies">
				<i>a.	Reading Comprehension</i><br/><br/>
				Remembering as much as you can saves a lot of time. If you have to go refer the passage for everything then 
				it's a waste of time. While reading the passage itself you can form a broad structure of how the passage is written. 
				That would help in remembering the passage and answering most questions.<br/><br/> 
				
				<i>b.	Logical Reasoning</i><br/><br/>
				Pen and paper I guess. Forming a mental image of things is the best but if you are unable to do it in the beginning then start by 
				using the pen. Take down things, make boxes, connect them and the answer would come easily. Also if an LR problem is not solved by 
				a particular approach in the first try I would suggest leave it. Revisit it later. An LR problem can be the easiest way to waste 
				time in CAT.<br/><br/> 

				<i>c.	Data Interpretation</i><br/><br/>
				I always found that estimations help in DI. Instead of doing exact calculation go by rough estimates. It saves a lot of time. 
				Some questions in DI will have very close answers though. So take a look at the choices before you start solving. At times just 
				a look at the choices can point you towards the answer.<br/><br/>

				<i>d.	Quant</i><br/><br/>
				If you are good at it then you probably don't know English. So work
				on your English. If you are not good at it then practice enough and
				know enough to clear the cutoff.  <br/><br/>
				
				</p>
				<p><b>4.	CAT Course / Books that I followed</b></p>
				<p>Career Launcher Test series and material </p>
				 <table width="100%"><tr><td align="right" width="100%">
				 <a href="strategies.htm?id=3">Previous</a> |
				 <a href="strategies.htm?id=1">Next</a>
				 </td></tr></table>
				<%
				break;
		}
	%>
	
</div>
<div id="right-sidebar">
		<table class="sidebarLight" style="margin-top: 25px;">
		<tr><th>Advertisements</th></tr>
		<tr><td>
		<script type="text/javascript"><!--
		google_ad_client = "pub-2043647560365912";
		/* 120x600, skyscraper */
		google_ad_slot = "3227391044";
		google_ad_width = 120;
		google_ad_height = 600;
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
