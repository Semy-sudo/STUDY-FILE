
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%
	String id = (String)session.getAttribute("id");
%>
<body>
<%
	if(id == null){
%>
<a href="login.jsp">�α���</a>
<%
	}
	else{
%>	
	<%=id  %>�� ȯ���մϴ�.
<%
	}
%>		
	
</body>