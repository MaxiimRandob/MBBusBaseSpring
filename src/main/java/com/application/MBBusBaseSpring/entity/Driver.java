package com.application.MBBusBaseSpring.entity;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("2")
public class Driver extends User {
    public Driver() {
    }

    public Driver(String firstName, String secondName, String login, String password, String role) {
        super(firstName, secondName, login, password, role);
    }
}
