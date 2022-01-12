package com.example;

import org.springframework.stereotype.Component;

@Component("messageService")
public class MyNameMessageService implements MessageService {
    private String name = "Maciej Z*****";

    @Override
    public String getMessage() {
        return this.name;
    }
}
