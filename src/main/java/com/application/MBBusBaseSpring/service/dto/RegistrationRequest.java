package com.application.MBBusBaseSpring.service.dto;


public class RegistrationRequest {

    private String first_name;

    private String last_name;

    private String login;

    private String password;

    private String role;

    private String password_confirm;

    public RegistrationRequest() {
    }

    public RegistrationRequest(String first_name, String last_name, String login, String password, String role, String password_confirm) {
        this.first_name = first_name;
        this.last_name = last_name;
        this.login = login;
        this.password = password;
        this.role = role;
        this.password_confirm = password_confirm;
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
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
