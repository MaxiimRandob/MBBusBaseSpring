package com.application.MBBusBaseSpring.service.user;

import com.application.MBBusBaseSpring.controller.dto.RegistrationForm;
import com.application.MBBusBaseSpring.entity.Admin;
import com.application.MBBusBaseSpring.entity.Driver;
import com.application.MBBusBaseSpring.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import javax.validation.Valid;


public class RegistrationRequest {

    private String role;

    private RegistrationForm form;

    public RegistrationRequest() {
    }

    public RegistrationRequest validateUserByRole(@Valid RegistrationForm form) {
        if (form.getRole().equalsIgnoreCase("admin")) {
            this.role = "ADMIN";
        } else if (form.getRole().equalsIgnoreCase("driver")) {
            this.role = "DRIVER";
        }

        this.form = form;
        return this;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public RegistrationForm getForm() {
        return form;
    }

    public void setForm(RegistrationForm form) {
        this.form = form;
    }
}
