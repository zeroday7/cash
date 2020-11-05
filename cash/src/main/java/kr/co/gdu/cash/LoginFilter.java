package kr.co.gdu.cash;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebFilter(urlPatterns = "/admin/*")
public class LoginFilter implements Filter {
	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		System.out.println("login filter 실행.....");
		HttpSession session = ((HttpServletRequest)request).getSession();
		if(session.getAttribute("loginId") == null) {
			((HttpServletResponse)response).sendRedirect("/login");
			return;
		}
		chain.doFilter(request, response);
	}
}
