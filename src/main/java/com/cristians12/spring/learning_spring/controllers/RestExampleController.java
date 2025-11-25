package com.cristians12.spring.learning_spring.controllers;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cristians12.spring.learning_spring.models.Employee;

@RestController
@RequestMapping("/api")
public class RestExampleController {

    // @GetMapping("/employees")
    @RequestMapping(path = "/employees", method = RequestMethod.GET)
    public Map<String, Object> get() {
        Employee employee1 = new Employee("Cristian", "Sanchez", "Cra 19D", "Developer", 3000, 24);
        Map<String, Object> response = new HashMap();
        response.put("employee", employee1);
        return response;
    }

}
