

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/login") //http://localhost:8080/login으로 요청이오면 여기 서블릿 클래스에서 요청 처리
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//id,passwd 요청정보에서 받아오기
		String id = request.getParameter("id");
		String passwd = request.getParameter("passwd");
		//응답할때 text/html 형식으로 보내겟다; 응답되는 데이터들 한글처리
		response.setContentType("text/html;charset=UTF-8");
		//요청받은 정보를 토대로 출력하는 창
		//출력스트림 생성
		PrintWriter out = response.getWriter();
		out.println("아이디: "+id+"<br>");
		out.println("비밀번호:"+passwd+"<br>");
		
		
	}

}
