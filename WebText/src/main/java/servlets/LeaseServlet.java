package servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LeaseServlet
 */
@WebServlet("/LeaseServlet")
public class LeaseServlet extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		リクエスト
		request.setCharacterEncoding("UTF-8");
		String box1 = request.getParameter("price");
		String[] box2 = request.getParameterValues("needs");		
//		レスポンス
		response.setContentType("text/html;charset=UTF-8");
		
		PrintWriter xx =response.getWriter();
		xx.println("<html>");
		xx.println("<head><title></title></head>");
		xx.println("<body>");
		
		if(box1 !=null && box2 !=null) {
			xx.println("<h1>賃料：</h1>");
			xx.println("<b>"+box1+"</b>");
			xx.println("<h2>詳細条件：</h2>");
			for(int i = 0; i <= box2.length; i++) {
				xx.println("<b>"+box2[0]+"<br></b>");
				xx.println("<b>"+box2[1]+"<br></b>");
				xx.println("<b>"+box2[2]+"<br></b>");
				xx.println("<b>"+box2[3]+"<br></b>");
				xx.println("<b>"+box2[4]+"<br></b>");
			}
		}else if(box1 == null && box2 != null) {
			xx.println("<h1>賃料：</h1>");
			xx.println("<b>未選択</b>");
			xx.println("<h2>詳細条件：</h2>");
			for(int i = 0; i <= box2.length; i++) {
				xx.println("<b>"+box2[0]+"<br></b>");
				xx.println("<b>"+box2[1]+"<br></b>");
				xx.println("<b>"+box2[2]+"<br></b>");
				xx.println("<b>"+box2[3]+"<br></b>");
				xx.println("<b>"+box2[4]+"<br></b>");
			}
		}else if(box2 == null && box1 != null) {
			xx.println("<h1>賃料：</h1>");
			xx.println("<b>"+box1+"</b>");
			xx.println("<h2>詳細条件：</h2>");
			xx.println("<b>未選択</b>");
		}else {
			xx.println("<h1>賃料：</h1>");
			xx.println("<b>未選択</b>");
			xx.println("<h2>詳細条件：</h2>");
			xx.println("<b>なし</b>");
		}
		
		xx.println("</body>");
		xx.println("</html>");
	}

}
