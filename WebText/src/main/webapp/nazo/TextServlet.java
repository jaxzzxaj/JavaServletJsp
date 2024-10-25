package servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class TextServlet
 */
@WebServlet("/TextServlet")
public class TextServlet extends HttpServlet {
	
	@Override 
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//リクエスト（これが欲しい！）
		request.setCharacterEncoding("UTF-8");
		String greeting = request.getParameter("hoge");
		//レスポンス（箱の中に詰めたよ！）
		response.setContentType("text/html;charset=UTF-8");

		PrintWriter xx = response.getWriter();
		xx.println("<html>");
		xx.println("<head><title></title></head>");
		xx.println("<body>");		
//		入力した文字列があるときを条件にする。
		if (greeting !=null) {

			
			for (int i=0; i <greeting.length(); i++) {
				xx.println(greeting.charAt(i)+"<br>");
			}  
		}else {
			xx.println("ボケたのかな？ハハッ(乾いた笑い）");
		}
		
		xx.println("<body>");
		xx.println("</html>");

	}

}
