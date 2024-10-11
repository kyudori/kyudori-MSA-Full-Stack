package com.example.springedu.controller;

import java.util.List;

import mybatis.dao.MeetingMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.example.springedu.domain.MeetingDTO;
import com.example.springedu.domain.ReplyVO;
@Controller
@RequiredArgsConstructor
public class MeetingController  {
	@Autowired
    MeetingMapper dao;
	@GetMapping("/meeting")
	public ModelAndView list() {
		List<MeetingDTO> list = dao.listM();
		ModelAndView mav = new ModelAndView();	
		if (list.size() != 0) {
			mav.addObject("list", list);
		} else {
			mav.addObject("msg", "추출된 결과가 없어요");
		}
		mav.setViewName("meetingView");
		return mav;
	}
	
	@GetMapping("/meeting/search")
	public ModelAndView search(String keyword) {
		List<MeetingDTO> list = dao.searchM1(keyword);
		ModelAndView mav = new ModelAndView();	
		if (list.size() != 0) {
			mav.addObject("list", list);
			mav.addObject("button", "메인화면으로");
		} else {
			mav.addObject("msg", "추출된 결과가 없어요");
		}
		mav.setViewName("meetingView");
		return mav;
	}

	@GetMapping("/meeting/searchname")
	public ModelAndView searchName(String name) {
		List<MeetingDTO> list = dao.searchM2(name);
		ModelAndView mav = new ModelAndView();
		if (list.size() != 0) {
			mav.addObject("list", list);
			mav.addObject("button", "메인화면으로");
		} else {
			mav.addObject("msg", "추출된 결과가 없어요");
		}
		mav.setViewName("meetingView");
		return mav;
	}
	
	@GetMapping("/meeting/delete")
	public ModelAndView delete(int id) {
		boolean result = dao.deleteM(id);
		ModelAndView mav = new ModelAndView();	
		if (result) {
			mav.addObject("list", dao.listM());
		} else {
			mav.addObject("msg", "삭제를 처리하는 동안 오류 발생");
		}
		mav.setViewName("meetingView");
		return mav;
	}
	@PostMapping("/meeting/insert")
	public ModelAndView insert(MeetingDTO vo) {
		boolean result = dao.insertM(vo);
		ModelAndView mav = new ModelAndView();	
		if (result) {
			mav.addObject("list", dao.listM());
		} else {
			mav.addObject("msg", "글 작성을 처리하는 동안 오류 발생");
		}
		mav.setViewName("meetingView");
		return mav;
	}
	
	@PostMapping("/meeting/update")
	public ModelAndView update(MeetingDTO vo) {
		boolean result = dao.updateM(vo);
		ModelAndView mav = new ModelAndView();	
		if (result) {
			mav.addObject("list", dao.listM());
		} else {
			mav.addObject("msg", "글 수정을 처리하는 동안 오류 발생");
		}
		mav.setViewName("meetingView");
		return mav;
	}	
	
	@GetMapping(value="/meeting/ireply", produces = "application/json; charset=utf-8")
	@ResponseBody
	public String insert_reply(ReplyVO vo) {
		boolean result = dao.insertReply(vo);
		String jsonStr;
		if (result) {
			 jsonStr = "{ \"result\": true }";
		} else {
			 jsonStr = "{ \"result\": false }";
		}
		return  jsonStr;
	}
	
	@GetMapping(value="/meeting/lreply", produces = "application/json; charset=utf-8")
	@ResponseBody
	public List<ReplyVO> list_reply(int refid) {
		List<ReplyVO> list = dao.listReply(refid);		
		return list;
	}
}
