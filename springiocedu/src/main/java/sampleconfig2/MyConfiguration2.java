package sampleconfig2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import sampleconfig1.Food;

@Configuration
@ComponentScan("sampleconfig2")
public class MyConfiguration2 {
  @Bean
  public Emp emp(){
     Emp e = new Emp();
     e.setName("Dooly");
     e.setAge(25);
     e.setScore(75.4);
     return e;
  }
 @Bean
 public Emp emp1(){
  Emp e = new Emp();
  e.setName("Duke");
  e.setAge(30);
  e.setScore(90.5);
  return e;
 }
 @Bean
 public String dept(){
  return "development";
 }
}
