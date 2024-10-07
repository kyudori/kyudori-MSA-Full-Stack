package com.example.springedu.controller;

import com.example.springedu.domain.PersonVO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;
@Controller
public class RequestBodyController {
    @GetMapping("/bodystart")
    public String test0() {
        System.out.println("요청 성공");
        return "result";
    }
    @PostMapping("/rb1")
    public ModelAndView test1(String name, int age) {
        System.out.println(">>> " + name+":"+age);
        ModelAndView mav = new ModelAndView();
        mav.addObject("msg", "폼태그로 전달된 파라미터 : "+name+":"+age);
        mav.setViewName("result");
        return mav;
    }
    @PostMapping(value = "/rb2", produces = "application/json; charset=utf-8")
    @ResponseBody
    public String test2(@RequestBody String param) {
        System.out.println(">>> " + param);
        return param;
    }
    @PostMapping(value = "/rb3", produces = "application/json; charset=utf-8")
    @ResponseBody
    public PersonVO test3(@RequestBody PersonVO vo) {
        System.out.println(">>> " + vo.getName()+":"+vo.getAge());
        return vo;
    }
    @PostMapping(value = "/rb4", produces = "application/json; charset=utf-8")
    @ResponseBody
    public Map test4(@RequestBody Map<String,String> map) {
        System.out.println(">>> " + map);
        return map;
    }
}
