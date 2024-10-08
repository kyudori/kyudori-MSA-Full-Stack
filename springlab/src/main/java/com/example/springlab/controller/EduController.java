package com.example.springlab.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class EduController {
    @RequestMapping("/educontroller")
    public ModelAndView proc(HttpServletRequest req, String name, int score){
        ModelAndView mav = new ModelAndView();
        mav.addObject("name",name);
        mav.addObject("score",score);
        mav.addObject("refinfo", req.getHeader("referer"));

        if (score >= 90){
            mav.setViewName("gradeA");
            return mav;
        } else if (score >= 80) {
            mav.setViewName("gradeB");
            return mav;
        } else if (score >= 70) {
            mav.setViewName("gradeC");
            return mav;
        }
        else{
            mav.setViewName("gradeD");
            return mav;
        }
    }
}
