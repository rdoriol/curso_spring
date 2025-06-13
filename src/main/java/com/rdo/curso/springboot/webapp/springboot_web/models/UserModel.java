package com.rdo.curso.springboot.webapp.springboot_web.models;

public class UserModel {

    private String name;
    private String lastname;

     public UserModel(String name, String lastname) {
     this.name = name;
     this.lastname = lastname;
    }
    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getLastname () {
        return this.lastname;
    }
    public void setLasName(String lastname) {
        this.lastname = lastname;
    }
}
