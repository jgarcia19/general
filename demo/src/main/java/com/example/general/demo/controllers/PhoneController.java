package com.example.general.demo.controllers;

import com.example.general.demo.domain.PhoneService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@CrossOrigin(origins = {"http://localhost:3000"})
@RequestMapping("/api")
public class PhoneController {

    private final PhoneService phoneService;

    public PhoneController(PhoneService phoneService) {
        this.phoneService = phoneService;
    }

    @GetMapping("/test")
    public ResponseEntity<Map<String, String>> testEndpoint() {

        System.out.println("Hello World!");
        return ResponseEntity.ok(Map.of("message", "You pushed the button!"));
    }

    @PostMapping("/button")
    public ResponseEntity<Map<String, String>> addPush() {
        String result = phoneService.recordPush();

        if (result.equals("success")) {
            return ResponseEntity.ok(Map.of("message", "Button Push Recorded!"));
        } else {
            return ResponseEntity.status(500).build();
        }

    }
}
