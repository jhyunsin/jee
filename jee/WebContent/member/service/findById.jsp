<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <% String ctx = application.getContextPath(); %>
<!doctype html>
<html lang="en">
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="<%=ctx %>/css/member.css" />
<style>
body {
	background-color: yellow;
}

h1 {
	color: blue;
}

p {
	color: red;
}
</style>
</head>
<body>
	<div style="width: 100%; height=200px margin: 0 auto; text-align: center;">
		<embed width="100%" height="500px" src="../../global/school_info.html">
		<h1>이름으로검색 페이지</h1>
		<br /> <img src="<%=ctx %>/img/w3schools.jpg" alt="W3Schools.com" width="104"
			height="142">
		<p>
			
		</p>
<a href="<%=ctx %>/member/member_controller.jsp">
<img src="<%=ctx %>/img/member.png" alt="member" style="width:30px" /></a>
<a href="<%=ctx %>/index.jsp">
		<img src="<%=ctx %>/img/home.png" alt="member" style="width:30px" />
		</a>


	</div>
</body>
</html>