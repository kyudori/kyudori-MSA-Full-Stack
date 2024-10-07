package core;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.util.Date;
import java.text.SimpleDateFormat;

@WebServlet("/visitor")
public class VisitorServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();

        String name = request.getParameter("userName");
        String memo = request.getParameter("contentMemo");
		Date today = new Date();
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy년 MM월 dd일");

		
        out.print("<h2>" + name + "님이 " + dateFormat.format(today) +"에 남긴 글입니다.</h2>");
		out.print("<hr>");
        out.print("<h3>" + memo  +"</h3>");
		out.print("<a href='" + request.getHeader("referer") + "'>입력화면으로</a>");
		out.close();
    }
}
