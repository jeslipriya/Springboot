package com.jeslipriya.hello;

import java.util.List;
import java.util.Random;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/compliment")
public class ComplimentController {

    private static final List<String> COMPLIMENTS = List.of(
        "You have an amazing smile! 😊",
        "You're doing an awesome job! 🚀",
        "You're a coding genius! 💻✨",
        "You're super creative! 🎨",
        "You make the world a better place! 🌎"
    );

    @GetMapping
    public String getCompliment() {
        Random random = new Random();
        System.out.println("Your Compliment!"); 
        return COMPLIMENTS.get(random.nextInt(COMPLIMENTS.size()));
    }
}
