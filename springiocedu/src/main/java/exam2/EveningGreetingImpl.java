package exam2;

import org.springframework.stereotype.Component;

@Component("eveningGreeting")
public class EveningGreetingImpl implements Greeting {
    @Override
    public void greet() {
        System.out.println("편안한 저녁되세요."); //저녁 인사
    }
}
