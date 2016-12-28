package coo.javaweb.exam;
import java.util.ArrayList;
import java.util.List;
import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class StudentGrade
 */
@WebServlet("/servlet/StudentGrade")
public class StudentGrade extends HttpServlet {
	private static final long serialVersionUID = 1L;
	List<String>  list= new ArrayList<String>();
	
	
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public StudentGrade() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		System.out.println("StudentGrade servlet 初始化");
	}

	/**
	 * @see Servlet#destroy()
	 */
	public void destroy() {
		System.out.println("StudentGrade servlet 销毁");
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setCharacterEncoding("utf-8");
		request.setCharacterEncoding("utf-8");
		
		String strname = request.getParameter("name");
		System.out.println(strname);
		String strbanji = request.getParameter("banji");
		System.out.println(strbanji);
		String strcore = request.getParameter("core");
		System.out.println(strcore);
		String strfenshu = request.getParameter("fenshu");
		System.out.println(strfenshu);
		
		list.add(strname);
		list.add(strbanji);
		list.add(strcore);
		list.add(strfenshu);
		System.out.println(list.toString());
		
		HttpSession session=request.getSession();
		session.setAttribute("nameSession", list);
		//ServletContext context = getServletContext();
		/*RequestDispatcher rd = request.getRequestDispatcher("/exam/StudentGrade.jsp");
		rd.forward(request, response);*/
		//跳转必须是客户端跳转，要不然第二次的ADD 页面的地址会找不到
		response.sendRedirect("/JavaWebStudent/exam/StudentGrade.jsp");
		
		
		
		
		
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
