package com.zutjmx.curso.springboot.app.aop.springboot.aop.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class SaludoAspect {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Before("execution(String com.zutjmx.curso.springboot.app.aop.springboot.aop.service.SaludoService.saludar(..))")
    public void loggerBefore(JoinPoint joinPoint) {
        String nombreMetodo = joinPoint.getSignature().getName();
        String args = joinPoint.getArgs().toString();
        logger.info("Antes de ejecutar el metodo: " + nombreMetodo + " con los argumentos: " + args);                
    }

}
