package com.toninabilproject.Demo.API;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NoteController {
    private static final String template = "Hello, Toni!";
    private final AtomicLong counter = new AtomicLong();

    @GetMapping("/note")
    public Note note(@RequestParam(value = "content", defaultValue = "Hello Toni!") String content) {
        return new Note(counter.incrementAndGet(), String.format(template, content));
    }
}
