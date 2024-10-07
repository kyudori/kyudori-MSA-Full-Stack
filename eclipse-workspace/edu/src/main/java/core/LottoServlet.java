package core;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.TimeVO;
import javax.servlet.*;
import java.time.LocalTime;

@WebServlet("/lotto")
public class LottoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String userInput = request.getParameter("number");
        int userNumber = Integer.parseInt(userInput);

        int randomNumber = (int) (Math.random() * 6) + 1;

        System.out.println("전달된 값: " + userNumber + ", 추출된 값: " + randomNumber);

        LocalTime currentTime = LocalTime.now();
        TimeVO time = new TimeVO(currentTime.getHour(), currentTime.getMinute());
        request.setAttribute("time", time);

        if (userNumber == randomNumber) {
            RequestDispatcher dispatcher = request.getRequestDispatcher("/jspexam/success.jsp");
            dispatcher.forward(request, response);
        } else {
            RequestDispatcher dispatcher = request.getRequestDispatcher("/jspexam/fail.jsp");
            dispatcher.forward(request, response);
        }	
   }
}
