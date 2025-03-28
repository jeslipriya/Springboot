package com.jeslipriya.hello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Random;

@RestController
@RequestMapping("/bmw/facts")
public class BMWController {

    private static final List<String> BMW_FACTS = List.of(
        "🚗 BMW stands for **Bayerische Motoren Werke**!",
        "🏎️ The **BMW M5** was the fastest sedan in the world in 1985! ⚡",
        "🔵 BMW's logo represents a **spinning airplane propeller**! ✈️",
        "🔥 The **BMW M3 E46** is one of the most iconic sports cars ever made! 💨",
        "🌍 BMW was originally an **aircraft engine manufacturer** before making cars! 🛩️"
    );

    @GetMapping
    public String getBMWFact() {
        Random random = new Random();
        return "🚗 **BMW Fact:** " + BMW_FACTS.get(random.nextInt(BMW_FACTS.size()));
    }
}
