package servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MonthServlet
 */
@WebServlet("/MonthServlet")
public class MonthServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
	/**
	 *
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		リクエスト
		request.setCharacterEncoding("UTF-8");
		String num = request.getParameter("number");
		int nn = Integer.parseInt(num);
//		レスポンス
		response.setContentType("text/html;charset=UTF-8");
		
		PrintWriter xx =response.getWriter();
		xx.println("<html>");
		xx.println("<head><title></title></head>");
		xx.println("<body>");

//		偶数の場合
		if(nn % 2==0) {
			xx.println( nn +"<b>月</b><br><b>偶数月です。</b>");
		}else if (nn % 2 !=0) {
			xx.println( nn +"<b>月</b><br><b>奇数月です。</b>");
		}else if (12 < nn) {
			xx.println( nn +"<b>月</b><br><b>範囲外です。</b>");
//		}else if (nn == null) {
//			xx.println("<b>入力してください</b>")
//		}else if () {
//			xx.println( nn +"<b>整数を入力してください。</b>")
//		}
		
		xx.println("</body>");
		xx.println("</html>");
		}


	}}
