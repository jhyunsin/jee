<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
      <% String ctx = application.getContextPath(); %>
<!doctype html>
<html lang="en">
<head>
	<meta charset="UTF-8" />
	<title>Document</title>
<link rel="stylesheet" href="<%=ctx %>/css/member.css" />
<style type="text/css">
span.meta{width:200px;background-color: yellow; float:left}
div.joinDiv{border:1px dotted gray;width:80%; margin:10px 50px 10px 50px;}
</style>
</head>
<body>
	<br/><br/><br/>
	<div class="box">
	<form action="<%=ctx %>/member/result/regist_result.jsp" method="post">
	<span class="meta">	이름  </span><input type="text" name="name"/><br/>
	<span class="meta">	ID </span> <input type="text" name="id"/><br/>
	<span class="meta">	비밀번호 </span> <input type="text" name="pw"/><br/>
	<span class="meta">	SSN  </span><input type="text" name="ssn"/><br/>

	<span class="meta"> 전공  </span><br/><br/>
		<input type="radio" name="major" value="computer"checked/>컴공학부
		<input type="radio" name="major" value="mgmt"/>경영학부
		<input type="radio" name="major" value="math"/>수학부
		<input type="radio" name="major" value="eng"/>영문학부<br/><br/><br/>
	
	<span class="meta"> 수강과목 </span><br/><br/>
		<input type="checkbox" name="subject" value="java"/>Java
		<input type="checkbox" name="subject" value="sql"/>SQL
		<input type="checkbox" name="subject" value="cpp"/>C++
		<input type="checkbox" name="subject" value="python"/>파이썬
		<input type="checkbox" name="subject" value="delphi"/>델파이
		<input type="checkbox" name="subject" value="html"/>HTML
		<br/><br/>
		<input type="submit"  value="회원가입"/>
		<input type="reset"  value="취소"/>
	</form>

	</div>
</body>
</html>