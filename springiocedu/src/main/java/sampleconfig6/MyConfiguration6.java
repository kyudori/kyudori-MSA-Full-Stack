package sampleconfig6;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("sampleconfig6")
public class MyConfiguration6 {
 @Bean
 public User member(){
  User u = new User("듀크");
  return u;
 }
}
