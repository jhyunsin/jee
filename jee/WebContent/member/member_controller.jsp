<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
          <% String ctx = application.getContextPath(); %>
<!doctype html>
<html lang="en">
<head>
	<meta charset="UTF-8" />
	<title>Insert title here</title>
<link rel="stylesheet" href="<%=ctx %>/css/member.css" />
<style>
div.memberClass{font-size: x-large;}
  </style>
</head>
<body>
	<div id="" class="memberClass box">
		
		<h1>회원관리</h1><br />
		<div style="width: 300px; margin: 0 auto; text-align: left;">

		<ol>
			<li><a href="service/regist.jsp">회원가입</a></li>
			<li><a href="service/findById.jsp">내정보보기</a></li>
			<li><a href="service/update.jsp">내정보수정(비번)</a></li>
		  	<li><a href="service/delete.jsp">탈퇴..</a></li>
			<li><a href="service/login.jsp">로그인</a></li>
			<li><a href="service/list.jsp">리스트</a></li>
			<li><a href="service/findBy.jsp">검색(이름)</a></li>
			<li><a href="service/count.jsp">회원수</a></li>
		</ol>
		</div>

		<a href="<%=ctx%>/memberController.jsp"><br />
		<br /> <img src="<%=ctx%>/img/member.png" alt="member"
			style="width: 30px" /></a> <a href="<%=ctx%>/index.jsp"> <img
			src="<%=ctx%>/img/home.png" alt="member" style="width: 30px" />
		</a>

	</div>
	
</body>
</html>