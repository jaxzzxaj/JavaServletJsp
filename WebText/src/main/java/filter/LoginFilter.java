package filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebFilter("/startLearning/user.jsp")
public class LoginFilter extends HttpFilter implements Filter {
	@Override
	public void destroy() {}
	
	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
	HttpServletRequest hsrt = (HttpServletRequest) request;
	HttpSession xx = hsrt.getSession(true);
	
	if(xx.getAttribute("password")!=null) {
		chain.doFilter(hsrt, response);
	}else {
		HttpServletResponse hsre =(HttpServletResponse) response;
		hsre.sendRedirect("./startLearning/loginError.jsp");
	}
		
	}
	@Override
	public void init(FilterConfig config) throws ServletException{}
	
	
}
