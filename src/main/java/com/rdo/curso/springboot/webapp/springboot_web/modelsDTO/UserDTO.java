package com.rdo.curso.springboot.webapp.springboot_web.modelsDTO;

import com.rdo.curso.springboot.webapp.springboot_web.models.UserModel;

public class UserDTO {

    private String title;
    private UserModel user;
    
    public UserDTO() {        
    }
    public UserDTO(String title, UserModel user) {
        this.title = title;
        this.user = user;
    }
    public String getTitle() {
        return this.title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public UserModel getUser() {
        return this.user;
    }
    public void setUserModel(UserModel user) {
        this.user = user;
    }
}
