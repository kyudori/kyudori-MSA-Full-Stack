package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.domain.MemberVO;

@WebServlet("/ms")
public class MemberServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		String name=request.getParameter("name");
		name = name.equals("") ? "손님" : name;
		String phone=request.getParameter("phone");
		phone = phone.equals("") ? "010-1111-2222" : phone;
		String id=request.getParameter("id");
		id = id.equals("") ? "guest" : id;
		String pwd=request.getParameter("pwd");
		pwd = pwd.equals("") ? "1234" : pwd;
		
		MemberVO vo=new MemberVO(name, phone, id, pwd);
		
		request.setAttribute("mem", vo);
		
		request.getRequestDispatcher("/jspexam/memberView.jsp").forward(request, response);		
	}
}
