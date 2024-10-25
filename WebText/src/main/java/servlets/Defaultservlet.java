package servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Defaultservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//リクエスト（これが欲しい！）
		request.setCharacterEncoding("UTF-8");
		String something1 =request.getParameter("hoge");
		//レスポンス（箱の中に詰めたよ！）
		response.setContentType("text/html;charset=UTF-8");

		PrintWriter xx =response.getWriter();
			xx.println("<html>");
			xx.println("<head><title></title></head>");
			xx.println("<body>");
			xx.println(something1);
			xx.println("<body>");
			xx.println("</html>");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//リクエスト（これが欲しい！）
		request.setCharacterEncoding("UTF-8");
		String something2 =request.getParameter("hoge");
		//レスポンス（箱の中に詰めたよ！）
		response.setContentType("text/html;charset=UTF-8");

		PrintWriter xx =response.getWriter();
			xx.println("<html>");
			xx.println("<head><title></title></head>");
			xx.println("<body>");
			xx.println(something2);
			xx.println("<body>");
			xx.println("</html>");
	}

}
