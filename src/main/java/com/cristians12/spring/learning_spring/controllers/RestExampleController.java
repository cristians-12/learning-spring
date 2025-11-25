package com.cristians12.spring.learning_spring.controllers;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestExampleController {

    @GetMapping("/employees")
    public Map<String, Object> get() {
        Map<String, Object> response = new HashMap();
        response.put("nombre", "Cristian");
        response.put("edad", 24);
        return response;
    }

}
