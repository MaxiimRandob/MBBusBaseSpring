package com.application.MBBusBaseSpring.controller.dto;

import com.application.MBBusBaseSpring.controller.HomeController;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Objects;

public class LoginForm {
    private static final Logger LOG = LogManager.getLogger(HomeController.class);

    private String login;
    private String password;

    public LoginForm() {
        LOG.info("Inside LoginForm constructor");
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

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        LoginForm loginForm = (LoginForm) o;
        return Objects.equals(login, loginForm.login) && Objects.equals(password, loginForm.password);
    }

    @Override
    public int hashCode() {
        return Objects.hash(login, password);
    }

    @Override
    public String toString() {
        return "LoginForm{" + "username='" + login + '\'' + ", password='" + password + '\'' + '}';
    }
}
