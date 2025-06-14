package com.rdo.curso.springboot.webapp.springboot_web.models;

public class UserModel {

    private String name;
    private String lastname;
    private String email;

     public UserModel(String name, String lastname, String email ) {
     this.name = name;
     this.lastname = lastname;
     this.email = email;
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
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    
}   // end class UserModel
