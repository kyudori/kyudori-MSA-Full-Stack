package sampleconfig1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("sampleconfig1")
public class MyConfiguration1 {
    @Bean
    public Food favoriteFood(){
        System.out.println("빵 객체 생성");
        Food f = new Food();
        f.setFoodName("Bread");
        f.setFoodPrice(1500);
        return f;
    }
    @Bean
    public Food unFavoriteFood(){
        System.out.println("누들 객체 생성");
        Food f = new Food();
        f.setFoodName("Noodle");
        f.setFoodPrice(2500);
        return f;
    }
 }
