package com.cristians12.spring.learning_spring.controllers;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cristians12.spring.learning_spring.models.Employee;
import com.cristians12.spring.learning_spring.models.dto.ClaseDTO;

@RestController
@RequestMapping("/api")
public class RestExampleController {

    // @GetMapping("/employees")
    @RequestMapping(path = "/employees", method = RequestMethod.GET)
    public ClaseDTO get() {
        ClaseDTO usuario1 = new ClaseDTO();
        usuario1.setTitulo("Poema");
        usuario1.setUsuario("Prueba");
        return usuario1;
    }

}
