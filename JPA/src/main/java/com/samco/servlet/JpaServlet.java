package com.samco.servlet;
import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.samco.model.Student;
import com.samco.persist.StudentDaoImpl;
@WebServlet("/JpaServlet")
public class JpaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	StudentDaoImpl daoimpl = new StudentDaoImpl();
    public JpaServlet() {
        super();
       
    }
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String stuName = request.getParameter("NAME");
		String stuDep = request.getParameter("DEPT");
		String stuYear = request.getParameter("COLLEGEYEAR");
		Student student = new Student();
		student.setStuName(stuName);
		student.setStuDep(stuDep);
		student.setStuYear(stuYear);
		daoimpl.insertStudent(student);
		RequestDispatcher rd = request.getRequestDispatcher("success.jsp");
		rd.forward(request, response);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}