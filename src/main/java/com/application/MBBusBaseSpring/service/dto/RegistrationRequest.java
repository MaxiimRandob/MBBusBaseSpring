package com.application.MBBusBaseSpring.service.dto;

import com.application.MBBusBaseSpring.controller.dto.RegistrationForm;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;


public class RegistrationRequest {

    private String first_name;

    private String second_name;

    private String login;

    private String password;

    private String email;

    private String role;

    private String password_confirm;

    public RegistrationRequest() {
    }

    public RegistrationRequest(String first_name, String second_name, String login, String password, String email, String role, String password_confirm) {
        this.first_name = first_name;
        this.second_name = second_name;
        this.login = login;
        this.password = password;
        this.email = email;
        this.role = role;
        this.password_confirm = password_confirm;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getSecond_name() {
        return second_name;
    }

    public void setSecond_name(String second_name) {
        this.second_name = second_name;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getPassword_confirm() {
        return password_confirm;
    }

    public void setPassword_confirm(String password_confirm) {
        this.password_confirm = password_confirm;
    }
}
