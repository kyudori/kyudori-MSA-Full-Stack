package core;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.text.ParseException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/reservation")
public class ReservationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		String reservName = request.getParameter("reservName");
		String reservPw = request.getParameter("reservPw");
		String roomType = request.getParameter("roomType");
		String[] addRequest = request.getParameterValues("addRequest");
		
        String reservDateString = request.getParameter("reservDate");
        String formattedDate = reservDateString;

        if (reservDateString != null && !reservDateString.trim().isEmpty()) {
            try {
                SimpleDateFormat inputFormat = new SimpleDateFormat("yyyy-MM-dd");
                Date date = inputFormat.parse(reservDateString);

                SimpleDateFormat outputFormat = new SimpleDateFormat("yyyy년 MM월 dd일");
                formattedDate = outputFormat.format(date);
            } catch (ParseException e) {
                e.printStackTrace();
            }
        }
        
		if (reservName == null || reservName.length() == 0) {
			RequestDispatcher rd = request.getRequestDispatcher("/first.html");
			rd.forward(request, response);
		} else if (reservPw == null || reservPw.length() == 0) {
			response.sendRedirect("http://www.daum.net/");
		} else {
			out.print("<h1>" + reservName + "님의 예약내용</h1>");
			out.print("<hr>");
			out.print("<li> 룸 : " + roomType + "</li>");
			if (addRequest == null || addRequest.length == 0) {
				out.print("<li>추가 요청 사항: 없음</li>");
			} else {
				out.print("<li>추가 요청 사항: ");
				for (int i = 0; i < addRequest.length; i++) {
					out.print(addRequest[i]);
					if (i < addRequest.length - 1) {
						out.print(", ");
					}
				}
				out.print("</li>");
			}
			out.print("<li>예약 날짜: " + formattedDate + "</li>");
			out.print("<br>");
			out.print("<a href='" + request.getHeader("referer") + "'>예약입력화면으로</a>");
		}
	}
}
