package com.application.MBBusBaseSpring.service.dto;

public class UpdateProfileRequest {

    private String first_name;

    private String last_name;

    private String login;

    public UpdateProfileRequest() {
    }

    public UpdateProfileRequest(String first_name, String last_name, String login) {
        this.first_name = first_name;
        this.last_name = last_name;
        this.login = login;
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
