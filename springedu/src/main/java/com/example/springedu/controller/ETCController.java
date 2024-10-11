package com.example.springedu.controller;

import mybatis.dao.ETCMapper;
import com.example.springedu.domain.EmpDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class ETCController {
	@Autowired
	ETCMapper dao;

	@GetMapping("/list1")
	public ModelAndView list1(String tname, String cname) {
		ModelAndView mav = new ModelAndView();
		List<EmpDTO> list = dao.list1(tname, cname);
		mav.addObject("list", list);
		mav.setViewName("etcResult");
		return mav;
	}

	@GetMapping("/list2")
	public ModelAndView list2(String cname, String key) {
		ModelAndView mav = new ModelAndView();
		List<EmpDTO> list = dao.list2(cname, key);
		mav.addObject("list", list);
		mav.setViewName("etcResult");
		return mav;
	}

	@GetMapping("/list3")
	public ModelAndView list3() {
		ModelAndView mav = new ModelAndView();
		List<EmpDTO> list = dao.list3("7788, 7839, 7902");
		mav.addObject("list", list);
		mav.setViewName("etcResult");
		return mav;
	}

	@GetMapping("/list4")
	public ModelAndView list4(EmpDTO vo) {
		ModelAndView mav = new ModelAndView();
		List<EmpDTO> list = dao.list4(vo);
		mav.addObject("list", list);
		mav.setViewName("etcResult");
		return mav;
	}

	@GetMapping("/list5")
	public ModelAndView list5(String name) {
		ModelAndView mav = new ModelAndView();
		List<EmpDTO> list = dao.list5(name);
		mav.addObject("list", list);
		mav.setViewName("etcResult");
		return mav;
	}
}
