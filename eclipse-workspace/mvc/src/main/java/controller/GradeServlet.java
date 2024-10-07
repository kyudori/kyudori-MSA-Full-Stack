package controller;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/grade")
public class GradeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		String name = request.getParameter("name");
		String score = request.getParameter("score");
		RequestDispatcher rd = null;
		
		if(name == null || name.equals("") || score == null || score.equals("")) {
			rd = request.getRequestDispatcher("/eduForm.html");		
		} else {			
			int jumsu = Integer.parseInt(score);			
			if(jumsu >= 90)
				rd = request.getRequestDispatcher("/jspexam/gradeA.jsp");
			else if(jumsu >= 80)
				rd = request.getRequestDispatcher("/jspexam/gradeB.jsp");
			else if(jumsu >= 70)
				rd = request.getRequestDispatcher("/jspexam/gradeC.jsp");
			else 
				rd = request.getRequestDispatcher("/jspexam/gradeD.jsp");
		}
		rd.forward(request, response);
	}
}
