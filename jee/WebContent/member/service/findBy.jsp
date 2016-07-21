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
iframe.ifrm{border:none;width: 400px; height:400px}
</style>

</head>
<body>
<div class="box">


<h1>정보검색</h1>
<iframe src="image.jsp" class="ifrm" style="border:none;"></iframe>
<a href="<%=ctx %>/member/member_controller.jsp"><br /><br />
<img src="<%=ctx %>/img/member.png" alt="member" style="width:30px" /></a>

<a href="<%=ctx %>/index.jsp">
		<img src="<%=ctx %>/img/home.png" alt="member" style="width:30px" />
		</a>

</div>
</body>
</html>