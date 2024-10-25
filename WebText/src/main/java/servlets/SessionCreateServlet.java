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
 * Servlet implementation class SessionCreateServlet
 */
@WebServlet("/SessionCreateServlet")
public class SessionCreateServlet extends HttpServlet {
//	Jspで発火した何かがリクエストをしてサーバがそのリクエストを受け取った状態でdoGetが呼びだされる
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//	レスポンス
		response.setContentType("text/html;charset=UTF-8");
		
		PrintWriter xx = response.getWriter();
		HttpSession yy = request.getSession(false);
		if (yy !=null) {
			yy.invalidate();
			xx.println("セッションを破棄しました");
			}else {
				xx.println("セッションが存在していない");
			}
		}
		}
