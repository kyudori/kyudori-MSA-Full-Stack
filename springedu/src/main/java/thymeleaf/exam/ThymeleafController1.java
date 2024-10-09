package thymeleaf.exam;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import jakarta.servlet.http.HttpSession;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/step1")
public class ThymeleafController1 {
	@GetMapping("/hithymeleaf")
    public String hiThymeleaf(Model model) {
        model.addAttribute("say", "안녕?");
        return "basic/hithymeleaf";
    }
	@GetMapping("/text-basic")
    public String textBasic(Model model) {
        model.addAttribute("data", "Hello spring boot!");
        return "basic/text-basic";
    }
    @GetMapping("/text-unescaped")
    public String textUnescaped(Model model) {
        model.addAttribute("data", "Hello <b>spring!</b>");
        return "basic/text-unescaped";
    }
    @GetMapping("/conditiontest1")
    public String conditiontest1(Model model) {
        model.addAttribute("age", 13);
        model.addAttribute("movie", "겨울왕국");
        model.addAttribute("today", "금요일");
        return "basic/ifcondition";
    }
    @GetMapping("/conditiontest2")
    public String conditiontest2(Model model) {
        model.addAttribute("age", 14);
        model.addAttribute("movie", "아기공룡둘리");
        model.addAttribute("today", "월요일");
        return "basic/ifcondition";
    }
}
