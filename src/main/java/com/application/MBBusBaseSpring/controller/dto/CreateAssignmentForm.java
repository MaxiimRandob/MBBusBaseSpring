package com.application.MBBusBaseSpring.controller.dto;

import com.application.MBBusBaseSpring.entity.Bus;
import com.application.MBBusBaseSpring.entity.Driver;
import com.application.MBBusBaseSpring.entity.Route;

import javax.validation.constraints.NotNull;

public class CreateAssignmentForm {
    @NotNull
    public String busId;

    @NotNull
    public String driverId;

    @NotNull
    public String routeId;

    public CreateAssignmentForm() {
    }

    public CreateAssignmentForm(@NotNull String busId, @NotNull String driverId, @NotNull String routeId) {
        this.busId = busId;
        this.driverId = driverId;
        this.routeId = routeId;
    }

    public String getBusId() {
        return busId;
    }

    public void setBusId(String busId) {
        this.busId = busId;
    }

    public String getDriverId() {
        return driverId;
    }

    public void setDriverId(String driverId) {
        this.driverId = driverId;
    }

    public String getRouteId() {
        return routeId;
    }

    public void setRouteId(String routeId) {
        this.routeId = routeId;
    }
}
