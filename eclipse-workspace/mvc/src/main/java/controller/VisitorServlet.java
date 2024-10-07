package controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.service.VisitorDAO;
import model.domain.VisitorDTO;

@WebServlet("/visitor")
public class VisitorServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private VisitorDAO dao;
	public void init() {
		dao = new VisitorDAO();
	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action = request.getParameter("action");	
		List<VisitorDTO> list = null;		
		if(action == null) {
			list = dao.listAll();	
			if (list.size() > 0 )
				request.setAttribute("list", list);
			else 
				request.setAttribute("msg", "방명록에 작성된 글이 없네요...");
		} else if(action.equals("search")) {
			String keyword = request.getParameter("keyword");
			list = dao.search(keyword);	
			if (list.size() > 0 )
				request.setAttribute("list", list);
			else 
				request.setAttribute("msg", keyword + "를 포함한 글이 없네요...");
		} else if(action.equals("delete")) {
			boolean result = dao.delete(Integer.parseInt(request.getParameter("id")));	
			if(result)
				request.setAttribute("msg", "성공적으로 글이 삭제되었어요...");
			else 
				request.setAttribute("msg", "글을 삭제하는 동안 오류가 발생했어요...");
		} 
		RequestDispatcher rd = request.getRequestDispatcher("/jspexam/visitorView.jsp");
		rd.forward(request, response);	
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		String action = request.getParameter("action");
		String name = request.getParameter("name");
		String memo = request.getParameter("memo");
		if (action.equals("insert")) {
			VisitorDTO vo = new VisitorDTO();
			vo.setName(name);
			vo.setMemo(memo);
			boolean result = dao.insert(vo);
			if (result)
				request.setAttribute("msg", name +"님의 글을 성공적으로 저장했어요^^");
			else 
				request.setAttribute("msg", name +"님의 글 저장 작업을 실패했어요ㅜㅜ");			
		} else {
			VisitorDTO vo = new VisitorDTO();
			vo.setId(Integer.parseInt(request.getParameter("id")));
			vo.setName(name);
			vo.setMemo(memo);
			boolean result = dao.update(vo);
			if (result)
				request.setAttribute("msg", name +"님의 글이 성공적으로 수정했어요^^");
			else 
				request.setAttribute("msg", name +"님의 글 수정 작업을 실패했어요ㅜㅜ");
		}
		RequestDispatcher rd = request.getRequestDispatcher("/jspexam/visitorView.jsp");
		rd.forward(request, response);
	}
}
