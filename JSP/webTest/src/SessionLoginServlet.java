

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
		
		request.setCharacterEncoding("euc-kr");//��û������ ���ڵ�
		response.setContentType("text/html;charset=euc-kr");
		
		//���� ��Ʈ���� �ؽ�Ʈ ���
		PrintWriter out = response.getWriter();
		//��û���� ���� id�� �ش��ϴ� �Ķ���͸� ���
		//passward
		String id = request.getParameter("id");
		String passward = request.getParameter("password");
		
		//���̵� ����� �ԷµǸ�
		if(id.equals("java")&&passward.equals("java")){
			//���ǿ� �ѹ� ���� ��û�����ϱ�
			HttpSession session = request.getSession();
			session.setAttribute("id",id);
			//���� request������ ����� , RequestDispatcher ����ؼ� ������
			RequestDispatcher dispatcher = request.getRequestDispatcher("import.jsp");
			//��û,���信 dispatcher������
			dispatcher.forward(request,response);
			
			
		}else {
			out.println("<script>");
			out.println("alert('���̵� ��й�ȣ�� ��ġ���� �ʽ��ϴ�.')");
			out.println("history.back()");
			out.println("</script>");
			
		}
		
		
		
		
	}

}
