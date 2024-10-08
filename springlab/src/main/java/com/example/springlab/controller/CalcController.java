package com.example.springlab.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CalcController {
    @PostMapping("calc")
    public ModelAndView calc(HttpServletRequest req,
                             @RequestParam(value = "num1") int num1,
                             @RequestParam(value = "num2") int num2,
                             @RequestParam(value = "oper") String oper){
        ModelAndView mav = new ModelAndView();
        int result = 0;
        mav.addObject("refinfo", req.getHeader("referer"));
        switch (oper) {
            case "+" -> {
                result = num1 + num2;
            }
            case "-" -> {
                result = num1 - num2;
            }
            case "*" -> {
                result = num1 * num2;
            }
            default -> {
                if (num2 == 0) {
                    String errorMessage = "나눗셈 연산시 두 번째 숫자는 0일 수 없습니다!!";
                    mav.addObject("errorMessage", errorMessage);
                    mav.setViewName("errorResult");
                    return mav;
                }
                result = num1 / num2;
            }
        }
        mav.addObject("result", result);
        mav.setViewName("calcResult");
        return mav;
    }
}
