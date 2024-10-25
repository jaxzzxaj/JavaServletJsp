package servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ForwardServlet
 */
@WebServlet("/ForwardServlet")
public class ForwardServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//nazo(解決：../と./の違いは二つ上の階層と１つ上の階層の違い！✨
	RequestDispatcher rd =request.getRequestDispatcher("./startLearning/forwardd.jsp");
	
	
//	RequestDispatcherの取得有無
		rd.forward(request, response);

	}
}
