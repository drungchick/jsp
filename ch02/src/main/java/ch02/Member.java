package ch02;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Member
 */
@WebServlet("/Member")
public class Member extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Member() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("utf-8");
		doGet(request, response);
		
		String name = request.getParameter("name");
		String id = request.getParameter("id");
		String password = request.getParameter("password");
		String confirmPass = request.getParameter("confirmPass");
		String gender = request.getParameter("gender");
		String[] email = request.getParameterValues("email");
		String job = request.getParameter("job");
		
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		
		out.println("<html><body>");
		
		out.println("<h2>회원가입</h2>");
		
		out.println("이름 : " + name + "<p>");
		out.println("아이디 : " + id + "<p>");
		out.println("암호 : " + password + "<p>");
		out.println("암호확인 : " + confirmPass + "<p>");
		out.println("성별 : " + gender + "<p>");
		
		if (email == null) {
			out.println("메일 수신 거부<p>");
		} else {
			out.println("메일수신 : ");
			for (int i = 0; i < email.length; i++) {
				if (i == email.length - 1) {
					out.println(email[i] + "<p>");
				} else {
					out.println(email[i] + ", ");
				}
			}
		}
		
		if (job == "") {
			out.println("직업 선택 안 됨");
		} else {
			out.println("직업 : " + job + "<p>");
		}
		
		out.println("</body></html>");

		out.close();
	}

}
