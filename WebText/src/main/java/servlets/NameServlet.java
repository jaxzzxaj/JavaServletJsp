package servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/NameServlet")
public class NameServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			request.setCharacterEncoding("UTF-8");
			String ww = request.getParameter("name");
			response.setContentType("text/html;charset=UTF-8");
			
			PrintWriter xx = response.getWriter();
			xx.println("<html>");
			xx.println("<head><title>名前表示画面</title></head>");
			xx.println("<body>");
			xx.println("こんにちは！"+ ww +"さん！");
			xx.println("</body>");
			xx.println("</html>");
			}

}
