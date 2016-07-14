<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!doctype html>
<html lang="en">
<head>
	<meta charset="UTF-8" />
	<title>한빛아카데미</title>
<style type="text/css">

</style>
<style>
#header {
	background-color: black;
	color: white;
	text-align: center;
	padding: 5px;
}
#section {
	width: 350px;
	float: left;
	padding: 10px;
}

#footer {
	background-color: black;
	color: white;
	clear: both;
	text-align: center;
	padding: 5px;
}

ul {
	list-style-type: none;
	margin: 0;
	padding: 0;
	overflow: hidden;
	background-color: #333;
}

#nav li {
	float: left;
	border-right: 1px solid #bbb;
}

#nav li:last-child {
	border-right: none;
}

#nav li a {
	display: block;
	color: white;
	text-align: center;
	padding: 14px 16px;
	text-decoration: none;
}

#nav li a:hover:not (.active ) {
	background-color: #111;
}

.active {
	background-color: #4CAF50;
}
</style>

</head>
<body>
	hello JSP !!
	
	
	<br />


	<div id="header">
		<h4>학생관리시스템[Student Management System]</h4>
	</div>

	<div id="nav">
		<ul>
			<li><a class="active" href="../member/member_controller.jsp">회원관리</a>
			</li>
			<li><a href="#">성적관리</a></li>
			<li><a href="#">계좌관리</a></li>
			<li><a href="school_info.jsp">신입생교육영상보기</a></li>
		</ul>
	</div>

	<div id="section">
		<h2>회원관리</h2>
		<p>London is the capital city of England. It is the most populous
			city in the United Kingdom, with a metropolitan area of over 13
			million inhabitants.</p>
		<p>Standing on the River Thames, London has been a major
			settlement for two millennia, its history going back to its founding
			by the Romans, who named it Londinium.</p>
	</div>

	<div id="footer">Copyright � W3Schools.com</div>
	
</body>
</html>
