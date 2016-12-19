package coo.javaweb.listener;

import javax.servlet.ServletContextAttributeEvent;
import javax.servlet.ServletContextAttributeListener;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

/**
 * Application Lifecycle Listener implementation class ServletContextAttributeListenerDemo
 *
 */
@WebListener
public class ServletContextAttributeListenerDemo implements ServletContextAttributeListener, ServletContextListener {

    /**
     * Default constructor. 
     */
    public ServletContextAttributeListenerDemo() {
    	
    }

	/**
     * @see ServletContextAttributeListener#attributeAdded(ServletContextAttributeEvent)
     */
    public void attributeAdded(ServletContextAttributeEvent arg0)  { 
    	System.out.println("myself增加属性-----属性名称是："+ arg0.getName()  +"属性内容是："+arg0.getValue());
    }

	/**
     * @see ServletContextAttributeListener#attributeRemoved(ServletContextAttributeEvent)
     */
    public void attributeRemoved(ServletContextAttributeEvent arg0)  { 
    	System.out.println("myself删除属性-----属性名称是："+ arg0.getName()  +"属性内容是："+arg0.getValue());
         // TODO Auto-generated method stub
    }

	/**
     * @see ServletContextListener#contextDestroyed(ServletContextEvent)
     */
    public void contextDestroyed(ServletContextEvent arg0)  { 
         // TODO Auto-generated method stub
    }

	/**
     * @see ServletContextAttributeListener#attributeReplaced(ServletContextAttributeEvent)
     */
    public void attributeReplaced(ServletContextAttributeEvent arg0)  { 
    	System.out.println("myself替换属性-----属性名称是："+ arg0.getName()  +"属性内容是："+arg0.getValue());
         // TODO Auto-generated method stub
    }

	/**
     * @see ServletContextListener#contextInitialized(ServletContextEvent)
     */
    public void contextInitialized(ServletContextEvent arg0)  { 
         // TODO Auto-generated method stub
    }
	
}
