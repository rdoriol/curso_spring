package com.rdo.curso.springboot.webapp.springboot_web.controllers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rdo.curso.springboot.webapp.springboot_web.models.UserModel;
import com.rdo.curso.springboot.webapp.springboot_web.modelsDTO.UserDTO;

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
        UserModel user = new UserModel("Lucía", "Díaz Durán", "ldiadur@gmail.com");
        UserModel user2 = new UserModel("Darío", "Díaz Durán", null);

        Map<String, Object> body = new HashMap<>();
        body.put("user", user);
        body.put("user2", user2);
        
        return body;
    }

        //Ejemplo de método obteniendo datos del Model con clase DTO (UserDTO.java)
    @GetMapping("/detalisFromModelUserDto")
    public UserDTO detailsFromUModelUserDto() {
        UserDTO userDto = new UserDTO();
        UserModel user = new UserModel("Roberto", "Díaz", "rdoriol@gmail.com");

        userDto.setTitle("Datos Usuario");
        userDto.setUserModel(user);

        return userDto;
    }

    @GetMapping("/details-list-user")
    public List<UserModel> listUsers() {
        UserModel user = new UserModel("Darío", "Díaz", null);
        UserModel user2 = new UserModel("Lucía", "Díaz", "ldiadur2805@gmail.com");
        UserModel user3 = new UserModel("Sandra", "Durán", "sandra.duranolivencia@gmail.com");
        UserModel user4 = new UserModel("Roberto", "Díaz", "rdoriol@gmail.com");

       /*  List<UserModel> listUsers = new ArrayList<>();
        listUsers.add(user);
        listUsers.add(user2);
        listUsers.add(user3);
        listUsers.add(user4);
        */
            // Alternativa al bloque anterior para añadir elementos a un ArrayList. Método Arrays.asList()
        List<UserModel> listUsers = Arrays.asList(user, user2, user3, user4);

        return listUsers;        
    }

}   // end class UserRestController