package com.application.MBBusBaseSpring.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "route")
public class Route {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column
    private String name;

    @OneToMany(mappedBy = "route")
    private List<Bus> buses;

    @Column(name = "work_load")
    private Integer workLoad;

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

    public List<Bus> getBuses() {
        return buses;
    }

    public void setBuses(List<Bus> buses) {
        this.buses = buses;
    }

    public Integer getWorkLoad() {
        return workLoad;
    }

    public void setWorkLoad(Integer workLoad) {
        this.workLoad = workLoad;
    }
}
