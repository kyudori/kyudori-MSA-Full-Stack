package exam2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.time.LocalDateTime;


public class GreetingTest {
    public static void main(String[] args) {

        ApplicationContext factory = new ClassPathXmlApplicationContext("exam2.xml");

        LocalDateTime now = factory.getBean("currentTime", LocalDateTime.class);
        int hour = now.getHour();

        GreetingService greetingService = factory.getBean(GreetingService.class);

        greetingService.sendGreeting(hour);

        ((ClassPathXmlApplicationContext) factory).close();
    }
}
