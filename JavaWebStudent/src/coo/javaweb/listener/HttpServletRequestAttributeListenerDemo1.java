package coo.javaweb.listener;

import javax.servlet.AsyncEvent;
import javax.servlet.AsyncListener;
import javax.servlet.ServletRequestAttributeEvent;
import javax.servlet.ServletRequestAttributeListener;
import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;
import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpServletRequest;

/**
 * Application Lifecycle Listener implementation class HttpServletRequestAttributeListenerDemo1
 *
 */
@WebListener
public class HttpServletRequestAttributeListenerDemo1 implements ServletRequestAttributeListener, AsyncListener, ServletRequestListener {

    /**
     * Default constructor. 
     */
    public HttpServletRequestAttributeListenerDemo1() {
    	
    }

	/**
     * @see AsyncListener#onComplete(AsyncEvent)
     */
    public void onComplete(AsyncEvent arg0) throws java.io.IOException { 
         // TODO Auto-generated method stub
    }

	/**
     * @see ServletRequestListener#requestDestroyed(ServletRequestEvent)
     */
    public void requestDestroyed(ServletRequestEvent arg0)  { 
         System.out.println("Request listener 销毁"+arg0.getServletRequest().getRemoteAddr()
        		 +arg0.getServletContext().getContextPath()
        		 );
    }

	/**
     * @see ServletRequestAttributeListener#attributeRemoved(ServletRequestAttributeEvent)
     */
    public void attributeRemoved(ServletRequestAttributeEvent arg0)  { 
    	 System.out.println("Request listener 移除属性****属性名称："+arg0.getName()
         +"属性值: "+arg0.getValue()
        		 );
    }

	/**
     * @see AsyncListener#onError(AsyncEvent)
     */
    public void onError(AsyncEvent arg0) throws java.io.IOException { 
         // TODO Auto-generated method stub
    }

	/**
     * @see AsyncListener#onStartAsync(AsyncEvent)
     */
    public void onStartAsync(AsyncEvent arg0) throws java.io.IOException { 
         // TODO Auto-generated method stub
    }

	/**
     * @see ServletRequestListener#requestInitialized(ServletRequestEvent)
     */
    public void requestInitialized(ServletRequestEvent arg0)  { 
    	 System.out.println("Request listener 初始化"+arg0.getServletRequest().getRemoteAddr()
        		 +arg0.getServletContext().getContextPath());
    	
    	
    }

	/**
     * @see ServletRequestAttributeListener#attributeAdded(ServletRequestAttributeEvent)
     */
    public void attributeAdded(ServletRequestAttributeEvent arg0)  { 
         System.out.println("Request listener 增加属性****属性名称："+arg0.getName()
         +"属性值: "+arg0.getValue());
         
    }

	/**
     * @see AsyncListener#onTimeout(AsyncEvent)
     */
    public void onTimeout(AsyncEvent arg0) throws java.io.IOException { 
         // TODO Auto-generated method stub
    }

	/**
     * @see ServletRequestAttributeListener#attributeReplaced(ServletRequestAttributeEvent)
     */
    public void attributeReplaced(ServletRequestAttributeEvent arg0)  { 
    	 System.out.println("Request listener 替换属性****属性名称："+arg0.getName()
         +"属性值: "+arg0.getValue());
    	 //替换后的属性的用户名与值输出的都是替换之前的内容，通过下面的方式来 让它输出最新的值
    	 //先声明一个request1 对象
    	 HttpServletRequest request1 = (HttpServletRequest)arg0.getServletRequest();
    	 //通过request1 对象获取最新的值，并赋值到一个String 变量中
    	// String rString = (String) request1.getAttribute(arg0.getName());
    	// System.out.println("新的属性值："+rString);
    	 
    }
	
}
