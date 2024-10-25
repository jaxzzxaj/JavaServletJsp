package servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CountDownServlet
 */
@WebServlet("/CountDownServlet")
public class CountDownServlet extends HttpServlet {
		protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			request.setCharacterEncoding("UTF-8");
			response.setContentType("text/html;charset=UTF-8");
			
			PrintWriter nn = response.getWriter();
			nn.println("<html>");
			nn.println("<head><title>カウントダウン</title></head>");
			nn.println("<body>");
			for(int i = 10; 0 <=i ; i--) {
				nn.println(10-i);
				nn.println("<br>");
				
			}
			nn.println("</body>");
			nn.println("</html>");
			
		}
}
