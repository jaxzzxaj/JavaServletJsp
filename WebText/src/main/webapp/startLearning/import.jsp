<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!--インポート宣言-->
<%@ page import ="java.util.List" %>
<%@ page import ="java.util.ArrayList" %>
<!--インポート宣言-->
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>インポート</title>
</head>
<body>
<%
	List<String>list = new ArrayList<String>();
	list.add("あかさたな");
	list.add("ABCDE");
	list.add("abcde");
	for (int i = 0; i <list.size(); i++){
%>
<%= list.get(i) %><br>
<%
	}
%>
</body>
</html>