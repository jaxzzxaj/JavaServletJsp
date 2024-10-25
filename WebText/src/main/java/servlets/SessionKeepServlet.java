package servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class SessionKeepServlet
 */
@WebServlet("/SessionKeepServlet")
public class SessionKeepServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//	リクエストされないとレスポンスできないはずなのに、レスポンスができるのだろう？？
		
//	レスポンス
		response.setContentType("text/html;charset=UTF-8");
		
		PrintWriter xx = response.getWriter();
		HttpSession yy = request.getSession(false);
		if (yy != null) {
			xx.println("あなたのセッションID"+yy.getId());
		}else {
			xx.println("セッションが生成されていません");
		}
	}

}
