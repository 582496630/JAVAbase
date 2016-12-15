package coo.javaweb.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ABCHonePage
 */
@WebServlet("/servlet/ABCHonePage")
public class ABCHonePage extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ABCHonePage() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out= response.getWriter();
		out.println("<html>");
		out.println("<head><title>ABC公司主页</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<p>下面是跳转/引入内容</p>");
		out.println("<hr/>");

		ServletContext context = getServletContext();
		RequestDispatcher rd = context.getRequestDispatcher("/servlet/ABCHeader");
		rd.include(request, response);
		//rd.forward(request, response);
		
		out.println("<p>这是ABCHomePage.java</p>");
		out.println("<p>下面是跳转/引入ABCFooter.html的内容</p>");
		
		rd = context.getRequestDispatcher("/servlet/ABCFooter.html");
		rd.include(request, response);
		
		
		out.println("<hr/>");
		out.println("<p>这是引用/跳转之后</p>");
		out.println("这是ABCHomePage.java");
		out.println("</body>");
		out.println("</html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
