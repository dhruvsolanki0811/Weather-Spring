package com.weather.weatherrest.Config;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class ProjectConfig {
    @Bean
    public RestTemplate restTemplate(){
        RestTemplateBuilder restTemplateBuilder= new RestTemplateBuilder();
        return restTemplateBuilder.build();
    }
}
