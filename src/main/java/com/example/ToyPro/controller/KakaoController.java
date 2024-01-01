package com.example.ToyPro.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequiredArgsConstructor
public class KakaoController {

    @GetMapping("/")
    public String start() {
        return null;
    }
}
