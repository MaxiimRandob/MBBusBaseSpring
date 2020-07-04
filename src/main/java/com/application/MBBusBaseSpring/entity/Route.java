package com.application.MBBusBaseSpring.entity;

import javax.persistence.*;

@Entity
@Table(name = "route")
public class Route {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String name;

    public Route() {
    }

    public int getId() {
        return id;
    }

    public void setId(int idRoute) {
        this.id = idRoute;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
