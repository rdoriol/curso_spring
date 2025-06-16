package com.rdo.curso.springboot.webapp.springboot_web.controllers;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.rdo.curso.springboot.webapp.springboot_web.models.UserModel;

// Se seguirá el patron MVC

@Controller // Indica a Spting que es un controlador (Se introduce a mano)
public class UserController {

    @GetMapping("/details") // Va a manejar una petición request. Se indica la ruta (que debe llevar a "src/main/resources/details.html") Y se enviarán datos a la vista
    public String details(Model model) {        
                        //    key           value
        model.addAttribute("title", "Hello World from Controller");
        UserModel user = new UserModel("Juana", "Oriol Salvador", "juanaoriol@gmail.com");
        model.addAttribute("user", user); 

        return "details";   // return debe contener exactamente el mismo nombre que el fichero de la vista al que apunta (details.html)
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

        // Para implementar listados que puedan venir de cualquier fuente de datos (ejem. del modelo provenientes de una bbdd, etc)
    /*@GetMapping("/list")
    public String listUsers(ModelMap model) {
        UserModel user = new UserModel("Darío", "Díaz");
        UserModel user2 = new UserModel("Lucía", "Díaz", "ldiadur2805@e.educaand.es");
        UserModel user3 = new UserModel("Sandra", "Durán", "sandra.duranolivencia@gmail.com");
        UserModel user4 = new UserModel("Roberto", "Díaz", "rdoriol@gmail.com");

        List<UserModel> listUsers = Arrays.asList(user, user2, user3, user4);

        model.addAttribute("users", listUsers);
        model.addAttribute("title", "Users List");

        return "list";
    }*/

        // Ejemplo para almacenar datos en un componente y que puedan ser reutilizados en cualquier parte de la aplicación
    @ModelAttribute("users")    // Se accede desde la vista pasando como objeto "users"
    public List<UserModel> storeUsersList() {
        List<UserModel> listUsers = Arrays.asList(
            new UserModel("Roberto", "Díaz"),
            new UserModel("Sandra", "Durán", "s.durano@gm.com"));

            return listUsers;
   }
        // Para utilizar el método anterior storeUsersList()
    @GetMapping("/list")
    public String listUsersModelAttribute(ModelMap model) {
        model.addAttribute("title", "User List from @ModelAttribute");

        return "list";
    }




}  // end class UserController
