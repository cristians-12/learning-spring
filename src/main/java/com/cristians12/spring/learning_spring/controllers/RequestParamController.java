package com.cristians12.spring.learning_spring.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cristians12.spring.learning_spring.models.dto.ParamDTO;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
@RequestMapping("/api/params")
public class RequestParamController {
    @GetMapping("/detail")
    public ParamDTO getMethodName(
            @RequestParam(defaultValue = "Hola", required = false) String param) {

        ParamDTO parametro = new ParamDTO();
        parametro.setInformation(param);
        return parametro;
    }

}
