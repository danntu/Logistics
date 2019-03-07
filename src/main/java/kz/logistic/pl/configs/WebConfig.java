package kz.logistic.pl.configs;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.Arrays;

@Configuration
public class WebConfig implements WebMvcConfigurer {

  @Override
  public void addCorsMappings(CorsRegistry registry) {
    registry.addMapping("/**").allowedOrigins("*");
      //.allowedMethods(String.valueOf(Arrays.asList("GET", "POST", "PATCH", "DELETE", "PUT", "OPTIONS")));
  }

}
