package com.example.general.demo.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@CrossOrigin(origins = {"http://localhost:3000"})
@RequestMapping("/api")
public class PhoneController {

    @GetMapping("/test")
    public ResponseEntity<Map<String, String>> testEndpoint() {

        System.out.println("Hello World!");
        return ResponseEntity.ok(Map.of("message", "You pushed the button!"));
    }

    @PostMapping("/button")
    public ResponseEntity<Map<String, String>> addPush() {
        return ResponseEntity.ok(Map.of("message", "You pushed the button!"));
    }
}
