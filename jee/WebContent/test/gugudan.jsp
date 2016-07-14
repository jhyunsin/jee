<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<% 
	int i=0,j=0;
	for ( i = 1; i < 10; i++) {
		for (j = 2; j < 6; j++) {
			%>	
			<%= j%>*<%= i%>=<%= i*j %> &nbsp;&nbsp;
		<%} %>
	<br />
	<% }%>
<p></p>
<p></p>
<%  
	for ( i = 1; i < 10; i++) {
		for (j = 6; j < 10; j++) {
			%>	
			<%= j%>*<%= i%>=<%= i*j %> &nbsp;&nbsp;
		<% }%>
	<br />
	<% }%>
	


</body>
</html>