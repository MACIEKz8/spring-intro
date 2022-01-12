package com.example;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("messageService")
public class MyNameMessageService implements MessageService {
    private String name = "Maciej Zawisz";

    @Override
    public String getMessage() {
        return this.name;
    }
}