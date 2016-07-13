<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <% String ctx = application.getContextPath(); %>
<!doctype html>
<html lang="en">
<head>
<meta charset="UTF-8">
<title>상세보기</title>
<link rel="stylesheet" href="<%=ctx %>/css/member.css" />
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
		<h1>회원상세정보</h1>
		
		<table id="member_detail">
			<tr>
				<td rowspan="3" style="width:30%">
				<img src="<%=ctx %>/img/w3schools.jpg" alt="W3Schools.com" width="104"
			height="142"></td>
				<td style="width:20%" class="font_bold bg_color_yellow">ID</td>
				<td style="width:40%"></td>
			</tr>
			<tr>
				
				<td class="font_bold bg_color_yellow">이 름</td>
				<td></td>
			</tr>
			<tr>
				
				<td class="font_bold bg_color_yellow">성 별</td>
				<td></td>
			</tr>
			<tr>
				<td class="font_bold bg_color_yellow">생년월일</td>
				<td colspan="2"></td>
			</tr>
			<tr>
				<td class="font_bold bg_color_yellow">등록일</td>
				<td colspan="2"></td>
				
			</tr>
		</table>
		
		
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