package com.rdo.curso.springboot.webapp.springboot_web.modelsDTO;

public class ParamDto {

    private String message;
    private int code;

    public ParamDto() {
    }

    public ParamDto(String message) {
        this.message = message;
    }

    public ParamDto(String message, int code) {
        this.message = message;
        this.code = code;
    }

    public String getMessage() {
        return this.message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    

}
