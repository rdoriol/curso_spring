package com.rdo.curso.springboot.webapp.springboot_web.controllers;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.rdo.curso.springboot.webapp.springboot_web.models.User;

// Se seguirá el patron MVC

@Controller // Indica a Spting que es un controlador (Se introduce a mano)
public class UserController {

    @GetMapping("/details") // Va a manejar una petición request. Se indica la ruta (que debe llevar a "src/main/resources/details.html") Y se enviarán datos a la vista
    public String details(Model model) {        
                        //    key           value
        model.addAttribute("title", "Hello World from Controller");
        User user = new User("Juana", "Oriol Salvador");
        model.addAttribute("user", user); 

        return "details";   // retturn debe contener exactamente el mismo nombre que el fichero al que apunta, la vista (details.html)
    }

        // Alternativa al método anterior para enviar datos a la vista
    @GetMapping("/details****") // Va a manejar una petición request. Se indica la ruta (que debe llevar a "src/main/resources/details.html") Y se enviarán datos a la vista
    public String details2(Map<String, Object> model ) {        
                        //    key           value
        model.put("title", "Hello World from Controller");
        model.put("nameMap", "Lucía");
        model.put("nameMap2", "Darío");
    
        return "details****";   // retturn debe contener exactamente el mismo nombre que el fichero al que apunta, la vista (details.html)
    }
}
