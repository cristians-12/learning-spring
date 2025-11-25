package com.cristians12.spring.learning_spring.controllers;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class EjemploController {

    @GetMapping("/info")
    public String info(Map<String, Object> modelo) {

        modelo.put("nombre", "Cristian");
        modelo.put("titulo", "Primera pagina");

        return "detalles-info";
    }

}
