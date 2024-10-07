package sampleconfig5;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import sampleconfig2.Emp;

@Configuration
@ComponentScan("sampleconfig5")
public class MyConfiguration5 {

 @Bean
 public String userName(){
  return "둘리";
 }
}
