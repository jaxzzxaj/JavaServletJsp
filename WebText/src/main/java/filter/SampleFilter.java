package filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;


@WebFilter("/helloservlet")
	
	public class SampleFilter  implements Filter {
    
	@Override
	public void destroy() {}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
//		津愛でいるサーブレットに設定が施されているのなら書かなくてもよい↓
//		request.setCharacterEncoding("UTF-8");
		System.out.println("前処理実行");
		chain.doFilter(request, response);
		System.out.println("後処理実行");
	}
	
	@Override
	public void init(FilterConfig fConfig) throws ServletException {}

}
