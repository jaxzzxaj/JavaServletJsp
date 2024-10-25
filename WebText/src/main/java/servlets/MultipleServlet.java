package servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MultipleServlet
 */
@WebServlet("/MultipleServlet")
public class MultipleServlet extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		リクエスト
		request.setCharacterEncoding("UTF-8");
//		仮説１　箱を２つ作る
		String num1s = request.getParameter("inputnum1");
		String num2s = request.getParameter("inputnum2");
//		どうしてしたのは出力するときintにならないのだろう？
		
		int num1 = Integer.parseInt(num1s);
		int num2 = Integer.parseInt(num2s);
		int result = num1*num2;
		
//		仮説２　配列にしてlengthで振り分ける
//		String multi = request.getParameter("hoge3");
		
//		レスポンス
		response.setContentType("text/html;charset=UTF-8");
		
		PrintWriter xx =response.getWriter();
		xx.println("<html>");
		xx.println("<head><title>計算結果</title></head>");
		xx.println("<body>");
		xx.println("<h2>計算してあげたよ</h2>");
		xx.println(num1s+"×"+num2s+"="+result);
		xx.println("</body>");
		xx.println("</html>");
	 }

}
