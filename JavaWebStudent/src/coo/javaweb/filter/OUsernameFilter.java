package coo.javaweb.filter;

import java.io.IOException;

import javax.servlet.DispatcherType;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet Filter implementation class UsernameFilter
 */
@WebFilter(dispatcherTypes = {
		DispatcherType.REQUEST, 
		DispatcherType.FORWARD, 
		DispatcherType.INCLUDE, 		
		DispatcherType.ERROR
},filterName="f01"
			, urlPatterns = {"/servlet/DoGetAndDoPost"})//这个路径是需要过滤的servlet的mapping路径

public class OUsernameFilter implements Filter {

    /**
     * Default constructor. 
     */
    public OUsernameFilter() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		System.out.println("*****UsernameFilter 销毁*******");
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
	
		System.out.println("*****UsernameFilter开始*****");
		String name = request.getParameter("username");
		if (name !=null && !"".equals(name)) {
			chain.doFilter(request, response);
		}else{
			HttpServletResponse response2 = (HttpServletResponse)response;
		//response2.sendRedirect("/JavaWebStudent/filter/loginUsernameLost.html");
		response2.setHeader("refresh", "2,url=/JavaWebStudent/filter/loginUsernameLost.html");
		}	
		
		System.out.println("*****UsernameFilter结束，开始跳转下一个Filter");
	}
	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
		System.out.println("*****UsernameFilter初始化*******");
		
	}

}
