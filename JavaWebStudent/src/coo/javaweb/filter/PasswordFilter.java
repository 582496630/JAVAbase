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

/**
 * Servlet Filter implementation class UsernameFilter
 */
@WebFilter(dispatcherTypes = {
		DispatcherType.REQUEST, 
		DispatcherType.FORWARD, 
		DispatcherType.INCLUDE, 
		DispatcherType.ERROR
},filterName="f02"
			, urlPatterns = { "/servlet/DoGetAndDoPost" })
public class PasswordFilter implements Filter {

    /**
     * Default constructor. 
     */
    public PasswordFilter() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		System.out.println("*****PasswordFilter  销毁*******");
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		System.out.println("*****PasswordFilter 开始*****");
		String name = request.getParameter("password");
		if (name !=null && !"".equals(name)) {
			chain.doFilter(request, response);
			
			
		}else{
			HttpServletResponse response2 = (HttpServletResponse)response;
		response2.sendRedirect("/JavaWebStudent/filter/loginPasswordLost.html");
		
		}	
		
		System.out.println("*****PasswordFilter结束，开始跳转下一个Filter");
	
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		System.out.println("*****PasswordFilter  初始化*******");
	}

}
