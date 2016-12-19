package coo.javaweb.listener;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

/**
 * Application Lifecycle Listener implementation class HttpSessionListenerDemo1
 *
 */
@WebListener
public class HttpSessionListenerDemo1 implements HttpSessionListener {

    /**
     * Default constructor. 
     */
    public HttpSessionListenerDemo1() {
        // TODO Auto-generated constructor stub
    }

	/**
     * @see HttpSessionListener#sessionCreated(HttpSessionEvent)
     */
    public void sessionCreated(HttpSessionEvent arg0)  { 
         System.out.println("myself会话session 创建***"+arg0.getSession().getId());
    }

	/**
     * @see HttpSessionListener#sessionDestroyed(HttpSessionEvent)
     */
    public void sessionDestroyed(HttpSessionEvent arg0)  { 
    	System.out.println("myself会话session 销毁***"+arg0.getSession().getId());
         // TODO Auto-generated method stub
    }
	
}
