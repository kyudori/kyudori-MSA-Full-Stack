package exam1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.time.LocalDateTime;

public class GreetingTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("exam1.xml");
        LocalDateTime now = context.getBean("currentTime", LocalDateTime.class);
        int hour = now.getHour();

        if (6 <= hour && 12 > hour) {
            Greeting greeting = (Greeting) context.getBean("morningGreeting");
            greeting.greet();
        } else if (12 <= now.getHour() && 17 > now.getHour()) {
            Greeting greeting = (Greeting) context.getBean("afternoonGreeting");
            greeting.greet();
        } else if (17 <= now.getHour() && 22 > now.getHour()) {
            Greeting greeting = (Greeting) context.getBean("eveningGreeting");
            greeting.greet();
        } else {
            Greeting greeting = (Greeting) context.getBean("nightGreeting");
            greeting.greet();
        }

        // 스프링 컨텍스트 종료
        ((ClassPathXmlApplicationContext) context).close();
    }
}
