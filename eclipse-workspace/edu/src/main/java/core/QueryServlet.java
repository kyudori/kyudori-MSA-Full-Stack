package core;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet({ "/queryget", "/querypost" })
public class QueryServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		String userName = request.getParameter("guestName");
		int number = Integer.parseInt(request.getParameter("num"));
		String food[] = request.getParameterValues("food");
		if (food != null && food.length != 0) {
			out.print("<h2>좋아하는 음식</h2>");
			out.print("<ul>");
			for (String f : food)
				out.print("<li>" + f + "</li>");
			out.print("</ul>");
		} else {
			out.print("<h2>좋아하는 음식이 없군요</h2>");
		}
		out.print("<h2>요청 방식 : " + request.getMethod() + "</h2>");
		out.print("<h2>요청 URI : " + request.getRequestURI() + "</h2>");
		out.print("<h2>당신의 이름은 " + userName + "이군요!</h2>");
		out.print("<h2>당신이 좋아하는 숫자는 " + number + "이군요!</h2>");
		out.print("<a href='" + request.getHeader("referer") + "'>입력화면으로 가기</a>");
		out.close();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		doGet(request, response);
	}
}
