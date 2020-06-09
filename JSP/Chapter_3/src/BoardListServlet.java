

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class BoardListServlet
 */
@WebServlet("/boardList")
public class BoardListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BoardListServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//Ŭ���̾�Ʈ���� ��û�Ҷ� �Ѿ�� �������� �����ϱ�
		String page = request.getParameter("page");
		//����Ҷ� ��ļ����ϱ� text/html ���;�ѱ��� ���ڵ�
		response.setContentType("text/html;charset=euc-kr");
		//��½�Ʈ�� �����
		PrintWriter out = response.getWriter();
		out.println(page+"������ �Դϴ�.");
	}


}
