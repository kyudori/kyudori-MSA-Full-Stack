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
@RequestMapping("/step2")
public class ThymeleafController2 {
    @GetMapping("/variable")
    public String variable(Model model) {
        User userA = new User("사용자 A", 10);
        User userB = new User("사용자 B", 20);

        List<User> list = new ArrayList<>();
        list.add(userA);
        list.add(userB);

        final HashMap<String, User> map = new HashMap<>();
        map.put("userA", userA);
        map.put("userB", userB);

        model.addAttribute("user", userA);
        model.addAttribute("users", list);
        model.addAttribute("userMap", map);

        return "basic/variable";
    }
    @GetMapping("/basicobjects")
    public String basicObjects1(HttpSession session, Model model) {
        model.addAttribute("startTime", LocalDateTime.of(2024, 8, 13, 9, 0));
        model.addAttribute("tech", "     JAVA, SQL, JAVASCRIPT, SPRING");
        model.addAttribute("num", 123456789);
        session.setAttribute("sessionData", "sessionData라는 이름으로 Session Scope 영역에 보관된 객체");
        if(session.getAttribute("count") == null)
            session.setAttribute("count", new int[1]);
        int su[] = (int[])session.getAttribute("count");
        su[0]++;
        return "basic/basicobjects";
    }
    @GetMapping("/link")
    public String link(Model model) {
        model.addAttribute("param1", "news");
        model.addAttribute("param2", "단풍");
        model.addAttribute("pageno", 123);
        model.addAttribute("name", "line");
        model.addAttribute("number", 5);
        return "basic/link";
    }
}
