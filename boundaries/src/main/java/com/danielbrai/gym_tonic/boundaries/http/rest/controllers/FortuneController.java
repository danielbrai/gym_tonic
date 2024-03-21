package com.danielbrai.gym_tonic.boundaries.http.rest.controllers;

import com.danielbrai.core.use_cases.FortuneUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello-world")
@RequiredArgsConstructor
public class FortuneController {

    private final FortuneUseCase fortuneUseCase;

    @GetMapping
    public ResponseEntity<String> getHello() {
        return ResponseEntity.ok(this.fortuneUseCase.execute());
    }
}
