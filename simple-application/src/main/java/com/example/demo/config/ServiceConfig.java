package com.example.demo.config;

import com.example.demo.api.application.SomeService;
import com.example.demo.infrastructure.application.DefaultSomeService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ServiceConfig {
    @Bean
    public SomeService someService() {
        return new DefaultSomeService();
    }
}
