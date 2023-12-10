package org.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "org.example.phone")
public class AppConfig {
//
//    @Bean
//    public SamsungPhone getPhone(){
//        return new SamsungPhone();
//    }
//
//    @Bean
//    public MobileProcessor getProcessor(){
//        return new SnapDragon();
//    }
}
