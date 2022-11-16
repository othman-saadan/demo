package com.example.demo.configuration;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.config.CorsRegistry;
import org.springframework.web.reactive.config.WebFluxConfigurer;
import org.springframework.web.reactive.config.WebFluxConfigurerComposite;

@Configuration
public class WebFluxConfiguration {


    @Bean
    public WebFluxConfigurer corrsConfigurer() {
        return new WebFluxConfigurerComposite() {
            @Override
            public void addCorsMappings(CorsRegistry registry) {
                registry.addMapping("/**").allowedOrigins("*")
                        .allowedMethods("*");
            }
        };
    }
}
