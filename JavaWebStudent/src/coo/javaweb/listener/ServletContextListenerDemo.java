package coo.javaweb.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

/**
 * Application Lifecycle Listener implementation class ServletContextListenerDemo
 *
 */
@WebListener
public class ServletContextListenerDemo implements ServletContextListener {

    /**
     * Default constructor. 
     */
    public ServletContextListenerDemo() {
        // TODO Auto-generated constructor stub
    }

	/**
     * @see ServletContextListener#contextDestroyed(ServletContextEvent)
     */
    public void contextDestroyed(ServletContextEvent arg0)  { 
         System.out.println("ServletContextListenerDemo增加属性 **** 销毁"+arg0.getServletContext().getContextPath());
    }

	/**
     * @see ServletContextListener#contextInitialized(ServletContextEvent)
     */
    public void contextInitialized(ServletContextEvent arg0)  { 
    	System.out.println("ServletContextListenerDemo增加属性 **** 初始化"+arg0.getServletContext().getContextPath());
         // TODO Auto-generated method stub
    }
	
}
