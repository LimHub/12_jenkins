package com.lhw.jenkins.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")
                // next.js에 설정된 3000번 포트에서오는 건 cors 설정 해제

                .allowedOrigins("") // Ingress설정으로 내부적으로 통신이 수행되므로 CORS설정 없어도 통신가능
                .allowedMethods("GET", "POST", "PUT", "DELETE", "OPTIONS","FETCH");
    }
}
