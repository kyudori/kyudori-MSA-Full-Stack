package com.example.springlab.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class StudyPathController {
    @RequestMapping(value = "/study/{number}/thymeleaf")
    public String redirectUrl(@PathVariable int number, RedirectAttributes redirectAttributes) {
        if (number == 1) {
            return "redirect:https://abbo.tistory.com/56";
        } else if (number == 2) {
            return "redirect:https://www.thymeleaf.org/doc/tutorials/3.1/usingthymeleaf.html";
        }
        else if (number == 3) {
            return "https://www.baeldung.com/dates-in-thymeleaf";
        }
        else{
            return "redirect:https//abbo.tistory.com/56";
        }
    }
}
