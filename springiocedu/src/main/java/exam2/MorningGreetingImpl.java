package exam2;

import org.springframework.stereotype.Component;

@Component("morningGreeting")
public class MorningGreetingImpl implements Greeting {
    @Override
    public void greet() {
        System.out.println("상쾌한 아침입니다."); //아침 인사
    }
}
