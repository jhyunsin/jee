<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!doctype html>
<html lang="en">
<head>
	<meta charset="UTF-8" />
	<title>Implicit object : request</title>
</head>
<body>
<!-- 리퀘스트는 무조건 게터 -->	
요청 URI : <%=request.getRequestURI() %><br>
컨텍스트 경로 : <%= request.getContextPath() %>
</body>
</html>