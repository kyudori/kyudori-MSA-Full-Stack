package exam2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class GreetingService {

    Greeting morningGreeting;
    Greeting afternoonGreeting;
    Greeting eveningGreeting;
    Greeting nightGreeting;

    @Autowired
    public GreetingService(@Qualifier("morningGreeting") Greeting morningGreeting,
                           @Qualifier("afternoonGreeting") Greeting afternoonGreeting,
                           @Qualifier("eveningGreeting") Greeting eveningGreeting,
                           @Qualifier("nightGreeting") Greeting nightGreeting) {
        this.morningGreeting = morningGreeting;
        this.afternoonGreeting = afternoonGreeting;
        this.eveningGreeting = eveningGreeting;
        this.nightGreeting = nightGreeting;
    }

    public void sendGreeting(int hour) {
        Greeting greeting;

        if (6 <= hour && hour < 12) {
            greeting = morningGreeting;
        } else if (12 <= hour && hour < 17) {
            greeting = afternoonGreeting;
        } else if (17 <= hour && hour < 22) {
            greeting = eveningGreeting;
        } else {
            greeting = nightGreeting;
        }
        greeting.greet();
    }
}
