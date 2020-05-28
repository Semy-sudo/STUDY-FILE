<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>영역과 속성 테스트</h2>
<table border="2">
<tr>
<td colspan="2">Appilcation 영역에 저장된 내용들</td>
</tr>
<tr>
<td>이름</td>
<td><%=application.getAttribute("name")%></td>
</tr>
<tr>
<td>아이디</td>
<td><%=application.getAttribute("id") %></td>
</tr>
</table>

</br></br>

<table border="2">
<tr>
<td>address</td>
<td><%=session.getAttribute("address") %></td>
</tr>
<tr>
<td>tel</td>
<td><%=session.getAttribute("tel") %></td>
</tr>
<tr>
<td>email</td>
<td><%=session.getAttribute("email") %></td>
</tr>

</table>

</body>
</html>