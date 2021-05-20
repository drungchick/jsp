package ch02;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Num")
public class Num extends HttpServlet {
	private static final long serialVersionUID = 1L;
// 실행은 html에서
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
//		request.getParameter("num")는 문자로 되므로 숫자로 변경이 필요
		int num = Integer.parseInt(request.getParameter("num"));
		int sum = 0;
		for (int i = 1; i <= num; i++) {
			sum += i;
		}
		response.setContentType("text/html;charset=utf-8"); // 이거 빼먹으면 한글 깨짐.
		PrintWriter out = response.getWriter();
		out.println("<html><body>");
		out.println("1 ~ " + num + " 까지의 합 : " + sum);
		out.println("</body></html>");
		out.close();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
}