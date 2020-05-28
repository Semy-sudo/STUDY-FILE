<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Forward Action Test</title>
</head>
<body>
<h2>포워드 액션 테스트</h2>
<form action ="forwardTest1.jsp" method="POST">
<input type="hidden" name="forwardPage" value="forwardTest2.jsp"> <!-- hidden타입은 특정파라메터값을 직접지정해 전송할떄 사용 -->
<table>
<tr>
<td>이름</td>
<td><input type="text" name="name" ></td>
</tr>
<tr>
<td>나이</td>
<td><input type="text" name="age"></td>
</tr>
<tr>
<td>주소</td>
<td><input type="text" name="address"></td>
</tr>
<tr>
<td><input type="submit" name="submit" value="전송"></td></tr>


</table>



</form>
</body>
</html>