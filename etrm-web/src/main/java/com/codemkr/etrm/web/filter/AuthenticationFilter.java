package com.codemkr.etrm.web.filter;

import java.io.IOException;

import javax.servlet.*;
import javax.servlet.http.*;

public class AuthenticationFilter implements Filter {

	@SuppressWarnings("unused")
	private FilterConfig config;

	public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws IOException, ServletException {
		HttpServletRequest request = (HttpServletRequest) req;
		HttpServletResponse response = (HttpServletResponse) resp;
		String servletPath = request.getServletPath();
		HttpSession httpSession = request.getSession();
		if (servletPath.endsWith("/login.html") || httpSession.getAttribute("user") != null) {
			chain.doFilter(req, resp);
		} else {
			response.sendRedirect("login.html");
		}
	}

	public void init(FilterConfig config) throws ServletException {
		this.config = config;
	}

	public void destroy() {
		config = null;
	}
}
