package com.holamundo.ejemplo.holamundo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HolaMundoController {

    @GetMapping("/hola")
    public String hola() {
        return "Hola, estás en la ruta /hola!";
    }
    @GetMapping("/")
    public String menu() {
        return "Hola, este es el directorio principal";
    }
    
    
}
