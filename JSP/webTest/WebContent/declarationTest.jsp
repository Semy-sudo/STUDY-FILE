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
	str+="�׽�Ʈ �Դϴ�.";
	return str;
}
private String str="����";
%>
</body>
</html>