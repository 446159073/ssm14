package com.lcg.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.lcg.entity.BackendUser;
import com.lcg.entity.DevUser;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;



public class UserHandlerInterceptor implements HandlerInterceptor {

	public void afterCompletion(HttpServletRequest arg0,
			HttpServletResponse arg1, Object arg2, Exception arg3)
			throws Exception {
		// TODO Auto-generated method stub
		
	}

	public void postHandle(HttpServletRequest arg0, HttpServletResponse arg1,
			Object arg2, ModelAndView arg3) throws Exception {
		// TODO Auto-generated method stub
		
	}

	public boolean preHandle(HttpServletRequest request, HttpServletResponse response,
			Object arg2) throws Exception {
		// TODO Auto-generated method stub

		String path=request.getServletPath();
		String[] ary = path.split("/");
		if(ary[0].equals("backend")){
			String flag="backendlogin.jsp";

		}else{
			String flag="devlogin.jsp";
		}
		BackendUser backendlogin= (BackendUser) request.getSession().getAttribute("userSession");
		DevUser devlogin = (DevUser) request.getSession().getAttribute("userSession");



		if(backendlogin == null &&devlogin==null){
			response.sendRedirect("backendlogin.jsp");
			return false;
		}
		return true;
	}

}
