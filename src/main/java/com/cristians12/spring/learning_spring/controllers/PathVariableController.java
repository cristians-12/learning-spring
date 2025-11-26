package com.cristians12.spring.learning_spring.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cristians12.spring.learning_spring.models.dto.ParamDTO;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
@RequestMapping("/api/variable")
public class PathVariableController {
    @GetMapping("/{param}")
    public ParamDTO example(@PathVariable String param) {
        ParamDTO param1 = new ParamDTO();
        param1.setInformation(param);
        return param1;
    }

}
