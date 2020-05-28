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
<%
//form 에서 action 태그로 여기서 요청정보처리
request.setCharacterEncoding("UTF-8");
String email= request.getParameter("email"); //email 에 입력된거 찾아옴
String address= request.getParameter("address");
String Phonenumber= request.getParameter("number");
//session에 저장
session.setAttribute("email",email);//해당영역(session)에 email 값의 이름으로 email 객체 저장 
session.setAttribute("address",address);
session.setAttribute("number",Phonenumber);

String name = (String)application.getAttribute("name");

%>
<h3><%=name %>님의 정보가 모두 저장되었습니다.</h3>
<a href="attributeTest3.jsp">확인하러 가기</a>
</body>
</html>