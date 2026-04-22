package com.example.general.demo.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class PhoneController {

    @GetMapping("/test")
    public ResponseEntity<String> testEndpoint() {

        System.out.println("Hello World!");
        return ResponseEntity.ok("Hello World!");
    }
}
