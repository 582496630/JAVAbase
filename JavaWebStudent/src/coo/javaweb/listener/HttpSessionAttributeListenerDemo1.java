package coo.javaweb.listener;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionBindingEvent;

/**
 * Application Lifecycle Listener implementation class HttpSessionAttributeListenerDemo1
 *
 */
@WebListener
public class HttpSessionAttributeListenerDemo1 implements HttpSessionAttributeListener {

    /**
     * Default constructor. 
     */
    public HttpSessionAttributeListenerDemo1() {
        // TODO Auto-generated constructor stub
    }

	/**
     * @see HttpSessionAttributeListener#attributeAdded(HttpSessionBindingEvent)
     */
    public void attributeAdded(HttpSessionBindingEvent arg0)  { 
         System.out.println("session增加属性  ID: "+arg0.getSession().getId()
        		 +"    name: "+arg0.getName()+"   value: "+arg0.getValue());
    }

	/**
     * @see HttpSessionAttributeListener#attributeRemoved(HttpSessionBindingEvent)
     */
    public void attributeRemoved(HttpSessionBindingEvent arg0)  { 
         // TODO Auto-generated method stub
    	System.out.println("session移除属性  ID: "+arg0.getSession().getId()
    			+"   name: "+arg0.getName()+"   value: "+arg0.getValue());
    }

	/**
     * @see HttpSessionAttributeListener#attributeReplaced(HttpSessionBindingEvent)
     */
    public void attributeReplaced(HttpSessionBindingEvent arg0)  { 
         // TODO Auto-generated method stub
    	System.out.println("session替换属性  ID: "+arg0.getSession().getId()
    			+"     name: "+arg0.getName()+"   value: "+arg0.getValue());
    }
	
}
