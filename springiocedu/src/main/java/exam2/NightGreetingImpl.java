package exam2;

import org.springframework.stereotype.Component;

@Component("nightGreeting")
public class NightGreetingImpl implements Greeting {
    @Override
    public void greet() {
        System.out.println("안녕히 주무세요."); //밤 인사
    }
}
