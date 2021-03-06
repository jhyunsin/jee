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
<style>
#member_detail{border: 1px solid gray;width:100%;height:400px;margin:0 auto; border-collapse: collapse;}
#member_detail tr{border: 1px solid gray;hetigh:20%}
#member_detail tr td{border: 1px solid gray;}
.font_bold{font-weght:bold;}
.bg_color_yellow{background-color: yellow}
</style>
</head>
<body>
<!-- //id, name, ssn, birth, regDate, gender, proImg -->
<div class="box">
		<h1>업데이트</h1>
		<%
		MemberService service = MemberServiceImpl.getInstance();
		MemberBean member = new MemberBean();
		
		if(service.show() == null){
			%>
			<h1>로그인을 해주세요.</h1>
			<%
		} else {
		%>		
		
		
		<table id="member_detail">
				<tr>
				<td rowspan="5" style="width:30%">
				<img src="<%=ctx %>/img/member/<%=service.show().getProImg() %>" alt="W3Schools.com" width="104"
			height="142"></td>
				<td style="width:20%" class="font_bold bg_color_yellow">ID</td>
				<td style="width:40%"><%= service.show().getId() %></td>
			</tr>
			<tr>
				
				<td class="font_bold bg_color_yellow">이 름</td>
				<td><%= service.show().getName() %></td>
			</tr>
			<tr>
				
				<td class="font_bold bg_color_yellow">비밀번호</td>
				<td><input type="text" name="pw" value= "<%= service.show().getPw() %>" /></td>
				
			</tr>
			<tr>
				
				<td class="font_bold bg_color_yellow">성 별</td>
				<td><%= service.show().getGender() %></td>
			</tr>
			<tr>
				<td class="font_bold bg_color_yellow">이메일</td>
				<td><input type="text" name="pw" value= "<%= service.show().getEmail() %>" /></td>
				
			</tr>
			<tr>
				<td class="font_bold bg_color_yellow">생년월일</td>
				<td colspan="2"><%= service.show().getSsn() %></td>
			</tr>
			<tr>
				<td class="font_bold bg_color_yellow">등록일</td>
				<td colspan="2"><%= service.show().getEmail() %></td>
				
			</tr>
		</table>
		
		<%
		}
		%>
		<br /> 
		<p>
			
		</p>
		<a href="<%=ctx %>/memberController.jsp">
<img src="<%=ctx %>/img/member.png" alt="member" style="width:30px" /></a>
<a href="<%=ctx %>/index.jsp">
		<img src="../../img/home.png" alt="member" style="width:30px" />
		</a>

	</div>
</body>
</html>