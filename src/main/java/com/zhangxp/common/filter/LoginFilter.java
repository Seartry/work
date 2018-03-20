package com.zhangxp.common.filter;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.commons.lang3.StringUtils;

public class LoginFilter implements Filter{

	private String excludePages;
	private List excludeArray;
	
	public void init(FilterConfig filterConfig) throws ServletException {
		System.out.println("初始化过滤器！！！！！");
		excludePages = filterConfig.getInitParameter("excludePages");
		  if(StringUtils.isNotEmpty(excludePages)) {
			  excludeArray = Arrays.asList(excludePages.split(","));
		  }
		  System.out.println("excludePages:"+excludePages);
	}
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		System.out.println("doFilter中的excludePages："+excludePages);
		
		//将request强转
		HttpServletRequest req = (HttpServletRequest)request;
		//获取session
		HttpSession session = req.getSession(true);
		System.out.println("请求路径："+req.getServletPath());
		//判断是不是不需要过滤的请求
		if(excludeArray.contains(req.getServletPath())) {
			chain.doFilter(request, response);
			return;
		}
		//判断session中是否放进去的userName属性
		if(session.getAttribute("userName") == null) {
			System.out.println("该用户还没有登陆过！");
			HttpServletResponse res = (HttpServletResponse)response;
			res.sendRedirect(req.getContextPath()+"/index.jsp");
		}else {
			chain.doFilter(request, response);
		}
	}
	public void destroy() {
		
	}

}
