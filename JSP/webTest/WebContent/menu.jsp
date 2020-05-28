
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%
	String id = (String)session.getAttribute("id");
%>
<body>
<%
	if(id == null){
%>
<a href="login.jsp">로그인</a>
<%
	}
	else{
%>	
	<%=id  %>님 환영합니다.
<%
	}
%>		
	
</body>