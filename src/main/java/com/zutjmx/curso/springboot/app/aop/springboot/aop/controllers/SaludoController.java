package com.zutjmx.curso.springboot.app.aop.springboot.aop.controllers;

import org.springframework.web.bind.annotation.RestController;

import com.zutjmx.curso.springboot.app.aop.springboot.aop.services.SaludoService;

import java.util.Collections;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class SaludoController {

    @Autowired
    private SaludoService saludoService;

    @GetMapping("/saludar")
    public ResponseEntity<?> saludar() {
        return ResponseEntity.ok(
            Collections.singletonMap(
                "saludo", 
                saludoService.decirHola("zutjmx", "Hola")
            )
        );
    }
    
}
