package coo.javaweb.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ThreadSafe
 */
@WebServlet("/servlet/ThreadSafe")
public class ThreadSafe extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	String name = "";
	/*servlet是多线程处理，容易产生线程不安全问题；解决方法，1、让name属性成为局部变量，及把声明name放在doGet方法里
	                                         2、在方法void前加 同步关键字 synchronized*/
	
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ThreadSafe() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	//protected synchronized void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		protected  void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<head><title>这是ThreadSafe的servlet程序</title></head>");
		out.println("<body>");
		
		String username = request.getParameter("text");
		// String name=new String(username.getBytes("ISO8859-1"),"UTF-8");
		 name=new String(username.getBytes("ISO8859-1"),"UTF-8");
		
		try{
			Thread.sleep(5000);
		}catch (Exception e) {
			e.printStackTrace();
		}
		out.println("<p>您好"+name+"</p>");
		out.println("</body>");
		out.println("</html>");
		out.close();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
