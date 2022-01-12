package com.example;
import org.springframework.context.annotation.*;

@Configuration
public class Config {
    @Bean
    @Scope("prototype")
    MessageService messageService(){
        return new MyNameMessageService();
    }
    @Bean
    @Scope("prototype")
    MessageService randomMessageService(){
        return new RandomTextMessageService();
    }
}