package coo.javaweb.listener;

import javax.servlet.http.HttpSessionBindingEvent;
import javax.servlet.http.HttpSessionBindingListener;

/**
 * Application Lifecycle Listener implementation class HttpSessionBindListenerDemo1
 *
 */
//@WebListener   这个要注释掉，不然，无法正常启动绑定对应的jsp文件
public class HttpSessionBindListenerDemo1 implements HttpSessionBindingListener {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
    /**
     * Default constructor. 
     */
    public HttpSessionBindListenerDemo1(String name) {
    	this.setName(name);
    }

	/**
     * @see HttpSessionBindingListener#valueBound(HttpSessionBindingEvent)
     */
    public void valueBound(HttpSessionBindingEvent arg0)  { 
         System.out.println("会话绑定+SessionBind： "+"name="+arg0.getName()
         +"ID="+arg0.getSession().getId()
        		 );
    }

	/**
     * @see HttpSessionBindingListener#valueUnbound(HttpSessionBindingEvent)
     */
    public void valueUnbound(HttpSessionBindingEvent arg0)  { 
         // TODO Auto-generated method stub
    	System.out.println("会话解绑 +SessionBind： "+"name="+arg0.getName()
    	+"ID="+arg0.getSession().getId()
    			);
    }
	
}
