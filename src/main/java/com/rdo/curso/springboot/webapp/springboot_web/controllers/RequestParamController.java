package com.rdo.curso.springboot.webapp.springboot_web.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.rdo.curso.springboot.webapp.springboot_web.modelsDTO.ParamDto;

@RestController
@RequestMapping("/api/params")
public class RequestParamController {

        /* **************************************************************************************************************************************
              Enviar parámetros a través de la url, se puede utilizar la anotación/directiva @RequesParam tipoVariable nombreParámetro
                En el navegador se debe escribir la ruta completa seguida de ?nombreParámetro=el texto que se quiera pasar
                Devolverá un json    
        ***************************************************************************************************************************************** */

    @GetMapping("/foo")                                    // configuraciones opcionales de @RequestParam                      // Parámetro obligatorio (por convención no utilizar conf.opcional name="")
    public ParamDto foo(@RequestParam(required = false, defaultValue = "Sin mensaje", name = "message_2") String message_1) {
        
        ParamDto param = new ParamDto(message_1);            
        // ParamDto param = new ParamDto(message!= null ? message : "Sin mensaje"); --> Para controlar el mensaje devuelto a través de operador ternario

        return param;
    }

    @GetMapping("/multiple-params")
    public ParamDto multiple(@RequestParam String text, @RequestParam int code) {
        ParamDto params = new ParamDto();
        params.setMessage(text);
        params.setCode(code);

        return params;
    }

}


