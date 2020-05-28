<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<h1><%=getStr() %></h1>
<%!
private String getStr(){
	str+="테스트 입니다.";
	return str;
}
private String str="선언문";
%>
</body>
</html>