package com.snimmo.demo.web.filter;

import java.io.IOException;

import javax.faces.bean.SessionScoped;
import javax.servlet.DispatcherType;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.snimmo.demo.web.model.User;

@WebFilter(urlPatterns="*.html", 
		dispatcherTypes = {DispatcherType.REQUEST, DispatcherType.FORWARD}
)

@SessionScoped
public class AuthenticationFilter implements Filter {
	
	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		
	}

	@Override
	public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
		HttpServletRequest httpServletRequest = (HttpServletRequest) servletRequest;
		String path = httpServletRequest.getRequestURI();
		if (excludeFromFilter(path)){
			filterChain.doFilter(servletRequest, servletResponse);
			return;
		}
		HttpSession httpSession = httpServletRequest.getSession();
		User user = (User) httpSession.getAttribute(SessionVariables.CURRENT_USER);
		if (user != null || httpServletRequest.getRequestURI().contains("login.html")) {
			filterChain.doFilter(servletRequest, servletResponse);
		} else {
			HttpServletResponse httpServletResponse = (HttpServletResponse) servletResponse;
			httpServletResponse.sendRedirect(httpServletRequest.getContextPath() + "/login.html");
		}
	}
	
	private boolean excludeFromFilter(String path) {
		if (path.contains("/javax.faces.resource"))
			return true; 
		else
			return false;
	}
	
	@Override
	public void destroy() {
		
	}

}
