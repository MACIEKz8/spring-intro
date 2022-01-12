package com.example;
import org.springframework.context.annotation.*;


public class MyApp {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(Config.class);


        MessageService messageService = ctx.getBean("messageService", MessageService.class);

        MessageService messageService2 = ctx.getBean("randomMessageService", MessageService.class);

        System.out.println(messageService2.hashCode());
        System.out.println(messageService.hashCode());

        System.out.println(messageService.getMessage());
        System.out.println(messageService2.getMessage());

    }
}
