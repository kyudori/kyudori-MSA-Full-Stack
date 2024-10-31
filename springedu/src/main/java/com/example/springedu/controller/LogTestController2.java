package com.example.springedu.controller;
import jakarta.servlet.http.HttpServletRequest;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
@Slf4j
@Controller
public class LogTestController2 {
	@RequestMapping("/log2")
	public ModelAndView xxx(HttpServletRequest req){
		log.error(req.getRemoteHost() +"로 부터 요청이 왔어요!");
		log.warn(req.getRemoteHost() +"로 부터 요청이 왔어요!");
		log.info(req.getRemoteHost() +"로 부터 요청이 왔어요!");
		log.debug(req.getRemoteHost() +"로 부터 요청이 왔어요!");
		log.trace(req.getRemoteHost() +"로 부터 요청이 왔어요!");

		ModelAndView mav = new ModelAndView();
		mav.setViewName("logView");
		mav.addObject("msg", "톰캣콘솔창에서 확인하세요!!");
		return mav;
	}
	
}
