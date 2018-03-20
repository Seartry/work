package com.zhangxp.common.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

public class LogInterceptor implements HandlerInterceptor {

	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object obj) throws Exception {
		boolean isNew = request.getSession().isNew();
		System.out.println("-----请求被拦截-----");
		if(isNew) {
			response.sendRedirect("login.jsp");
			System.out.println("------第一次加载-----");
		}
		return true;
	}
	
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object obj,  ModelAndView arg3)
			throws Exception {
		// TODO Auto-generated method stub
		
	}

	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object obj, Exception e)
			throws Exception {
		// TODO Auto-generated method stub
		
	}



}
