<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.util.*"%>
<%@include file="login.jsp"%>

<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<h1>���� �ð���<%=new SimpleDateFormat().format(new Date()) %>�Դϴ�.</h1>
<%@include file="login.jsp" %>
</body>
</html>