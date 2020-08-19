package com.application.MBBusBaseSpring.service.dto;

import javax.validation.constraints.NotNull;

public class UpdateProfileRequest {

    private String first_name;

    private String second_name;

    private String email;

    private String login;

    public UpdateProfileRequest() {
    }

    public UpdateProfileRequest( String first_name,  String second_name,  String email,  String login) {
        this.first_name = first_name;
        this.second_name = second_name;
        this.email = email;
        this.login = login;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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
}
