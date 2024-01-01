package com.example.ToyPro.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class RestKakaoController {

    @GetMapping("/")
    public String home() {
        return null;
    }
}
