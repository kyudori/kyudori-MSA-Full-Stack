package thymeleaf.exam;

import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Controller
@RequestMapping("/step3")
public class ThymeleafController3 {
    @GetMapping("/literal")
    public String literal(Model model) {
        model.addAttribute("data", "Spring Boot!");
        return "basic/literal";
    }
    @GetMapping("/operation")
    public String operation(Model model) {
        model.addAttribute("nullData", null);
        model.addAttribute("data", "Spring Boot!");
        model.addAttribute("num1", 30);
        model.addAttribute("num2", 0);
        return "basic/operation";
    }
    private void addUsers(Model model) {
        List<User> list = new ArrayList<>();
        list.add(new User("둘리", 10));
        list.add(new User("또치", 20));
        list.add(new User("도우너", 30));
        model.addAttribute("users", list);
    }
    @GetMapping("/conditiontest3")
    public String condition(Model model) {
        addUsers(model);
        return "basic/condition";
    }
    @GetMapping("/each")
    public String each(Model model) {
        addUsers(model);
        return "basic/each";
    }
    @GetMapping("/block")
    public String block(Model model) {
        addUsers(model);
        return "basic/block";
    }
    @GetMapping("/star")
    public String star(Model model) {
        model.addAttribute("user", new User("유니코", 20));
        addUsers(model);
        return "basic/starexpression";
    }
    @GetMapping("/javascript")
    public String javascript(Model model) {
        model.addAttribute("user", new User("DUKE", 10));
        addUsers(model);
        return "basic/javascript";
    }
}
