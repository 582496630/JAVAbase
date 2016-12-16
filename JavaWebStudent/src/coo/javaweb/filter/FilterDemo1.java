package coo.javaweb.filter;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

/**
 * Servlet Filter implementation class FilterDemo1
 */
/*@WebFilter("/*")*/
public class FilterDemo1 implements Filter {

    /**
     * Default constructor. 
     */
    public FilterDemo1() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {

	System.out.println("*****FilterDemo1过滤器销毁.......");
	
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		//System.out.println("****FilterDemo1  执行doFilter()之前...");
		chain.doFilter(request, response);
		//System.out.println("****FilterDemo1  执行doFilter()之后...");
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {

		System.out.println("***FilterDemo1过滤器初始化....");
	String initParam=fConfig.getInitParameter("ref");
	System.out.println("FilterDemo1过滤器初始化参数 = "+initParam);
	
	}

}
