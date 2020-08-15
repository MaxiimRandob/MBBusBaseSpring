package com.application.MBBusBaseSpring.controller.dto;

import javax.validation.constraints.NotNull;

public class ProfileForm {
    @NotNull
    private String first_name;
    @NotNull
    private String second_name;
    @NotNull
    private String email;
    @NotNull
    private String login;

    public ProfileForm() {
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
