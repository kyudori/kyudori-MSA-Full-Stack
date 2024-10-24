package com.example.springlab.controller;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.server.ResponseStatusException;

@Controller
public class StudyPathController {
    @RequestMapping(value = "/study/{number}/thymeleaf")
    public String redirectUrl(@PathVariable int number, RedirectAttributes redirectAttributes) {
        switch (number) {
            case 1:
                return "redirect:https://abbo.tistory.com/56";
            case 2:
                return "redirect:https://abbo.tistory.com/57";
            case 3:
                return "redirect:https://www.thymeleaf.org/doc/tutorials/3.1/usingthymeleaf.html";
            case 4:
                return "redirect:https://www.baeldung.com/dates-in-thymeleaf";
            default:
                throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Resource Not Found");
        }
    }
}
