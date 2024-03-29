package com.phuocnguyen.springcoredemo.config;

import com.phuocnguyen.springcoredemo.common.Coach;
import com.phuocnguyen.springcoredemo.common.SwimCoach;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SportConfig {
    @Bean
    public Coach swimCoach(){
        return new     SwimCoach();
    }
}
