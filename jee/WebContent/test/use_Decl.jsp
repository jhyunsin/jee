<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!doctype html>
<%!
 public int mulply(int a, int b){
	return a*b;
}
%>

<html lang="en">
<head>
	<meta charset="UTF-8" />
	<title>두 정수의 곱</title>
</head>
<body>
<% 
	int a = 3, b = 9; 
%>
<%= a %>	<%= b %> = <%= mulply(a,b) %>
</body>
</html>