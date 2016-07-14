<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!doctype html>
<html lang="en">
<head>
	<meta charset="UTF-8" />
	<title>Document</title>
</head>
<body>

<% 	int i = 0,sum=0;
	for ( i = 1; i <= 10; i++) {
		sum+=i;
%>
<%= i %> +	
<% 	
} 
%>	
= <%= sum %>

<br/><br/><br/><br/>

<% 
int sum2 = 0;
for ( i = 1; i <= 10; i++) {
if (i<10) { 	
	%>
		<%= i %>+<% 
		sum2+=i;
	}else{%>
		<%= i %> <% 
	sum2+=i;
	}
		
		
		
	}%>
=<%= sum2 %>



</body>
</html>
