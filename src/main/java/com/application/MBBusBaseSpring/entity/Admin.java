package com.application.MBBusBaseSpring.entity;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("1")
public class Admin extends User{
    public Admin() {
    }

    public Admin(String firstName, String secondName, String login, String password, String role) {
        super(firstName, secondName, login, password, role);
    }
}
