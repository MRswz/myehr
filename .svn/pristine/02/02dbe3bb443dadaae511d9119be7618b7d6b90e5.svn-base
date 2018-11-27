package com.myehr.interceptor;

import java.io.IOException;
import java.math.BigDecimal;


import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * 
 * <p>Title: HandlerInterceptor1</p>
 * <p>Description:登陆认证拦截器 </p>
 * <p>Company: </p> 
 * @author	
 * @date	2015-4-14下午4:45:47
 * @version 1.0
 */
public class LoginInterceptor implements Filter  {
	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

	 public void doFilter(ServletRequest request, ServletResponse response,
			   FilterChain chain) throws IOException, ServletException {
		  // 获得在下面代码中要用的request,response,session对象
		  HttpServletRequest servletRequest = (HttpServletRequest) request;
		  HttpServletResponse servletResponse = (HttpServletResponse) response;
		  HttpSession session = servletRequest.getSession();
		  // 获得用户请求的URI
		  String path = servletRequest.getRequestURI();
		  //System.out.println(path);
		  // 从session里取员工工号信息
		  int empId = 0;
		  Object o = session.getAttribute("userid");
		  if(o!=null) {
//			  empId = (Integer) session.getAttribute("userid");
			 // System.out.println(session.getAttribute("userid"));
			  empId = ((BigDecimal) session.getAttribute("userid")).intValue();
		  }
		  /*创建类Constants.java，里面写的是无需过滤的页面
		  for (int i = 0; i < Constants.NoFilter_Pages.length; i++) {
		   if (path.indexOf(Constants.NoFilter_Pages[i]) > -1) {
		    chain.doFilter(servletRequest, servletResponse);
		    return;
		   }
		  }*/
		  //取后缀path
		  String hz = path.substring(path.lastIndexOf(".")+1,path.length());
		  if("css".equals(hz)||"js".equals(hz)||"img".equals(hz)||"jpg".equals(hz)||"png".equals(hz)){
			  chain.doFilter(request, response);
			  return ;
		  }
		  
		  if(path.equals( servletRequest.getContextPath()+"/")||path.equals( servletRequest.getContextPath()) ) {
			  String formType = servletRequest.getParameter("formType");
			  if (formType!=null&&formType.equals("APP")) {
				 servletRequest.getRequestDispatcher("/index.html").forward(servletRequest, servletResponse);
				  return;
			  }
		  }
		  		  // 登陆页面无需过滤
		  if(path.indexOf("/InitZM.action") > -1||path.indexOf("/getrule.action") > -1||path.indexOf("/updatePassword.action") > -1||path.indexOf("/checkPassword.action") > -1||path.indexOf("/FirstupdatePassword.jsp") > -1||path.indexOf("/login.jsp") > -1||path.indexOf("/login.action")>-1||path.indexOf("/IMlogin")>-1||path.indexOf("/deleteTreeNode.action")>-1||path.indexOf("/getOrgAndPerInfo.action")>-1||path.indexOf("/loginApp.jsp")>-1||path.indexOf("/loginIm.jsp")>-1|| path.indexOf("/SynchronousData")>-1|| path.indexOf("/FormData")>-1) {
			  chain.doFilter(servletRequest, servletResponse);
			  return;
		  }
		  
		  // 登陆页面无需过滤
		  if(path.indexOf("/getfile.action")>-1) {
			  chain.doFilter(servletRequest, servletResponse);
			  return;
		  }
		  
		  // 登陆页面无需过滤(移动端访问)
		  if(path.indexOf("/getOrgAndPerInfo.action")>-1||path.indexOf("/getWaitSendInfo.action")>-1||path.indexOf("/setWaitSendInfo.action")>-1||path.indexOf("/loginApp.jsp")>-1||path.indexOf("/loginIm.jsp")>-1) {
			  chain.doFilter(servletRequest, servletResponse);
			  return;
		  }
		  // 判断如果没有取到员工信息,就跳转到登陆页面
		  if (empId == 0) {

			  String formType = request.getParameter("formType");
			  if (formType!=null&&formType.equals("APP")) {
				  String ImUser = request.getParameter("ImUser");
				  servletResponse.sendRedirect(servletRequest.getContextPath()+"/loginIm.jsp?ImUser="+ImUser);
			  } else {
				// 跳转到登陆页面
				   servletResponse.sendRedirect(servletRequest.getContextPath()+"/login.jsp");
			  }
			   
		  } else {
		   // 已经登陆,继续此次请求
		   chain.doFilter(request, response);
		  }
	 }

	@Override
	public void init(FilterConfig arg0) throws ServletException {
		// TODO Auto-generated method stub
		
	}
	
	 
	 
}
