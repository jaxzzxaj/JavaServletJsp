package servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ForwardServlet2
 */
@WebServlet("/ForwardServlet2")
public class ForwardServlet2 extends HttpServlet {
	
@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//	リクエスト
	request.setAttribute("message", "そろそろなれたかな？");
	RequestDispatcher rd = request.getRequestDispatcher("./startLearning/forward2.jsp");
	rd.forward(request, response);
	}

}
