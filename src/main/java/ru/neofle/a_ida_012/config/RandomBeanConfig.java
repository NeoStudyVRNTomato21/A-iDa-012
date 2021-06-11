package ru.neofle.a_ida_012.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Random;

@Configuration
public class RandomBeanConfig {
    @Bean
    public Random random(){
        return new Random();
    }
}
