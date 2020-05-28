<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Attribute Test</title>
</head>
<body>
<h2>영역과 속성 테스트</h2>
<%
request.setCharacterEncoding("UTF-8");
String name=request.getParameter("name");
String id = request.getParameter("id");
if(name!=null&&id!=null){
	//속성에 저장하기
	application.setAttribute("name",name);
	application.setAttribute("id",id);
}
%>
<h3><%=name %>님 반갑습니다.<br>
ID=<%=id %>입니다.</h3>

<form action = "attributeTest2.jsp" method="post">
<table border="1">
<tr>
<td colspan="2">Session영역에 저장할 내용들</td>
</tr>
<tr>
<td>e-mail 주소</td>
<td><input type="text" name="email"></td>
</tr>
<tr>
<td>집 주소</td>
<td><input type="text" name="address"></td>
</tr>
<tr>
<td>전화번호</td>
<td><input type="text" name="number"></td>
<tr>
<td colspan="2"><input type="submit" value="전송"></td>
</tr>
</table>

</form>
</body>
</html>