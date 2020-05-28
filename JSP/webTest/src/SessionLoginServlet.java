

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class SessionLoginServlet
 */
@WebServlet("/sessionLogin")
public class SessionLoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SessionLoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("euc-kr");//요청받을때 인코딩
		response.setContentType("text/html;charset=euc-kr");
		
		//응답 스트림에 텍스트 기록
		PrintWriter out = response.getWriter();
		//요청으로 들어온 id에 해당하는 파라미터를 기록
		//passward
		String id = request.getParameter("id");
		String passward = request.getParameter("password");
		
		//아이디가 제대로 입력되면
		if(id.equals("java")&&passward.equals("java")){
			//세션에 한번 들어온 요청저장하기
			HttpSession session = request.getSession();
			session.setAttribute("id",id);
			//같은 request영역에 저장됨 , RequestDispatcher 사용해서 포워딩
			RequestDispatcher dispatcher = request.getRequestDispatcher("import.jsp");
			//요청,응답에 dispatcher보내기
			dispatcher.forward(request,response);
			
			
		}else {
			out.println("<script>");
			out.println("alert('아이디나 비밀번호가 일치하지 않습니다.')");
			out.println("history.back()");
			out.println("</script>");
			
		}
		
		
		
		
	}

}
