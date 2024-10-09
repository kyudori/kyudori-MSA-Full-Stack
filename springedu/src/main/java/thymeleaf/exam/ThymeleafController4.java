package thymeleaf.exam;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/step4")
public class ThymeleafController4 {
    @GetMapping("/attribute")
    public String attribute() {
        return "basic/attribute";
    }
    @GetMapping("/comments")
    public String comments(Model model) {
        model.addAttribute("data", "Spring Boot!");
        return "basic/comments";
    }
    @GetMapping("/fragment1")
    public String freg1() {
        return "basic/fragmentMain1";
    }
    @GetMapping("/fragment2")
    public String freg2() {
        return "basic/fragmentMain2";
    }
}