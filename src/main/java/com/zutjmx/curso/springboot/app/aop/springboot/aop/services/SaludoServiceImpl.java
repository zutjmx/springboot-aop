package com.zutjmx.curso.springboot.app.aop.springboot.aop.services;

import org.springframework.stereotype.Service;

import com.github.javafaker.Faker;

@Service
public class SaludoServiceImpl implements SaludoService {

    @Override
    public String decirHola(String persona, String frase) {
        return frase + " " + persona + ", Cita Marvin: " + Faker.instance().hitchhikersGuideToTheGalaxy().marvinQuote();
    }

}
