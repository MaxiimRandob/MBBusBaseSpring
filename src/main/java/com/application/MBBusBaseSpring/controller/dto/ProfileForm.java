package com.application.MBBusBaseSpring.controller.dto;

import javax.validation.constraints.NotNull;

public class ProfileForm {
    @NotNull
    private String first_name;
    @NotNull
    private String last_name;
    @NotNull
    private String login;

    public ProfileForm() {
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

}
