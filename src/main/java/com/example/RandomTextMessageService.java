package com.example;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

@Component("messageService2")
public class RandomTextMessageService implements MessageService{

    private final List<String> listOfStrings = new ArrayList<String>(Arrays.asList("CZEŚĆ [0]", "CZEŚĆ [1]", "CZEŚĆ [2]", "CZEŚĆ [3]", "CZEŚĆ [4]", "CZEŚĆ [5]", "CZEŚĆ [6]", "CZEŚĆ [7]", "CZEŚĆ [8]", "CZEŚĆ [9]"));

    @Override
    public String getMessage() {
        Random rand = new Random();
        return listOfStrings.get(rand.nextInt(listOfStrings.size()));
    }
}
