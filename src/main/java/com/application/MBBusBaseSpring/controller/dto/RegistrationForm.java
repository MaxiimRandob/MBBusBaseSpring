package com.application.MBBusBaseSpring.controller.dto;

import com.sun.istack.NotNull;

public class RegistrationForm {
    @NotNull
    private String first_name;
    @NotNull
    private String second_name;
    @NotNull
    private String login;
    @NotNull
    private String password;
    @NotNull
    private String email;
    private String password_confirm;

    public RegistrationForm() {
    }

    public RegistrationForm(@NotNull String first_name, @NotNull String second_name, @NotNull String login, @NotNull String password, @NotNull String email, String password_confirm) {
        this.first_name = first_name;
        this.second_name = second_name;
        this.login = login;
        this.password = password;
        this.email = email;
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


    public String getPassword_confirm() {
        return password_confirm;
    }

    public void setPassword_confirm(String password_confirm) {
        this.password_confirm = password_confirm;
    }
}
