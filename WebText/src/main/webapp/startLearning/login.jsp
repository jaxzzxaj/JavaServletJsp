<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>USER PAGE</title>
</head>
<body>
	<%
	String errorrr = (String) request.getAttribute("error");
	if(errorrr !=null){
	%>
	<font color="#FF0040"><%= errorrr %></font>
	<%
	}
	%>
	<b>TYPE YOUR PASSWORD</b>
	<form action="./servlets/LoginServlet">
		<input type="password" name="password"> 
		<input type="submit"value="ログイン">
	</form>
</body>
</html>