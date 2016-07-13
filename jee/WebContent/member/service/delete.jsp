<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<% String ctx = application.getContextPath(); %>
<!doctype html>
<html lang="en">
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="<%=ctx %>/css/member.css" />
</head>
<body>

<div class="box">
<embed src="<%=ctx %>/img/star.gif">
<h1>탈퇴 페이지</h1>
<a href="<%=ctx %>/memberController.jsp">
<img src="<%=ctx %>/img/member.png" alt="member" style="width:30px" /></a>
<a href="<%=ctx %>/index.jsp">
		<img src="<%=ctx %>/img/home.png" alt="member" style="width:30px" />
		</a>

</div>
</body>
</html>