package coo.javaweb.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.Servlet;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ABCHomePage2
 */
@WebServlet("/servlet/ABCHomePage2")
public class ABCHomePage2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ABCHomePage2() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out=response.getWriter();
		out.println("<html>");
		out.println("<head><title>ABCHomePage2</title></head>");
		out.println("<p>这是ABCHeardPage2</p>");
		out.println("<hr/>");
		out.flush();
		
		ServletContext context = getServletContext();
		RequestDispatcher rd = context.getRequestDispatcher("/servlet/ABCHeader2");
		rd.include(request, response);
		//rd.forward(request, response);
		out.println("<hr/>");
		out.println("<p>这是调用include方法之后的ABCHeardPage2内容");
		out.println("<hr/>");
		rd = context.getRequestDispatcher("/servlet/ABCFooter.html");
		rd.include(request, response);
		out.println("<hr/>");
		out.println("<p>这是ABCHeardPage2内容");
		out.println("</bdy></html>");
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
