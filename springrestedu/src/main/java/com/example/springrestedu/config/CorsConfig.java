package com.example.springrestedu.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;

@Configuration
public class CorsConfig {
   @Bean
   public CorsFilter corsFilter() {
      UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
      CorsConfiguration config = new CorsConfiguration();
      config.setAllowCredentials(true);
      config.addAllowedOriginPattern("*"); // 스프링 2.4 부터는 이 메서드 사용해야 함
      config.addAllowedHeader("*");
      config.addAllowedMethod("*");

      source.registerCorsConfiguration("/day", config);
      source.registerCorsConfiguration("/friends", config);
      return new CorsFilter(source);
   }
}
