package com.cristians12.spring.learning_spring.controllers;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.cristians12.spring.learning_spring.models.Employee;

@Controller
public class EjemploController {

    @GetMapping("/info")
    public String info(Map<String, Object> modelo) {

        modelo.put("nombre", "Cristian");
        modelo.put("titulo", "Primera pagina");

        return "detalles-info";
    }

    @ModelAttribute("Employees")
    public List<Employee> ListaEmpleados() {
        return Arrays.asList(
                new Employee("Pedro", "Perez", "Calle 9", "Desarrollador", 30, 40));
    }
}
