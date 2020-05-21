

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HangulServlet
 */
@WebServlet("/hangul")
public class HangulServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HangulServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("name");
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		out.println("hangual Process="+name);
	}
	
    
	protected void doPost(HttpServletRequest request,HttpServletResponse response) throws ServletException, 
	IOException {
		//post 방식으로 는 request 객체의 setCharacterEncoding 메소드 사용하여request객체의 body 영역에서 인코딩 변경
		request.setCharacterEncoding("UTF-8");
		
		String name = request.getParameter("name");
		response.setContentType("text/html;charset=euc-kr");
		PrintWriter out = response.getWriter();
		out.println("hangual Process="+name);
		
		
		
	}
	
	
	
	
	
	
	
	
	

}
