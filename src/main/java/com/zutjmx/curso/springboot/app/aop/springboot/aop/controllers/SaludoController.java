package com.zutjmx.curso.springboot.app.aop.springboot.aop.controllers;

import org.springframework.web.bind.annotation.RestController;

import com.github.javafaker.Faker;

import java.util.Collections;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class SaludoController {

    @GetMapping("/saludar")
    public ResponseEntity<?> saludar() {
        return ResponseEntity.ok(
            Collections.singletonMap(
                "saludo", 
                Faker.instance().hitchhikersGuideToTheGalaxy().marvinQuote()
            )
        );
    }
    
}
