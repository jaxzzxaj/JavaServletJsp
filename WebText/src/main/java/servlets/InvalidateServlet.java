package servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class InvalidateServlet
 */
@WebServlet("/InvalidateServlet")
public class InvalidateServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	HttpSession xx = request.getSession(false);
	if(xx !=null) {
		xx.invalidate();
		}
	RequestDispatcher rd = request.getRequestDispatcher("./startLearning/session1.jsp");
	rd.forward(request, response);
	}

}
