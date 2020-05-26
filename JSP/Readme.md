## PrintWriter out = response.getWriter();
응답으로 내보낼 출력 스트림을 얻어낸후
## out.println("<script>")
이런식으로 텍스트 기록

## HTTPSession 객체
* HTTP 프로토콜은 비연결형 프로토콜 (연결-> 요청-> 응답-> 종료)
* 연속적인 사용자 정보가 보관되지 않음 ex)로그인 상태, 장바구니...

 * 해결방안
   -> 각각의 클라이언트를 구분 -> 쿠키와 세션으로 해결


쿠키|세션|
---|---|
브라우저를 통해 클라이언트에 저장되는 사용자 정보|사용자 정보를 서버에 저장|
1.(name,value)쌍|1.클라이언트 최초접속시 새로운 새션을 생성하고 ID전송|
2.초기 웹서버에 의해 HTTP Header에 포함되어 클라이언트에게 전송|2.이후 접속마다 클라이언트가 세션 ID 재전송|
3.이후에 접속마다 클라이언트가 웹 서버에게 재전송|3.서버는 세션 ID에 해당하는 세션 정보를 획득|
4.보안적 취약성으로 인해 중요 정보를 저장하지 않아야함|4.세션 ID 전송 수단으로 쿠키를 사용할 수 있음|

## HTTPSession session = request.getSession();
servlet 은 request로 부터 HttpSession 객체를 제공받음

* 생성된 세션이 없었던 경우
 ** Container 에 의해 처리
 ** 새로운 세션 ID 생성
 ** 세션 ID를 클라이언트에게 보낼 준비
 ** 새로운 HttpSession 객체 생성 후 Servlet 에 제공
 
* 기존 세션이 있는 경우
 ** Request에 포함된 세션 ID에 해당하는 HttpSession객체를 찾아서 제공
