package coo.javaweb.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RedirectDemo
 */
@WebServlet("/servlet/RedirectDemo")
public class RedirectDemo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RedirectDemo() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//网页重定向两种方式
		String location = request.getParameter("url");
		if(location==null){
			//1、用redirect直接跳转
			response.sendRedirect("https://www.baidu.com");
		}else {
			//response.sendRedirect(location);
			//2、先用setStatus 获取301(永久移动)或302（临时移动）状态码，再用setHeader（“name”，值）
			response.setStatus(HttpServletResponse.SC_MOVED_PERMANENTLY);
			response.setHeader("lc",location);
		}
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
