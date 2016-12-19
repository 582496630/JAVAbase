package coo.javaweb.listener;

import java.io.FileOutputStream;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;
import javax.xml.crypto.Data;

import org.apache.jasper.tagplugins.jstl.core.Catch;

/**
 * Application Lifecycle Listener implementation class ListenerDemo1
 *
 */
@WebListener
public class ListenerDemo1 implements ServletContextListener {
//	private PrintStream print;
    /**
     * Default constructor. 
     */
    public ListenerDemo1() {
    	/*PrintStream out = null;
		try {
			out = new PrintStream(new FileOutputStream("D:\\config.log"));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	System.setOut(out);
    	print = System.out;*/
    }
    
	/**
     * @see ServletContextListener#contextDestroyed(ServletContextEvent)
     */
    public void contextDestroyed(ServletContextEvent arg0)  { 
    	Date date = new Date();
    	
         System.out.println("ListenerDemo1  监听器销毁   "+date.toString());
    }

	/**
     * @see ServletContextListener#contextInitialized(ServletContextEvent)
     */
    public void contextInitialized(ServletContextEvent arg0)  { 
    	Date date = new Date();
    	/*String date1 = new Date().toString();
    	System.out.println(date1);*/
        System.out.println("ListenerDemo1  监听器初始化   "+ (date.getMonth()+1)+"月"+
        date.getDay()+"日"+date.getHours()+":"+date.getMinutes()+":"+date.getSeconds());
       
    }
}
