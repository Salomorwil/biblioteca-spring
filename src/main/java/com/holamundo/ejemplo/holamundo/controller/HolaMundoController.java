package com.holamundo.ejemplo.holamundo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;




@RestController
@RequestMapping("/api")
public class HolaMundoController {


    @GetMapping("/hola")
    public String hola() {
        return "Hola, estás en la ruta /hola!";
    }
    @GetMapping("/")
    public String menu() {
        return "Hola, este es el directorio principal";
    }


    @GetMapping("/{nombre}")
    public String obtenerRuta(@PathVariable String nombre) {
        return "Hola a todos, mi nombre es " + nombre;
    }
    @GetMapping("/suma")
    public String suma(){
        int n1 = 10;
        int n2 = 2;
        return Integer.toString(n1) + " + "+Integer.toString(n2)+" = "+Integer.toString(n1+n2);
    }
    @GetMapping("/resta")
    public String resta(){
        int n1 = 10;
        int n2 = 2;
        return Integer.toString(n1) + " - "+Integer.toString(n2)+" = "+Integer.toString(n1-n2);
    }
    @GetMapping("/multiplicacion")
    public String multiplicacion(){
        int n1 = 10;
        int n2 = 2;
        return Integer.toString(n1) + " * "+Integer.toString(n2)+" = "+Integer.toString(n1*n2);
    }
    @GetMapping("/division")
    public String division(){
        int n1 = 10;
        int n2 = 2;
        return Integer.toString(n1) + " / "+Integer.toString(n2)+" = "+Integer.toString(n1/n2);
    }
    @GetMapping("/calculo/{n1}+{n2}")
    public String suma(@PathVariable int n1,@PathVariable int n2){
        return Integer.toString(n1) + " + "+Integer.toString(n2)+" = "+Integer.toString(n1+n2);
    }
    @GetMapping("/calculo/{n1}-{n2}")
    public String resta(@PathVariable int n1,@PathVariable int n2){
        return Integer.toString(n1) + " - "+Integer.toString(n2)+" = "+Integer.toString(n1-n2);
    }
    @GetMapping("/calculo/{n1}/{n2}")
    public String division(@PathVariable int n1,@PathVariable int n2){
        return Integer.toString(n1) + " / "+ Integer.toString(n2)+" = "+Float.toString(n1/n2);
    }
    @GetMapping("/calculo/{n1}x{n2}")
    public String multiplicacion(@PathVariable int n1,@PathVariable int n2){
        return Integer.toString(n1) + " * "+ Integer.toString(n2)+" = "+Integer.toString(n1*n2);
    }


    }
