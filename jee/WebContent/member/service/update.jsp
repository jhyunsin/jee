<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="member.MemberServiceImpl" %>
    <%@ page import="member.MemberService" %>
    <%@ page import="member.MemberBean" %>
<% String ctx = application.getContextPath(); %>
<!doctype html>
<html lang="en">
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="../../css/member.css" />
</head>
<body>
<div class="box">

<h1>정보수정 페이지 </h1>

<form action="<%=ctx %>/member/result/update_result.jsp" method="post">
	<span class="meta">	ID </span> <input type="text" name="id"/><br/>
	<span class="meta">	새비밀번호 </span> <input type="password" name="newPw"/><br/>
	
		<br/><br/><br/>
		<input type="submit"  value="확인"/>
		<input type="reset"  value="취소"/>
	</form>
	
<a href="<%=ctx %>/memberController.jsp">
<img src="<%=ctx %>/img/member.png" alt="member" style="width:30px" /></a>
<a href="<%=ctx %>/index.jsp">
		<img src="<%=ctx %>/img/home.png" alt="member" style="width:30px" />
		</a>


</div>
</body>
</html>