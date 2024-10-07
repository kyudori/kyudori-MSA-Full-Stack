package com.example.springedu.controller;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MultiController {	
	@RequestMapping(value="/select")
	public ModelAndView select_proc(HttpServletRequest req) {
		System.out.println("select ............");
		ModelAndView mav = new ModelAndView();
		mav.addObject("method", req.getMethod());
		mav.addObject("requri", req.getRequestURI());
		mav.addObject("refinfo", req.getHeader("referer"));
		mav.setViewName("viewTest");
		return  mav;
	}
	@RequestMapping(value="/search")
	public ModelAndView search_proc(HttpServletRequest req) {
		System.out.println("search ............");
		ModelAndView mav = new ModelAndView();
		mav.addObject("method", req.getMethod());
		mav.addObject("requri", req.getRequestURI());
		mav.addObject("refinfo", req.getHeader("referer"));
		mav.setViewName("viewTest");
		return  mav;
	}
	@RequestMapping(value="/insert")
	public ModelAndView insert_proc(int pageno, HttpServletRequest req) {
		System.out.println("insert ............"+pageno);
		ModelAndView mav = new ModelAndView();
		mav.addObject("method", req.getMethod());
		mav.addObject("requri", req.getRequestURI());
		mav.addObject("refinfo", req.getHeader("referer"));
		mav.setViewName("viewTest");
		return  mav;
	}
	@RequestMapping(value="/viewTest")
	public void void_proc(int pageno) {
		System.out.println("viewTest ............");
	}	
}


