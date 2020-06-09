<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@ page import="java.util.Enumeration" %>
<html>
<head>
<meta charset="UTF-8">
<title>Config Test</title>
</head>
<body>
<h2>config 테스트</h2>
<table border="1">
<tr>
<td>초기 파라미터 이름</td>
<td>초기 파라미터 값</td>
</tr>
<%
Enumeration e = config.getInitParameterNames();  
//config 객체: jsp클래스가 서블릿으로 변환되어 서블릿인스턴스가 생성될때
//참조해야할 초기 설정 정보저장해 놓은 객체
while(e.hasMoreElements()){
	String init_paramName = (String)e.nextElement();
	%>
	<tr>
	<td><%=init_paramName %></td>
	<td><%=config.getInitParameter(init_paramName) %></td>
	</tr>
	<% 
}
%>

</table>
</body>
</html>