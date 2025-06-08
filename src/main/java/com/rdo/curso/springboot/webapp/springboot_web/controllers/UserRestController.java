package com.rdo.curso.springboot.webapp.springboot_web.controllers;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

// Se seguirá el patron MVC

@RestController // Indica a Spting que es un API Rest Controlador (Se introduce a mano)
public class UserRestController {

    @GetMapping("/details") // Va a manejar una petición request. Se indica la ruta (que debe llevar a "src/main/resources/details.html") Y se enviarán datos a la vista
    public String details() {        
        Map<String, Object> body = new HashMap<>();
                        //    key           value
        body.put("title", "Hello World from Controller");
        body.put("name", "Roberto");
        body.put("lastname", "Díaz");

        return "details";   // retturn debe contener exactamente el mismo nombre que el fichero al que apunta, la vista (details.html)
    }
}