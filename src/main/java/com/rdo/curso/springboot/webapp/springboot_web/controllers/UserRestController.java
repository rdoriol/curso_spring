package com.rdo.curso.springboot.webapp.springboot_web.controllers;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rdo.curso.springboot.webapp.springboot_web.models.User;

// Se seguirá el patron MVC

@RestController // Indica a Spting que es un API Rest Controlador (Se introduce a mano). Este controlador es una mezcla de @Controller + @ReponseBody
@RequestMapping("/api") // Ruta base (o de primer nivel). Entonces, la url a escribir sería xxx/api/nombre_del_método_en_@GetMapping
public class UserRestController {

    @GetMapping("/details2") // Va a manejar una petición request. Se indica la ruta y se enviará un Json. En este caso no necesita ninguna ruta a un template html/vista. 
                            //Es un alias de @RequestMapping. Equivale a @RequestMapping(path = "/details", metohd = RequestMethod.GET)
    public Map<String, Object> details2() {    

        Map<String, Object> body = new HashMap<>();
                        //    key           value
        body.put("title", "Hello World from RestController");
        body.put("name", "Roberto");
        body.put("lastname", "Díaz");

        return body;   // return debe ser el objeto que queremos enviar, en este caso un HashMap
    }
        
        // Ejemplo obteniendo los datos del package Model (implementando patrón MVC)
    @GetMapping("/detailsFromModel")
    public Map<String, Object> detailsFromModel() {

        User user = new User("Lucía", "Díaz Durán");
        User user2 = new User("Darío", "Díaz Durán");

        Map<String, Object> body = new HashMap<>();
        body.put("user", user);
        body.put("user2", user2);
        
        return body;
    }

}   // end class UserRestController