package com.cristians12.spring.learning_spring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class EjemploController {

    @GetMapping("/detalles-info")
    public String info(Model model) {
        model.addAttribute("Titulo", "Mi primera vista");
        model.addAttribute("Text1", "Texto enviado desde controllador");
        return "detalles-info";
    }

}
