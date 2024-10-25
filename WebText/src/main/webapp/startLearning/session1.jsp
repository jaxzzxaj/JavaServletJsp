<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>セッション１</title>
</head>
<body>
<%
	String r = (String)request.getAttribute("reqValue");
	String s = (String)session.getAttribute("sesValue");
%>

	<b>リクエスト：</b><%= r %><br>
	<b>セッション：</b><%= s %><br>
	<a href ="session2">セッション２へ</a>
	 </body>
</html>