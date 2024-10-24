package jpaexam2.controller;

import jpaexam2.model.dao.MeetingDAO;
import jpaexam2.model.entity.Meeting;
import jpaexam2.model.entity.Reply;

import java.time.LocalDateTime;
import java.util.List;

public class MeetingController {
	private MeetingDAO dao;
	public MeetingController() {
		dao = new MeetingDAO();	
	}
	
	public void meetingCreate(String name, String title, String strmdate) {
		Meeting vo = new Meeting();
		vo.setName(name);
		vo.setTitle(title);
		vo.setMeetingDate(LocalDateTime.parse(strmdate));
		
		boolean result = dao.insertM(vo);
		if (result)
			System.out.println("meeting 저장 성공");
		else 
			System.out.println("meeting 저장 실패");
		
	}
	
	public void meetingUpdate(int id, String name, String title, String strmdate) {
		Meeting vo = new Meeting();
		vo.setId(id);
		vo.setName(name);
		vo.setTitle(title);
		vo.setMeetingDate(LocalDateTime.parse(strmdate));
		System.out.println(vo);
		boolean result = dao.updateM(vo);
		if (result)
			System.out.println("meeting 수정 성공");
		else 
			System.out.println("meeting 수정 실패");		
	}
	
	public void replyCreate(int refid, String name, String content) {
		Reply rvo = new Reply();
		rvo.setName(name);
		rvo.setContent(content);
		Meeting mvo = dao.oneM(refid);
		rvo.setRefid(mvo);
		boolean result = dao.insertReply(rvo);
		if (result)
			System.out.println("reply 저장 성공");
		else 
			System.out.println("reply 저장 실패");
	}
	
	public void meetingRead() {
		List<Meeting> list = dao.listM();
		for(Meeting vo : list) {
			System.out.print(vo.getId()+"\t");
			System.out.print(vo.getName()+"\t");
			System.out.print(vo.getMeetingDate()+"\t");
			System.out.println(vo.getTitle());
		}		
	}
	
	public Meeting meetingOne(int id) {
		Meeting vo = dao.oneM(id);
		return vo;
	}
	
	public void meetingRWithName(String name) {
		List<Meeting> list = dao.searchM(name);
		for(Meeting vo : list) {
			System.out.print(vo.getId()+"\t");
			System.out.print(vo.getName()+"\t");
			System.out.print(vo.getMeetingDate()+"\t");
			System.out.println(vo.getTitle());
		}	
	}

	public void replyRead(int refid) {
		List<Reply> list = dao.listReplyByMettingId(refid);
		for(Reply vo : list) {
			System.out.print("\t");
			System.out.print(vo.getId()+"\t");
			System.out.print(vo.getName()+"\t");
			System.out.print(vo.getContent()+"\t");
			System.out.println(vo.getRefid());
		}
	}

	public void meetingDelete(int id) {
		boolean result = dao.deleteM(id);
		if (result)
			System.out.println("삭제 성공");
		else 
			System.out.println("삭제 실패");
	}
	
	public void replyAllRead() {
		List<Reply> list = dao.listR();
		for(Reply vo : list) {
			System.out.println(vo);
		}
	}
	
	public void close() {
		dao.close();
	}
	
}
