package servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	@Override	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String pswd = request.getParameter("password");
		
	if("pswd" .equals(pswd)) {
		HttpSession yy = request.getSession(true);
		yy.setAttribute("password",pswd);
		response.sendRedirect("./startLearning/secret.jsp");
	}else {
		request.setAttribute("errorr", "WRONG PASSWORD!TRY AGAIN");
		
	}
	}

}
