package coo.javaweb.filter;

import java.io.IOException;
import java.nio.charset.Charset;

import javax.servlet.DispatcherType;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebInitParam;

/**
 * Servlet Filter implementation class EncondingFilter
 */
@WebFilter(dispatcherTypes = {
				DispatcherType.REQUEST, 
				DispatcherType.FORWARD, 
				DispatcherType.INCLUDE, 
				DispatcherType.ERROR
		},filterName="f03"
					, urlPatterns = {"/servlet/DoGetAndDoPost"},
		initParams={
	
	@WebInitParam(name ="charset", value="UTF-8")
}			
		
		
		)
public class EncondingFilter implements Filter {
	private String charset;
    /**
     * Default constructor. 
     */
    public EncondingFilter() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		System.out.println("*****EncondingFilter  销毁*******");
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		
		System.out.println("*****EncondingFilter 开始*****");
		
	
		request.setCharacterEncoding(this.charset);//添加编码
		
		chain.doFilter(request, response);
		System.out.println("*****EncondingFilter 结束*****");
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		System.out.println("*****EncondingFilter 初始化*****");
		this.charset =fConfig.getInitParameter("charset");
		
		System.out.println("*****EncondingFilter 编码："+charset);
	}

}
