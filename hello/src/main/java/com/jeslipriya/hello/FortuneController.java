package com.jeslipriya.hello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Random;

@RestController
@RequestMapping("/fortune")
public class FortuneController {

    private static final List<String> FORTUNES = List.of(
        "A beautiful, smart, and loving person will be coming into your life. ❤️",
        "Your life will be filled with magic and wonderful surprises! ✨",
        "Adventure is out there! Be ready for something exciting! 🌍",
        "Success will come your way very soon! 💰",
        "You are stronger than you think. Keep pushing forward! 💪"
    );

    @GetMapping
    public String getFortune() {
        Random random = new Random();
        return "🍪 Fortune Cookie: " + FORTUNES.get(random.nextInt(FORTUNES.size()));
    }
}
