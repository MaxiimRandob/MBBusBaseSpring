package com.application.MBBusBaseSpring.entity;



import javax.persistence.*;

@Entity
@Table(name = "bus")
public class Bus {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column
    private String name;

    @Column
    private String model;

    @ManyToOne
    @JoinColumn(name = "route_id")
    private Route route;

    @OneToOne(mappedBy = "bus")
    private Driver driver;

    public Bus() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Route getRoute() {
        return route;
    }

    public void setRoute(Route route) {
        this.route = route;
    }
}
