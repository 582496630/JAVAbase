package coo.javaweb.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DoGetAndDoPost
 */
@WebServlet("/servlet/DoGetAndDoPost2")
public class DoGetAndDoPost extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DoGetAndDoPost() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");//解决服务端响应客户端请求的内容的乱码
		//response.setCharacterEncoding("UTF-8");
		PrintWriter out= response.getWriter();
		out.println("<html>");
		out.println("<head><title>用servlet测试post与get方法</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<h2>调用了DoGet()方法</h2><br/>");
		out.println("<h3>用户信息如下：</h3>");
		//request.setCharacterEncoding("UTF-8");//传递中文参数乱码解决1 在请求参数前，调用request的setCharacterEncodin方法
		String username=request.getParameter("username");
		//String nString= new String(username.getBytes("iso8859-1"),"UTF-8");//传递中文参数乱码解决2 
		String password=request.getParameter("password");
		//String passwd= new String(password.getBytes("iso8859-1"),"UTF-8");
		if(username==null || username=="")
			username="未输入";
		if(password==null || password=="")
			password="未输入";
		out.println("<p><i>用户名是："+username+"</i></p>");
		out.println("<p><i>密码是："+password+"</i></p>");
		
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
