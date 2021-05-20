package ch02;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Ome
 */
@WebServlet("/Ome")
public class Ome extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Ome() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
//		request.setCharacterEncoding("utf-8");
//		
////		String menu = request.getParameter("menu");
//		String[] menu = request.getParameterValues("menu");
//		response.setContentType("text/html;charset=utf-8"); 
//		PrintWriter out = response.getWriter();
//		
//		out.println("<html><body>");
//		out.println("<h2>오늘의 메뉴</h2>");
////		out.println("메뉴 : " + menu);
//		for(int i = 0; i < menu.length; i++) {
//			if(i == menu.length -1) {
//				out.println(menu[i]);
//			} else {
//				out.println(menu[i] + ", ");
//			}
//		}
//		out.println("</body></html>");
//		
//		out.close();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("utf-8");
		doGet(request, response);

//		String menu = request.getParameter("menu");
		String[] menu = request.getParameterValues("menu");
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();

		out.println("<html><body>");
		out.println("<h2>오늘의 메뉴</h2>");
		if (menu == null) {
			out.println("점심 굶을 거야.");
		} else {
//		out.println("메뉴 : " + menu);
			for (int i = 0; i < menu.length; i++) {
				if (i == menu.length - 1) {
					out.println(menu[i]);
				} else {
					out.println(menu[i] + ", ");
				}
			}
		}
		out.println("</body></html>");

		out.close();
	}

}
