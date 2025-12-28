package dev.memory.memoryserver;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {
    
    @GetMapping("/")
    public String home() {
        return "Good, Worldddd";
    }
}
